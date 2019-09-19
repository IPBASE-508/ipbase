<template>
  <div>
    <img src="../../assets/img/background-head.jpg"/>
    <div class="text">
      <p>基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍
        基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍</p>
    </div>
    <div class="result" v-for="(item,index) in resultList"
    :key="index">
      <!-- <div class="left">
      <img src="../../assets/img/background-head.jpg"/>
      </div> -->
      <div class="right">
      <p>{{item.name}}</p>
      <p>{{item.brief}}</p>
      <!-- <p>成果展示</p>
      <p>成果介绍成果介绍成果介绍成果介绍成果介绍成果介绍成果介绍成果介绍成果介绍成果介绍</p> -->
      </div>
    </div>
    <div class="foot">
      <div class="foot-left">
        <img src="../../assets/img/code.png"/>
      </div>
      <div class="foot-right">
        <p>联系我们</p>
        <p>邮箱 12345678@ipbase.com</p>
        <p>电话 1234567893</p>
        <p>地址 广州中医药大学工科楼508</p>
        <p>邮编 516001</p>
      </div>
    </div>
    <div>
      
    </div>
    <!-- <web-footer></web-footer> -->
  </div>
</template>
<script>

//调用接口时使用
export default{
    name:"",
    components: {
      
    },
    data () {
    return {
      resultList: [],
    }
    },
    mounted () {
    this.$http.get("/api/achievements/list").then(res => {
      this.resultList = res.data.data
      // console.log(res.data.data[0].name)
    })
    },
}
</script>
<style scoped>
img{
  width:100%;
  height:230px;
}
.text{
  background-color:#000711;
  width:100%;
  height:100px;
  text-align:center;
  margin-top:-8px;
}
.text > p{
  margin:0;
  padding:20px 300px;
  font-size:14px;
  color:#fff;
}
.result{
  width:60%;
  background-color:#fff;
  height:200px;
  margin:0 auto;
  margin-top:20px;
  margin-bottom:20px;
  display:flex;
  flex-direction: row;
  border-radius:10px;
  /* box-shadow: 1 2 10px #000 inset; */
}
.left > img{
  width:150px;
  height:100px;
  margin:25px 20px 25px 20px;
}
.right{
  display:flex;
  flex-direction: column;
  align-items: flex-start;
}
.right > p:first-child{
  padding-top:30px;
  padding-left:30px;
  font-weight: 800;
  font-size:28px;
}
.right > p:nth-child(2){
  margin-top:25px;
  padding-left:30px;
  float: left;
  font-size:12px;
}
.foot{
  display: flex;
  margin:0 auto;
  justify-content: center;
  margin-bottom:30px;
}
.foot-left > img{
  width:100px;
  height:100px;
}
.foot-right{
  display: flex;
  flex-direction: column;
  align-items: flex-start;
  margin-left: 45px;
  line-height: 20px;
}
.foot-right > p:first-child{
  font-weight:bold;
}
</style>
<style>
body{
  background-color:#a5bfd8;
}
</style>

