<template>
  <div id="app" class="body">
    <VueCarousel
      :imgs="imgs"
    :delay="2000"
    :imgWidth="1960"
    :imgHeight="747"
    :dotWidth="20"
    />

  </div>
</template>

<script>
  import VueCarousel from '../../../src/components/indexpicture.vue'

  export default {
    name: 'app',
    components: {
      VueCarousel
    },
    data () {
      return {
        imgs:[
          {src: require('../../../src/assets/img/background-head.jpg')},
          {src: require('../../../src/assets/img/news.png')},

        ]
      }
    }
  }
</script>

<style>
  .body{
    background-color:#20487b;
  }
</style>