<template>
  <div id="app">
    <tool-bar></tool-bar>
    <router-view></router-view>
  </div>
</template>

<script>
import toolBar from "./components/ToolBar";

export default {
  name: "App",
  components: {
    toolBar
  }
};
</script>

<style>
body {
  padding: 0;
  margin: 0;
}
</style>
