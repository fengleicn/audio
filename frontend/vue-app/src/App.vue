<template>
  <Index />
</template>

<script>
import Index from "./components/Index.vue";

export default {
  name: "App",
  components: {
    Index: Index,
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  margin: 0 !important;
  padding: 0;
}

body{
  margin: 0 !important;
  padding: 0;
}
</style>
