import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import About from '../views/About.vue'
import Post from "@/views/Post";
import Category from "@/views/Category";
import i18n from '../i18n';


Vue.use(VueRouter)

const routes = [
    {
      path: '/',
      redirect: `/${i18n.locale}`
    },
    {
        path: '/:lang',
        component:{
            render (c) {return c('router-view')}
        },
        children: [
            {
                path: '/',
                name: 'Home',
                component: Home
            },
            {
                path: 'about',
                name: 'About',
                component: About
            },
            {
                path: 'post',
                name: 'Post',
                component: Post
            },
            {
                path: 'category',
                name: 'Category',
                component: Category
            }
        ]
    }
]

const router = new VueRouter({
    mode: 'history',
    base: process.env.BASE_URL,
    routes
})

export default router