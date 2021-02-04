<template>
  <v-footer
      class="footer"
      color="white"
  >

      <v-row class="col-5 ml-5 mb-3">
        <v-list-item-group >
          <v-item class="m-3">
            <v-btn fab flat x-small :href="'https://www.instagram.com/brkybntrkm/?hl=tr'" target="_blank">
              <v-img height="50" width="50" src="/instagram.png"></v-img>
            </v-btn>
          </v-item>
          <v-item class="m-3">
            <v-btn fab flat x-small :href="'https://www.behance.net/berkaybenturkum'" target="_blank">
              <v-img height="50" width="50" src="/behance.png"></v-img>
            </v-btn>
          </v-item>
          <v-item class="m-3">
            <v-btn fab flat x-small :href="'https://www.facebook.com/bbenturkum/'" target="_blank">
              <v-img height="50" width="50" src="/facebook.png"></v-img>
            </v-btn>
          </v-item>
          <v-item class="m-3">
            <v-btn fab flat x-small :href="'https://twitter.com/bbenturkum'" target="_blank">
              <v-img height="50" width="50" src="/twitter.png"></v-img>
            </v-btn>
          </v-item>
          <br>
          <v-list-item class="ml-0 mt-2">
            <v-list-item-avatar width="10" height="30" rounded text>
              <v-img src="/email.png"></v-img>
            </v-list-item-avatar>
            <v-list-item-content class="infor">berkaybenturkum@gmail.com</v-list-item-content>
          </v-list-item>
          <v-list-item class="ml-6 pl-7 mt-2">
            <v-list-item-avatar width="10" height="30" rounded>
              <v-img src="/phone.png"></v-img>
            </v-list-item-avatar>
            <v-list-item-content class="infor">0 (545) 808 80 86</v-list-item-content>
          </v-list-item>
        </v-list-item-group>
      </v-row>
      <v-row>
        <v-list-item-group>
          <v-col
              class="footer col-12"
          >
            <strong>BERKAY BENTÜRKÜM</strong>
            <br>
            <p>
              2D-3D Motion Designer
            </p>
          </v-col>
          <v-col
              class="footer black mb-6 text-center white--text"
              cols="12"
          >
            {{ new Date().getFullYear() }}
          </v-col>
        </v-list-item-group>
      </v-row>
      <v-row class="col-3">
        <v-col  cols="12">
          <v-avatar size="45"><v-img src="/address.png"></v-img></v-avatar>
        </v-col>
        <v-col cols="12" class="pb-7">
          <v-list-item-group>
            <v-list-item>
              <v-list-item-content class="infor pb-3">
                <v-list-item-title>LUNAPARK FILM</v-list-item-title>
                Levent Mahallesi,

                Manolyalı Sokak. NO:22
                <br>
                Beşiktaş/İSTANBUL
              </v-list-item-content>
            </v-list-item>
          </v-list-item-group>
        </v-col>
      </v-row>
  </v-footer>
</template>

<script>
export default {
  name: "Footer",
  data: () => ({
  }),
}
</script>

<style scoped>
.footer {
  font-weight: 298 !important;
  font-size: 1.1rem;
  color: black;
  line-height: 3rem;
  letter-spacing: 0.5rem;
}

.infor {
  color: black;
  letter-spacing: 0.1rem;
  font-size: 1.1rem;
}
</style>