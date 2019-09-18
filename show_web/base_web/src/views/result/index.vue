<template>
  <div>
    <img src="../../assets/img/background-head.jpg"/>
    <div class="text">
      <p>基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍
        基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍基地介绍</p>
    </div>
    <div class="result">
      <div class="left">
      <img src="../../assets/img/background-head.jpg"/>
      </div>
      <div class="right">
      <!-- <p>{{item.name}}</p>
      <p>{{item.brief}}</p> -->
      <p>成果展示</p>
      <p>成果介绍成果介绍成果介绍成果介绍成果介绍成果介绍成果介绍成果介绍成果介绍成果介绍</p>
      </div>
    </div>
    <div class="result">
      <div class="left">
      <img src="../../assets/img/background-head.jpg"/>
      </div>
      <div class="right">
      <!-- <p>{{item.name}}</p>
      <p>{{item.brief}}</p> -->
      <p>成果展示</p>
      <p>成果介绍成果介绍成果介绍成果介绍成果介绍成果介绍成果介绍成果介绍成果介绍成果介绍</p>
      </div>
    </div>
    <div class="result">
      <div class="left">
      <img src="../../assets/img/background-head.jpg"/>
      </div>
      <div class="right">
      <!-- <p>{{item.name}}</p>
      <p>{{item.brief}}</p> -->
      <p>成果展示</p>
      <p>成果介绍成果介绍成果介绍成果介绍成果介绍成果介绍成果介绍成果介绍成果介绍成果介绍</p>
      </div>
    </div>
    <div>
      
    </div>
    <!-- <web-footer></web-footer> -->
  </div>
</template>
<script>

//调用接口时使用
// import { getResult } from "..."; 
export default{
    name:"",
    components: {
      
    },
    // data () {
    // return {
    //   resultList: [],
    // }
    // },
    // mounted () {
    // getResult().then(res => {
    //   this.resultList = res.data
    // })
    // },
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
  height:150px;
  margin:0 auto;
  margin-top:20px;
  margin-bottom:10px;
  display:flex;
  flex-direction: row;
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
  font-weight: 800;
}
.right > p:nth-child(2){
  margin-top:5px;
  float: left;
  font-size:12px;
}
</style>
<style>
body{
  background-color:#a5bfd8;
}
</style>

