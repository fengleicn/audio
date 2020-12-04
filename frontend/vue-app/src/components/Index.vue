<template>
  <div class="hello">
    <el-container>
      <el-header>
        <el-button>
          <i class="el-icon-apple"></i>
          <span>刷新</span>
        </el-button>
      </el-header>
      <el-container>
        <el-main>
          <el-card class="box-card">
            <div class="clearfix">
              <span>卡片名称</span>
              <el-button style="float: right; padding: 3px 0" type="text">操作按钮</el-button>
            </div>
            <div class="text item">
              something
            </div>
          </el-card>
        </el-main>
        <el-aside>
          <el-card class="box-card">
            <template #header>
              <div class="clearfix" style="background-color: #3380d7">
                <span>小明</span>
              </div>
            </template>
            <div class="text item">
              说: 你好
            </div>
          </el-card>
          <el-card class="box-card">
            <div class="clearfix">
              <span>卡片名称</span>
              <el-button style="float: right; padding: 3px 0" type="text">操作按钮</el-button>
            </div>
            <div class="text item">
              something
            </div>
          </el-card>
        </el-aside>
      </el-container>
    </el-container>
  </div>
</template>

<script>
export default {
  name: "Index",
  props: {
    msg: String,
  },
  methods: {
    log() {
      console.log("log")
    },
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.el-header {
  display: block;
  background-color: #ffffff;
  border-bottom: solid 2px #3380d7;
  margin: 0;
  padding: 0;
  text-align: center !important;
}

.card-header {
  height: 30px !important;
  background-color: #c7cfd7;
}

.el-button {
  /*height: 60px;*/
  margin: auto !important;
  margin-top: 10px !important;
  margin-left: 10px !important;
  float: left;
  border: none;
}

el-aside {
  background-color: #abb3bd;
}

.box-card {
  margin: 20px;
}
</style>
