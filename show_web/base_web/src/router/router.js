import index from '@/views/index'
export default
[
  {
    path: '/',
    name: 'index',
    component: index
  },
  {
    path: '/data',
    name: 'data',
    component: () => import( '@/views/data'),
    redirect:"/yunwei",
    children:[
      {
        path:'/yunwei',
        name:'yunwei',
        component:()=>import("@/components/File.vue")
      },
      {
        path:'/chanpin',
        name:'chanpin',
        component:()=>import("@/components/File.vue")
      },
      {
        path:'/yanfa',
        name:'yanfa',
        component:()=>import("@/components/File.vue")
      }
    ]
  },
  {
    path: '/news',
    name: 'news',
    component: () => import( '@/views/news')
  },
  {
    path: '/result',
    name: 'result',
    component: () => import( '@/views/result')
  }
]
