<template>
  <div class="header">
    <router-link to="Markets">Login |</router-link>
    <router-link to="Domains">Join |</router-link>
    <div class="main">main page</div>
  </div>
</template>

<script>
export default {};
</script>

<style scoped>
.header {
  color: white;
  display: flex;
  background-color: blueviolet;
  padding: 8px;
}

.header .router-link-exact-active {
  color: #35495e;
}

.header a {
  color: aliceblue;
}
</style>
