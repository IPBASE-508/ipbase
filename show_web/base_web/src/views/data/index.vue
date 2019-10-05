<template>
  <div class="news">
    <div class="search">
      <Search/>
    </div>
    <div class="center">
      <div class="guide">
        <router-link to="/yunwei">运维部</router-link>
        <router-link to="/yunwei">产品部</router-link>
        <router-link to="/yunwei">研发部</router-link>
      </div>
      <div class="box">
        <router-view/>
      </div>
    </div>
    <About class="left"/>
  </div>
</template>
<script>
import Search from "@/components/Search_box.vue";
import About from "@/components/about.vue";
export default {
  name: "news",
  components: {
    Search,
    About
  }
};
</script>
<style scoped lang="less">
.news {
  margin: 0;
  padding: 0;
  width: 100%;
  height: auto;
  display: flex;
  flex-direction: column;
}
.news .search {
  padding: 50px 0 0 204px;
}
.news .center {
  width: 975px;
  height: auto;
  margin: 35px 0 0 178px;
  padding: 0;
}
.news .box {
  width: auto;
  height: auto;
}
.news .guide {
  width: 312px;
  height: 46px;
  display: flex;
}
.guide a {
  width: 104px;
  height: 46px;
  font: 25px bold;
  color: #5bace4;
  text-decoration: none;
  line-height: 1.7;
  background: transparent;
  &.router-link-exact-active {
    color: #eeeeee;
    background: #5bace4;
  }
}
.news .left {
  position: relative;
  width: 270px;
  text-align: left;
  height: auto;
  left: 1190px;
  top: -275px;
  display: flex;
  flex-direction: column;
}
</style>
