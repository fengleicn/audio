<template>
  <div class="hello">
    <el-container>
      <el-header>
        <span>标题</span>
      </el-header>
      <el-container>
        <el-aside>
          <el-menu class="el-menu-vertical-demo" @click="log">菜单1</el-menu>
          <el-menu class="el-menu-vertical-demo" @click="log">菜单2</el-menu>
          <el-menu class="el-menu-vertical-demo" @click="log">菜单3</el-menu>
        </el-aside>
        <el-main>
          <div>内容</div>
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>

<script>
export default {
  name: "HelloWorld",
  props: {
    msg: String,
  },
  methodes: {
    log() {
      console.log("log");
    },
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
el-header {
  background: "#909399"
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
