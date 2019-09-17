const path =require('path')

const resolve = dir =>path.join(__dirname,dir)

const BASE_URL=process.env.NODE_ENV === 'protection' ? '/' : '/'

module.exports={
  lintOnSave:false,
  chainWebpack:config =>{
    config.resolve.alias
    .set('@',resolve('src'))//表示之后我们可以用@代替src文件夹来快捷使用
    .set('_C',resolve('src/components'))
  },
  //打包时不生成map文件，加快打包速度
  productionSourceMap:false,
  // 基本路径
  baseUrl: './',
  // 输出文件目录
  outputDir: 'dist',
  // webpack-dev-server 相关配置

  devServer:{
    proxy:'https://localhost://8088'
  }
}
