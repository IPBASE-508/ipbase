const path =require('path')

const resolve = dir =>path.join(__dirname,dir)

const BASE_URL=process.env.NODE_ENV === 'protection' ? '/' : '/'

module.exports={
  lintOnSave:false,
  baseUrl:BASE_URL,
  chainWebpack:config =>{
    config.resolve.alias
    .set('@',resolve('src'))//表示之后我们可以用@代替src文件夹来快捷使用
    .set('_C',resolve('src/components'))
  },
  //打包时不生成map文件，加快打包速度
  productionSourceMap:false,
  devServer: {
    // 设置代理
    proxy: {
      '/api': {
        target: 'https://zengtianyi.top/ipbase',
        changeOrigin: true,
        pathRewrite: {
          '/api': ''
        }
      }
    }
  }
}
