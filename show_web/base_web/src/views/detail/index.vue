<template>
  <div class="detail">
    <div class="big_box">
      <div class="head">
        <div class="title">{{content.name}}</div>
        <div class="down">
          <div class="time">{{content.createTime}}</div>
          <div class="time">阅读量：{{content.ids}}</div>
        </div>
      </div>
      <div class="content">{{content.message}}</div>
    </div>
    <About class="left"/>
  </div>
</template>
<script>
import About from "@/components/about.vue";
import axios from "axios";
export default {
  name: "detail",
  data(){
    return{
      content:[],
      id:''
    }
  },
  components: {
    About
  },
  mounted:function(){
    this.id=this.$route.query.id;
    axios({
      url:'/api/achievements/one',
      method:'get',
      params:{
        id:this.$route.query.id
      }
    }).then(
      res=>{
        this.content=res.data.data
        console.log(res)
      }),
      function(err){
        console.log(err)
      }
  }
};
</script>
<style scoped>
.detail {
  background-color: #a5bfd8;
  padding:80px 0 0 0;
}
.big_box {
  width: 950px;
  min-height: 1000px;
  height: auto;
  padding: 24px;
  background-color: white;
  position: relative;
  left: 10%;
}
.head {
  text-align: left;
  width: 100%;
  font-size: 25px;
  color: #a9aeb4;
}
.title {
  width: 100%;
  font-size: 40px;
  color: black;
}
.down{
  width: 100%;
  float: left;
}
.time {
  width: auto;
  float: left;
  margin: 0 10px 0 0;
}
.content{
  margin: 50px 0 0 0;
  width: 100%;
  height: auto;
  float: left;
  font-size: 30px;
  color: #626574;
  text-align: left;
}
.left {
  position: relative;
  width: 270px;
  text-align: left;
  height: auto;
  left: 1190px;
  top: -1060px;
  display: flex;
  flex-direction: column;
  float: left;
}
</style>