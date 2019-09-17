<template>
  <div class="file">
    <input value="获取文件" type="file" @change="changeData"/>
    <input value="测试" type="submit" @click="getData" />
    <div class="content">
      <div class="left">
        <p class="title">下载文件名</p>
        <div class="bottom">
          <p class="time">time</p>
          <p class="number">number</p>
        </div>
      </div>
      <div class="center">文件简介</div>
      <div class="right">
        <a href="/#/news">下载</a>
      </div>
    </div>
    <div class="content">
      <div class="left">
        <p class="title">下载文件名</p>
        <div class="bottom">
          <p class="time">time</p>
          <p class="number">number</p>
        </div>
      </div>
      <div class="center">文件简介</div>
      <div class="right">
        <a href="/#/news">下载</a>
      </div>
    </div>
    <div class="content">
      <div class="left">
        <p class="title">下载文件名</p>
        <div class="bottom">
          <p class="time">time</p>
          <p class="number">number</p>
        </div>
      </div>
      <div class="center">文件简介</div>
      <div class="right">
        <a href="/#/news">下载</a>
      </div>
    </div>
    <div class="content">
      <div class="left">
        <p class="title">下载文件名</p>
        <div class="bottom">
          <p class="time">time</p>
          <p class="number">number</p>
        </div>
      </div>
      <div class="center">文件简介</div>
      <div class="right">
        <a href="/#/news">下载</a>
      </div>
    </div>
    <div class="content">
      <div class="left">
        <p class="title">下载文件名</p>
        <div class="bottom">
          <p class="time">time</p>
          <p class="number">number</p>
        </div>
      </div>
      <div class="center">文件简介</div>
      <div class="right">
        <a href="/#/news">下载</a>
      </div>
    </div>
    <div class="content">
      <div class="left">
        <p class="title">下载文件名</p>
        <div class="bottom">
          <p class="time">time</p>
          <p class="number">number</p>
        </div>
      </div>
      <div class="center">文件简介</div>
      <div class="right">
        <a href="/#/news">下载</a>
      </div>
    </div>
    <div class="content">
      <div class="left">
        <p class="title">下载文件名</p>
        <div class="bottom">
          <p class="time">time</p>
          <p class="number">number</p>
        </div>
      </div>
      <div class="center">文件简介</div>
      <div class="right">
        <a href="/#/news">下载</a>
      </div>
    </div>
    <div class="content">
      <div class="left">
        <p class="title">下载文件名</p>
        <div class="bottom">
          <p class="time">time</p>
          <p class="number">number</p>
        </div>
      </div>
      <div class="center">文件简介</div>
      <div class="right">
        <a href="/#/news">下载</a>
      </div>
    </div>
    <div class="content">
      <div class="left">
        <p class="title">下载文件名</p>
        <div class="bottom">
          <p class="time">time</p>
          <p class="number">number</p>
        </div>
      </div>
      <div class="center">文件简介</div>
      <div class="right">
        <a href="/#/news">下载</a>
      </div>
    </div>
  </div>
</template>
<script>
import axios from "axios";
export default {
  name: "File",
  data(){
    return{
      file:[]
    }
  },
  methods: {
    changeData:e=>{
      let file1 =new File(e.target.files[0]);
      console.log(typeof file)
      axios.post("/api/file/mutiUpload/withName",{
        params: {
          file: file1
        }
      },{headers:{'Content-Type':'multipart/form-data'}}).then(res => {
        console.log(res);
      }),
      function(error) {
        console.log(error);
      };
    },
    getData: function() {
      axios({
        method: "post",
        url: "/api/file/mutiUpload/withName",
        params: {
          file: file
        }
      }).then(res => {
        console.log(res);
      });
    }
  },
  // mounted: function() {
  //   axios.get("/api/role/one", { params: { id: 1 } }).then(
  //     function(res) {
  //       console.log(res);
  //     },
  //     function(error) {
  //       console.log(error);
  //     }
  //   );
  // }
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
}
.left .bottom {
  display: flex;
  padding: 0 0 0 10px;
  color: #9a9a9a;
}
.bottom * {
  padding: 0 10px 0 10px;
  font-size: 16px;
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
</style>
