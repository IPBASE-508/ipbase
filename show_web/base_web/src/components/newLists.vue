<template>
  <div>
    <div class="news-nL-box" v-for="item in content" :key="item.id">
      <p class="news-nL-title">{{item.title}}</p>
      <p class="news-nL-msg">
        <span class="news-nL-msg-text">{{item.createTime|time}}</span>
        <span class="news-nL-msg-text">阅读量：{{item.visit}}</span>
      </p>
      <div class="news-nL-content">
        <span>{{item.brief}}</span>
      </div>
      <a href="#">
        <span class="news-nL-detail">详情</span>
      </a>
    </div>
    <div class="new-nL-page-box">
      <div class="new-nL-page-lbox">
        <button v-show="page!=1" @click="lastPage" class="new-nL-btn new-nL-btn-l">上一页</button>
        <span class="new-nL-page-span">第 {{page}} 页</span>
        <button v-show="page!=allPages" @click="nextPage" class="new-nL-btn new-nL-btn-n">下一页</button>
      </div>
      <span class="new-nL-allPage-span">共 {{allPages}} 页</span>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      content: [],
      allDataNum: 0,
      page: 1,
      rows: 3,
      allPages: 0
    };
  },
  mounted: function() {
    this.$http
      .get("/api/news/brief/list?page=" + this.page + "&rows=" + this.rows)
      .then(
        response => {
          console.log(response);
          this.content = response.body.data;
          this.allDataNum = response.body.allDataNum;
          this.allPages = Math.ceil(response.body.allDataNum / this.rows);
        },
        response => {
          console.log(response);
        }
      );
  },
  methods: {
    getData: function(p, r) {
      this.$http.get("/api/news/brief/list?page=" + p + "&rows=" + r).then(
        response => {
          console.log(response);
          this.content = response.body.data;
          this.allDataNum = response.body.allDataNum;
        },
        response => {
          console.log(response);
        }
      );
    },
    nextPage: function() {
      this.page++;
      this.getData(this.page, this.rows);
    },
    lastPage: function() {
      this.page--;
      this.getData(this.page, this.rows);
    }
  },
  components: {},
  filters: {
    time: function time(value) {
      var d = new Date(value);
      return (
        d.getFullYear() +
        "-" +
        (d.getMonth() + 1 > 9 ? d.getMonth() + 1 : "0" + (d.getMonth() + 1)) +
        "-" +
        (d.getDate() > 9 ? d.getDate() : "0" + d.getDate())
      );
    }
  }
};
</script>

<style>
</style>
