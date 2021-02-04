import Vue from 'vue'
import App from './App.vue'
import 'bootstrap/dist/css/bootstrap.min.css';
import vuetify from './plugins/vuetify';
import VueAxios from "vue-axios";
import axios from "axios";
import {BASE_URL} from "@/common/config";
import router from './router/router'
import i18n from './i18n'

Vue.config.productionTip = false
axios.defaults.baseURL = BASE_URL;
Vue.use(VueAxios, axios)


router.beforeEach((to, from, next) =>{
  let language = to.params.lang;
  if(!language) {
    language = 'en'
  }

  i18n.locale = language
  next()
})


new Vue({
  vuetify,
  router,
  i18n,
  render: h => h(App)
}).$mount('#app')