<template>
  <div id="app">
    <div id="nav">
      <router-link to="/">index</router-link> |
      <router-link to="/news">news</router-link>|
      <router-link to="/data">data</router-link>|
      <router-link to="/result">result</router-link>
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
  a {
    font-weight: bold;
    color: #2c3e50;
    &.router-link-exact-active {
      color: #42b983;
    }
  }
}
.footer{
  height: 50px;
  background-color: #000;
  line-height: 50px;
  color: #fff;
}

</style>
