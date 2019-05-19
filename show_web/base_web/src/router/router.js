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
    component: () => import( '@/views/data')
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
