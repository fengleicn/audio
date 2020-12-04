<template>
  <div class="hello">
    <el-container>
      <el-header>
        <el-button @click="refresh()">
          <i class="el-icon-refresh"></i>
          <span>刷新</span>
        </el-button>
      </el-header>
      <el-container>
        <el-main>
          <el-card class="box-card" style="text-align: left">
            <template #header>
              <div class="clearfix">
                <span>{{ word }}</span>
              </div>
            </template>
            <div class="text item">
              <span style="color: #3380d7">{{ chinese }}</span>
            </div>
          </el-card>
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>

<script>
import axios from "axios"

export default {
  name: "Index",
  props: {
    msg: String,
  },
  data: () => {
    return {
      word: null,
      chinese: null,
      timer: null,
      time: null
    }
  },
  methods: {
    log() {
      axios.get("http://cnhome.top:5000/")
          .then((data) => {
            this.word = data.data.word
            this.chinese = data.data.chinese
            this.time = new Date().toISOString()
          })
    },
    refresh() {
      location.reload();
    }

  },
  mounted() {
    this.timer = setInterval(this.log, 500)
  },
  beforeUnmount() {
    clearInterval(this.timer)
  }

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

.el-button {
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

.el-calendar {
  height: 30px;
}
</style>
