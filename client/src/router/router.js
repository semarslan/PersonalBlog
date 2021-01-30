import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import About from '../views/About.vue'
import Post from "@/views/Post";
import Category from "@/views/Category";

Vue.use(VueRouter)

const routes = [
    {
        path: '/',
        name: 'Home',
        component: Home
    },
    {
        path: '/about',
        name: 'About',
        component:About
    },
    {
        path: '/post',
        name: 'Product',
        component:Post
    },
    {
        path: '/category',
        name: 'Category',
        component:Category
    }
]

const router = new VueRouter({
    mode: 'history',
    base: process.env.BASE_URL,
    routes
})

export default router