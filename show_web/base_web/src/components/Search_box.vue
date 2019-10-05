<template>
  <div class="search">
    <form>
    <input class="input1" type="text"/>
    <input class="input2" type="submit" value="搜索"/>
    </form>
  </div>
</template>
<script>
export default {
  name:"Search"
}
</script>
<style scoped>
*{
  margin: 0;
  padding: 0;
}
.search{
  height:auto;
  width: 750px;
  display: flex;
}
.search .input1{
  height: 53px;
  float: left;
  width: 630px;
  border-top-left-radius:20px;
  border: 1px solid #5d707e;
  border-bottom-left-radius:20px;
  outline: none;
  padding-left: 10px;
  font-size: 25px;
}
.search .input2{
  float: left;
  height: 55px;
  width: 105px;
  border-top-right-radius:20px;
  border-bottom-right-radius:20px;
  outline: none;
  border: 1px solid #5d707e;
  font-size: 25px;
  background-color: #1a243d;
  color: #eeeeee;
  margin: 0;
  padding: 0;
}
</style>
