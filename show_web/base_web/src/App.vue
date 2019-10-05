<template>
  <div id="app">
    <div id="nav">
      <router-link to="/">首页</router-link> 
      <router-link to="/news">新闻</router-link>
      <img src="./assets/img/center-icon.png"/>
      <router-link to="/data">资料</router-link>
      <router-link to="/result">关于我们</router-link>
    </div>
    <router-view/>
    <div class="footer">版权所有</div>
  </div>
</template>

<style lang="less">
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
#nav {
  padding: 30px;
  background-color: #183350;
  height:40px;
  display: flex;
  align-items: center;
  // align-content: center;
  justify-content:space-around;
  font-size:18px;
  font-weight:100;
  font-family: "等线";
  a {
    font-weight: bold;
    color: #ffffff;
    &.router-link-exact-active {
      color: #016eb1;
    }
  }
}
.footer{
  height: 50px;
  background-color: #000;
  line-height: 50px;
  color: #fff;
}
#nav > img{
  // margin:0 auto;
  z-index:10;
  width:130px;
  height:130px;
  margin-top:20px;
  // position: relative;
}
</style>
