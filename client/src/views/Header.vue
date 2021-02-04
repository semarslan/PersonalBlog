<template>
  <v-container class="pb-lg-12 mb-12" absolute>
    <v-app-bar class="overflow-hidden position-fixed"
               absolute
               color="black"
               elevate-on-scroll
               scroll-target="#scrolling-techniques-7"
               prominent
    >
      <v-toolbar-items class="pb-10 mt-0">
        <v-divider class="mx-6 mt-0 grey darken-2"
                   vertical="true"></v-divider>
      </v-toolbar-items>

      <v-toolbar-title @click="$router.push('/')" class="white--text">
        <div class="title"> BERKAY BENTÜRKÜM</div>
        <div class="sub-title"> 2D-3D Motion Designer</div>
      </v-toolbar-title>

      <v-spacer></v-spacer>

      <v-toolbar-items class="pt-10 pl-16 ml-16">
        <router-link :to="`/${$i18n.locale}/`">
          <v-btn text color="white" class="toolbar-items">
            {{ $t("home") }}
          </v-btn>
        </router-link>
        <router-link :to="`/${$i18n.locale}/about`">
          <v-btn text color="white" class="toolbar-items">
            {{ $t("about") }}
          </v-btn>
        </router-link>
        <router-link :to="`/${$i18n.locale}/post`">
          <v-btn text color="white" class="toolbar-items">
            {{ $t("posts") }}
          </v-btn>
        </router-link>
        <v-divider class="mx-6 grey darken-2"
                   vertical="true"></v-divider>
        <router-link :to="`/${$i18n.locale}/`">
          <v-btn
              color="white"
              text class="toolbar-items"
          >
            {{ $t('signup') }}
          </v-btn>
        </router-link>
        <router-link :to="`/${$i18n.locale}/`">
          <v-btn
              color="white"
              text class="toolbar-items"
          >
            {{ $t('signin') }}
          </v-btn>
        </router-link>
      </v-toolbar-items>
      <LanguageSwitcher/>

    </v-app-bar>
  </v-container>
</template>

<script>
import LanguageSwitcher from "@/components/Language/LanguageSwitcher";

export default {
  name: "Header",
  components: {
    LanguageSwitcher
  },
  data() {
    return {
      collapseOnScroll: true,
      links: []
    }
  }
}
</script>

<style scoped>
.title {
  font-weight: 298 !important;
  font-size: 45px !important;
  color: white;
  height: 60px;
  margin-top: 20px;
  padding-top: 20px;
  line-height: 3rem;
  margin-left: 20px;
  letter-spacing: 0.3rem !important;
}
.sub-title {
  font-size: 1rem;
  color: white;
  line-height: 3rem;
  letter-spacing: 0.3rem;
}
.toolbar-items{
  letter-spacing: 0.1rem;
}
</style>

