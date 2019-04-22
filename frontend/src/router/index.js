import Vue from 'vue'
import Router from 'vue-router'
import Join from '../views/JoinView.vue'
import Login from '../views/LoginView.vue'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/Login',
      name: 'Login',
      component: Login
    },
    {
      path: '/Join',
      name: 'Join',
      component: Join
    }
  ]
})
