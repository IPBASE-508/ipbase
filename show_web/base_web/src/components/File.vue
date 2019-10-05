<template>
  <div class="file">
    <router-link :to="{path:'/detail',query: {id: item.id}}"  class="content" v-for="item in content" :key="item.id"  id="item.id">
      <div class="left">
        <p class="title">{{item.name}}</p>
        <div class="bottom">
          <p class="time">{{item.createTime}}</p>
          <p class="number">{{item.id}}</p>
        </div>
      </div>
      <div class="center">{{item.brief}}</div>
      <div class="right">
        <a href="/#">下载</a>
      </div>
    </router-link>
    <br>
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
import axios from "axios";
export default {
  name: "File",
  data(){
    return{
      content: [],
      allDataNum: 0,
      page: 1,
      rows: 5,
      allPages: 0
    }
  },
  methods: {
    getData:function(p,r){
      axios({
      url:'/api/achievements/list',
      method:'get',
      params:{
        page:p,
        rows:r
      }
    }).then(
      res =>{
        this.content=res.data.data;
      },
      function(error) {
        console.log(error);
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
  mounted: function() {
    axios({
      url:'/api/achievements/list',
      method:'get',
      params:{
        page:this.page,
        rows:this.rows
      }
    }).then(
      res =>{
        console.log(res);
        this.content=res.data.data;
      },
      function(error) {
        console.log(error);
      }
    );
  }
};
</script>

<style scoped>
* {
  margin: 0;
  padding: 0;
}
.file {
  display: flex;
  flex-direction: column;
  width: 971px;
  max-height: 717px;
  margin: 0;
  padding: 0;
}
.file .content {
  flex-wrap: nowrap;
  display: flex;
  width: 971px;
  height: 94px;
  border: 1px solid #5bace4;
  background: #f3f1f1;
}
.content .left {
  width: 228px;
  height: 94px;
  display: flex;
  flex-direction: column;
  font-size: 22px;
  text-align: left;
}
.left .title {
  margin-top: 20px;
  padding: 0 0 0 20px;
  font-size: 18px;
  color: black;
}
.left .bottom {
  display: flex;
  padding: 0 0 0 10px;
  color: #9a9a9a;
}
.bottom * {
  padding: 0 10px 0 10px;
  font-size: 14px;
}
.content .center {
  margin-top: 20px;
  width: 620px;
  font-size: 16px;
  height: 94px;
  color: #9a9a9a;
}
.content .right {
  margin-top: 30px;
  color: #09375b;
  font-size: 22px;
}
a {
  text-decoration: none;
}
.right a{
  color: #09375b;
}
</style>
