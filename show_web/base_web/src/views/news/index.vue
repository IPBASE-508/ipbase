<template>
  <div>
    <div id="news-index" class="news-index-content-box">
      <div class="news-index-span"></div>
      <div class="news-index-tn-box">
        <title-box/>
        <div class="news-index-na-box">
          <div class="news-index-newLists-box">
            <newLists-box/>
          </div>
          <about-box class="news-index-about-box"/>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import newLists from "@/components/newLists.vue";
import title from "@/components/title.vue";
import about from "@/components/about.vue";

export default {
  data() {
    return {};
  },
  components: {
    "newLists-box": newLists,
    "title-box": title,
    "about-box": about
  }
};
</script>

<style scoped>
#news-index {
  background-color: rgb(164, 191, 261);
  /* background-color: rgb(3, 113, 126); */
  /* background-image: url('.././images/基地官网3(新闻).jpg'); */
}
</style>
