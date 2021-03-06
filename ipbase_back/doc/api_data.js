define({ "api": [
  {
    "type": "get",
    "url": "/achievements/list",
    "title": "分页获取成果",
    "group": "Achievement",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "page",
            "description": "<p>页号</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "rows",
            "description": "<p>每页行数</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    page:1\n    rows:2\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [\n    {\n    \"ids\": null,\n    \"rows\": 20,\n    \"page\": 0,\n    \"pageStart\": 0,\n    \"message\": null,\n    \"id\": 1,\n    \"name\": \"基地官网的后端系统做完第一版了！\",\n    \"brief\": \"以后大家可以用来管理官网的数据，可以找人做展示网站了\",\n    \"author\": \"曾天臆\",\n    \"authorId\": 1,\n    \"createTime\": \"2019-05-07T08:16:57.000+0000\"\n    }\n    ],\n    \"allDataNum\": 1\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/AchievementInfoController.java",
    "groupTitle": "成果",
    "name": "GetAchievementsList"
  },
  {
    "type": "get",
    "url": "/achievements/one",
    "title": "获取单个成果详情",
    "group": "Achievement",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>成果id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    id:1\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"ids\": null,\n    \"rows\": 20,\n    \"page\": 0,\n    \"pageStart\": 0,\n    \"message\": null,\n    \"id\": 1,\n    \"name\": \"基地官网的后端系统做完第一版了！\",\n    \"brief\": \"以后大家可以用来管理官网的数据，可以找人做展示网站了\",\n    \"author\": \"曾天臆\",\n    \"authorId\": 1,\n    \"createTime\": \"2019-05-07T08:16:57.000+0000\",\n    \"pictures\": [\n    {\n    \"ids\": null,\n    \"rows\": 20,\n    \"page\": 0,\n    \"pageStart\": 0,\n    \"message\": null,\n    \"id\": 1,\n    \"name\": \"基地logo.png\",\n    \"achievementId\": 1,\n    \"createTime\": \"2019-05-13T23:47:25.000+0000\"\n    },\n    {\n    \"ids\": null,\n    \"rows\": 20,\n    \"page\": 0,\n    \"pageStart\": 0,\n    \"message\": null,\n    \"id\": 2,\n    \"name\": \"哈哈哈开心.jpg\",\n    \"achievementId\": 1,\n    \"createTime\": \"2019-05-13T23:47:50.000+0000\"\n    }\n    ]\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/AchievementInfoController.java",
    "groupTitle": "成果",
    "name": "GetAchievementsOne"
  },
  {
    "type": "get",
    "url": "/achievements/pageByAuthor",
    "title": "按用户分页获取成果",
    "group": "Achievement",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "authorId",
            "description": "<p>作者账号id</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "page",
            "description": "<p>页号</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "rows",
            "description": "<p>每页行数</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    authorId:1\n    page:1\n    rows:2\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n   \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [\n    {\n    \"ids\": null,\n    \"rows\": 20,\n    \"page\": 0,\n    \"pageStart\": 0,\n    \"message\": null,\n    \"id\": 1,\n    \"name\": \"基地官网的后端系统做完第一版了！\",\n    \"brief\": \"以后大家可以用来管理官网的数据，可以找人做展示网站了\",\n    \"author\": \"曾天臆\",\n    \"authorId\": 1,\n    \"createTime\": \"2019-05-07T08:16:57.000+0000\"\n    }\n    ],\n    \"allDataNum\": 1\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/AchievementInfoController.java",
    "groupTitle": "成果",
    "name": "GetAchievementsPagebyauthor"
  },
  {
    "type": "post",
    "url": "/achievements/add",
    "title": "添加成果",
    "group": "Achievement",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "authorId",
            "description": "<p>作者账号id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>成果名称(标题)</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "author",
            "description": "<p>作者账号名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "brief",
            "description": "<p>成果简介</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    authorId:1\n    name:基地官网的后端系统做完第一版了！\n    author:曾天臆\n    brief:以后大家可以用来管理官网的数据\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": 1\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/AchievementInfoController.java",
    "groupTitle": "成果",
    "name": "PostAchievementsAdd"
  },
  {
    "type": "post",
    "url": "/achievements/delete",
    "title": "删除成果",
    "group": "Achievement",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>单个id(传参方式二选一)</p>"
          },
          {
            "group": "Parameter",
            "type": "int[]",
            "optional": false,
            "field": "ids",
            "description": "<p>多个id(传参方式二选一)</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    id:2\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": 1\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/AchievementInfoController.java",
    "groupTitle": "成果",
    "name": "PostAchievementsDelete"
  },
  {
    "type": "post",
    "url": "/achievements/update",
    "title": "修改成果",
    "group": "Achievement",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>成果id</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "authorId",
            "description": "<p>作者账号id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>成果名称(标题)</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "author",
            "description": "<p>作者账号名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "brief",
            "description": "<p>成果简介</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    id:1\n    brief:以后大家可以用来管理官网的数据，可以找人做展示网站了\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": 1\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/AchievementInfoController.java",
    "groupTitle": "成果",
    "name": "PostAchievementsUpdate"
  },
  {
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "optional": false,
            "field": "varname1",
            "description": "<p>No type.</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "varname2",
            "description": "<p>With type.</p>"
          }
        ]
      }
    },
    "type": "",
    "url": "",
    "version": "0.0.0",
    "filename": "./doc/main.js",
    "group": "F__study_jidi_project_ipbase_ipbase_back_doc_main_js",
    "groupTitle": "F__study_jidi_project_ipbase_ipbase_back_doc_main_js",
    "name": ""
  },
  {
    "type": "post",
    "url": "/file/mutiUpload/noName",
    "title": "批量上传，返回新文件名",
    "group": "File",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "file[]",
            "optional": false,
            "field": "file",
            "description": "<p>多个文件（参数名需一样）</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    // form-data\n    file: 文件1\n    file: 文件2\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [\n    \"1557759632501.jpg\",\n    \"1557759632503.jpg\"\n    ]\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/FileController.java",
    "groupTitle": "文件",
    "name": "PostFileMutiuploadNoname"
  },
  {
    "type": "post",
    "url": "/file/mutiUpload/withName",
    "title": "上传文件，保留原文件名",
    "group": "File",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "file[]",
            "optional": false,
            "field": "file",
            "description": "<p>多个文件（参数名需一样）</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    // form-data\n    file: 文件1\n    file: 文件2\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [\n    \"japan50.jpg\",\n    \"sihunzhiyu.png\"\n    ]\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/FileController.java",
    "groupTitle": "文件",
    "name": "PostFileMutiuploadWithname"
  },
  {
    "type": "get",
    "url": "/materials/list",
    "title": "分页获取资料",
    "group": "Material",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "page",
            "description": "<p>页号</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "rows",
            "description": "<p>每页行数</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    page:1\n    rows:2\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [],\n    \"allDataNum\": 0\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/MaterialInfoController.java",
    "groupTitle": "资料",
    "name": "GetMaterialsList"
  },
  {
    "type": "get",
    "url": "/materials/one",
    "title": "获取单个成果详情",
    "group": "Material",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>资料id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/MaterialInfoController.java",
    "groupTitle": "资料",
    "name": "GetMaterialsOne"
  },
  {
    "type": "get",
    "url": "/materials/pageByAuthor",
    "title": "按用户分页获取资料",
    "group": "Material",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "authorId",
            "description": "<p>作者账号id</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "page",
            "description": "<p>页号</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "rows",
            "description": "<p>每页行数</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    authorId:1\n    page:1\n    rows:2\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [],\n    \"allDataNum\": 0\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/MaterialInfoController.java",
    "groupTitle": "资料",
    "name": "GetMaterialsPagebyauthor"
  },
  {
    "type": "post",
    "url": "/materials/add",
    "title": "添加资料",
    "group": "Material",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "authorId",
            "description": "<p>作者账号id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>资料文件名(同时也将会作为标题)</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "author",
            "description": "<p>作者账号名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "description",
            "description": "<p>资料描述</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    authorId: 1\n    name: 高数复习资料.zip\n    author: 管理员0\n    description: 前人整理的复习资料，有需要的小伙伴尽管拿去吧\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": 1\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/MaterialInfoController.java",
    "groupTitle": "资料",
    "name": "PostMaterialsAdd"
  },
  {
    "type": "post",
    "url": "/materials/delete",
    "title": "删除资料",
    "group": "Material",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>单个id(传参方式二选一)</p>"
          },
          {
            "group": "Parameter",
            "type": "int[]",
            "optional": false,
            "field": "ids",
            "description": "<p>多个id(传参方式二选一)</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/MaterialInfoController.java",
    "groupTitle": "资料",
    "name": "PostMaterialsDelete"
  },
  {
    "type": "post",
    "url": "/materials/update",
    "title": "修改资料",
    "group": "Material",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>资料id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>资料名称(标题)</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "description",
            "description": "<p>资料描述</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/MaterialInfoController.java",
    "groupTitle": "资料",
    "name": "PostMaterialsUpdate"
  },
  {
    "type": "get",
    "url": "/news/brief/list",
    "title": "分页获取文章简要列表",
    "group": "NewsBrief",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "page",
            "description": "<p>页号</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "rows",
            "description": "<p>每页行数</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    page:1\n    rows:2\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [],\n    \"allDataNum\": 0\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/NewsBriefController.java",
    "groupTitle": "新闻简要",
    "name": "GetNewsBriefList"
  },
  {
    "type": "get",
    "url": "/news/brief/one",
    "title": "获取单个文章简要",
    "group": "NewsBrief",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>文章简要id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    id:1\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"ids\": null,\n    \"rows\": 20,\n    \"page\": 0,\n    \"pageStart\": 0,\n    \"message\": null,\n    \"id\": 1,\n    \"title\": \"恭喜蓝桥杯获奖的同学们\",\n    \"brief\": \"蓝桥杯的获奖名单出来了，快来了解一下吧\",\n    \"updateTime\": \"2019-05-09T06:23:19.000+0000\",\n    \"createTime\": \"2019-05-09T06:23:19.000+0000\",\n    \"author\": \"管理员0\",\n    \"authorId\": 1,\n    \"state\": 0,\n    \"visit\": 0\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/NewsBriefController.java",
    "groupTitle": "新闻简要",
    "name": "GetNewsBriefOne"
  },
  {
    "type": "get",
    "url": "/news/brief/pageByAuthorAndState",
    "title": "按作者与文章状态分页获取文章",
    "group": "NewsBrief",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "authorId",
            "description": "<p>作者账号id</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "state",
            "description": "<p>文章状态(0=草稿，1=已发布，-1=删除)</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "page",
            "description": "<p>页号</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "rows",
            "description": "<p>每页行数</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    authorId:1\n    state:0\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [\n    {\n    \"ids\": null,\n    \"rows\": 20,\n    \"page\": 0,\n    \"pageStart\": 0,\n    \"message\": null,\n    \"id\": 1,\n    \"title\": \"恭喜蓝桥杯获奖的同学们\",\n    \"brief\": \"蓝桥杯的获奖名单出来了，快来了解一下吧\",\n    \"updateTime\": \"2019-05-09T06:23:19.000+0000\",\n    \"createTime\": \"2019-05-09T06:23:19.000+0000\",\n    \"author\": \"管理员0\",\n    \"authorId\": 1,\n    \"state\": 0,\n    \"visit\": 0\n    }\n    ]\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/NewsBriefController.java",
    "groupTitle": "新闻简要",
    "name": "GetNewsBriefPagebyauthorandstate"
  },
  {
    "type": "get",
    "url": "/news/brief/pageByState",
    "title": "按用户分页获取文章简要",
    "group": "NewsBrief",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "authorId",
            "description": "<p>作者账号id</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "state",
            "description": "<p>文章状态(0=草稿，1=已发布，-1=已删除)</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "page",
            "description": "<p>页号</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "rows",
            "description": "<p>每页行数</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    authorId:1\n    state:1\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [],\n    \"allDataNum\": 0\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/NewsBriefController.java",
    "groupTitle": "新闻简要",
    "name": "GetNewsBriefPagebystate"
  },
  {
    "type": "post",
    "url": "/news/brief/add",
    "title": "新增文章简要",
    "group": "NewsBrief",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "authorId",
            "description": "<p>作者账号id(必填)</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "title",
            "description": "<p>文章标题</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "brief",
            "description": "<p>文章简述</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "author",
            "description": "<p>作者名称</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    authorId:2\n    title:恭喜蓝桥杯获奖的同学们\n    brief:蓝桥杯的获奖名单出来了，快来了解一下吧\n    author:管理员0\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/NewsBriefController.java",
    "groupTitle": "新闻简要",
    "name": "PostNewsBriefAdd"
  },
  {
    "type": "post",
    "url": "/news/brief/delete",
    "title": "删除文章简要",
    "group": "NewsBrief",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>单个id(传参方式二选一)</p>"
          },
          {
            "group": "Parameter",
            "type": "int[]",
            "optional": false,
            "field": "ids",
            "description": "<p>多个id(传参方式二选一)</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    id:3\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": 1\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/NewsBriefController.java",
    "groupTitle": "新闻简要",
    "name": "PostNewsBriefDelete"
  },
  {
    "type": "post",
    "url": "/news/brief/update",
    "title": "更新文章简要",
    "group": "NewsBrief",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>文章简要id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "title",
            "description": "<p>文章标题</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "brief",
            "description": "<p>文章简述</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "state",
            "description": "<p>文章状态(0=草稿，1=已发布，-1=删除)</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    id:2\n    title:关于蓝桥杯比赛结果的新闻\n    state:1\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": 1\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/NewsBriefController.java",
    "groupTitle": "新闻简要",
    "name": "PostNewsBriefUpdate"
  },
  {
    "type": "get",
    "url": "/news/detail/list",
    "title": "分页获取文章详情列表",
    "group": "NewsDetail",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "page",
            "description": "<p>页号</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "rows",
            "description": "<p>每页行数</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    page:1\n    rows:2\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/NewsDetailController.java",
    "groupTitle": "新闻详情",
    "name": "GetNewsDetailList"
  },
  {
    "type": "get",
    "url": "/news/detail/one",
    "title": "获取单个文章详情",
    "group": "NewsDetail",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>文章详情id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    id:1\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"ids\": null,\n    \"rows\": 20,\n    \"page\": 0,\n    \"pageStart\": 0,\n    \"message\": null,\n    \"id\": 1,\n    \"briefId\": 1,\n    \"content\": \"<h3>获奖名单如下:</h3><ul><li>学生1</li><li>学生2</li></ul>\"\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/NewsDetailController.java",
    "groupTitle": "新闻详情",
    "name": "GetNewsDetailOne"
  },
  {
    "type": "get",
    "url": "/news/detail/pageByBrief",
    "title": "按文章简要获取文章详情",
    "group": "NewsDetail",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "briefId",
            "description": "<p>文章简要id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    briefId:1\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [\n    {\n    \"ids\": null,\n    \"rows\": 20,\n    \"page\": 0,\n    \"pageStart\": 0,\n    \"message\": null,\n    \"id\": 1,\n    \"briefId\": 1,\n    \"content\": \"<h3>获奖名单如下:</h3><ul><li>学生1</li><li>学生2</li></ul>\"\n    }\n    ],\n    \"allDataNum\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/NewsDetailController.java",
    "groupTitle": "新闻详情",
    "name": "GetNewsDetailPagebybrief"
  },
  {
    "type": "post",
    "url": "/news/detail/add",
    "title": "添加文章详情",
    "group": "NewsDetail",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "briefId",
            "description": "<p>文章简要信息id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "content",
            "description": "<p>富文本文章内容(建议html)</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    briefId:1\n    content:<h3>获奖名单如下:</h3><ul><li>学生1</li><li>学生2</li></ul>\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": 1\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/NewsDetailController.java",
    "groupTitle": "新闻详情",
    "name": "PostNewsDetailAdd"
  },
  {
    "type": "post",
    "url": "/news/detail/delete",
    "title": "删除文章详情",
    "group": "NewsDetail",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "page",
            "description": "<p>页号</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>单个id(传参方式二选一)</p>"
          },
          {
            "group": "Parameter",
            "type": "int[]",
            "optional": false,
            "field": "ids",
            "description": "<p>多个id(传参方式二选一)</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    id:3\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": 1\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/NewsDetailController.java",
    "groupTitle": "新闻详情",
    "name": "PostNewsDetailDelete"
  },
  {
    "type": "post",
    "url": "/news/detail/update",
    "title": "修改文章详情",
    "group": "NewsDetail",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>文章详情id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "content",
            "description": "<p>富文本文章内容(建议html)</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    id:1\n    content:<h3>获奖名单如下:</h3><ul><li>学生1</li><li>学生2</li><li>学生3</li><li>学生4</li></ul>\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": 1\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/NewsDetailController.java",
    "groupTitle": "新闻详情",
    "name": "PostNewsDetailUpdate"
  },
  {
    "type": "get",
    "url": "/picture/list",
    "title": "分页获取所有图片",
    "group": "Picture",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "page",
            "description": "<p>页号</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "rows",
            "description": "<p>每页行数</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    page:1\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [\n    {\n    \"ids\": null,\n    \"rows\": 20,\n    \"page\": 0,\n    \"pageStart\": 0,\n    \"message\": null,\n    \"id\": 1,\n    \"name\": \"基地logo.png\",\n    \"achievementId\": 1,\n    \"createTime\": \"2019-05-13T23:47:25.000+0000\"\n    },\n    {\n    \"ids\": null,\n    \"rows\": 20,\n    \"page\": 0,\n    \"pageStart\": 0,\n    \"message\": null,\n    \"id\": 2,\n    \"name\": \"test123.jpg\",\n    \"achievementId\": 1,\n    \"createTime\": \"2019-05-13T23:47:50.000+0000\"\n    }\n    ],\n    \"allDataNum\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/PictureInfoController.java",
    "groupTitle": "成果图片",
    "name": "GetPictureList"
  },
  {
    "type": "get",
    "url": "/picture/one",
    "title": "获取单张图片信息",
    "group": "Picture",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>图片id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/PictureInfoController.java",
    "groupTitle": "成果图片",
    "name": "GetPictureOne"
  },
  {
    "type": "get",
    "url": "/picture/pageByAchievement",
    "title": "按成就id获取图片",
    "group": "Picture",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "achievementId",
            "description": "<p>成果id</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "page",
            "description": "<p>页号</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "rows",
            "description": "<p>每页行数</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    page:1\n    achievementId:1\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [\n    {\n    \"ids\": null,\n    \"rows\": 20,\n    \"page\": 0,\n    \"pageStart\": 0,\n    \"message\": null,\n    \"id\": 1,\n    \"name\": \"基地logo.png\",\n    \"achievementId\": 1,\n    \"createTime\": \"2019-05-13T23:47:25.000+0000\"\n    },\n    {\n    \"ids\": null,\n    \"rows\": 20,\n    \"page\": 0,\n    \"pageStart\": 0,\n    \"message\": null,\n    \"id\": 2,\n    \"name\": \"哈哈哈开心.jpg\",\n    \"achievementId\": 1,\n    \"createTime\": \"2019-05-13T23:47:50.000+0000\"\n    }\n    ],\n    \"allDataNum\": 2\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/PictureInfoController.java",
    "groupTitle": "成果图片",
    "name": "GetPicturePagebyachievement"
  },
  {
    "type": "post",
    "url": "/picture/addByAchievement",
    "title": "新增图片",
    "group": "Picture",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "achievementId",
            "description": "<p>成果id</p>"
          },
          {
            "group": "Parameter",
            "type": "String[]",
            "optional": false,
            "field": "names",
            "description": "<p>图片名称数组</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/PictureInfoController.java",
    "groupTitle": "成果图片",
    "name": "PostPictureAddbyachievement"
  },
  {
    "type": "post",
    "url": "/picture/delete",
    "title": "删除图片",
    "group": "Picture",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>单个id(传参方式二选一)</p>"
          },
          {
            "group": "Parameter",
            "type": "int[]",
            "optional": false,
            "field": "ids",
            "description": "<p>多个id(传参方式二选一)</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/PictureInfoController.java",
    "groupTitle": "成果图片",
    "name": "PostPictureDelete"
  },
  {
    "type": "post",
    "url": "/picture/update",
    "title": "修改图片信息",
    "group": "Picture",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>图片id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>图片文件名称</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/PictureInfoController.java",
    "groupTitle": "成果图片",
    "name": "PostPictureUpdate"
  },
  {
    "type": "get",
    "url": "/role/list",
    "title": "分页获取角色",
    "group": "Role",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "page",
            "description": "<p>页号</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "rows",
            "description": "<p>每页行数</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    page:1\n    rows:2\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [\n    {\n    \"ids\": null,\n    \"rows\": 20,\n    \"page\": 0,\n    \"pageStart\": 0,\n    \"message\": null,\n    \"id\": 1,\n    \"name\": \"研发部成员\",\n    \"note\": \"普通研发部成员\"\n    }\n    ],\n    \"allDataNum\": 1\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/RoleInfoController.java",
    "groupTitle": "角色",
    "name": "GetRoleList"
  },
  {
    "type": "get",
    "url": "/role/one",
    "title": "获取单个角色信息",
    "group": "Role",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>角色id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    id:1\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"ids\": null,\n    \"rows\": 20,\n    \"page\": 0,\n    \"pageStart\": 0,\n    \"message\": null,\n    \"id\": 1,\n    \"name\": \"研发部成员\",\n    \"note\": \"普通研发部成员\"\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/RoleInfoController.java",
    "groupTitle": "角色",
    "name": "GetRoleOne"
  },
  {
    "type": "get",
    "url": "/role/pageByName",
    "title": "角色名称模糊筛选列表",
    "group": "Role",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "page",
            "description": "<p>页号</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>搜索角色名称</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    name:研发\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [\n    {\n    \"ids\": null,\n    \"rows\": 20,\n    \"page\": 0,\n    \"pageStart\": 0,\n    \"message\": null,\n    \"id\": 1,\n    \"name\": \"研发部成员\",\n    \"note\": \"普通研发部成员\"\n    }\n    ],\n    \"allDataNum\": 1\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/RoleInfoController.java",
    "groupTitle": "角色",
    "name": "GetRolePagebyname"
  },
  {
    "type": "post",
    "url": "/role/add",
    "title": "新增角色",
    "group": "Role",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>角色名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "note",
            "description": "<p>角色备注</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    name:研发部成员\n    note:普通研发部成员\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": 1\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/RoleInfoController.java",
    "groupTitle": "角色",
    "name": "PostRoleAdd"
  },
  {
    "type": "post",
    "url": "/role/delete",
    "title": "删除角色(可批量)",
    "group": "Role",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>单个id(传参方式二选一)</p>"
          },
          {
            "group": "Parameter",
            "type": "int[]",
            "optional": false,
            "field": "ids",
            "description": "<p>多个id(传参方式二选一)</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    id:2\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": 1\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/RoleInfoController.java",
    "groupTitle": "角色",
    "name": "PostRoleDelete"
  },
  {
    "type": "post",
    "url": "/role/update",
    "title": "修改角色信息",
    "group": "Role",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>角色id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>角色名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "note",
            "description": "<p>角色备注</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    id:1\n    note:限制部分权限，如..\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": 1\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/RoleInfoController.java",
    "groupTitle": "角色",
    "name": "PostRoleUpdate"
  },
  {
    "type": "get",
    "url": "/user/list",
    "title": "分页获取用户",
    "group": "User",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "page",
            "description": "<p>页号</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "rows",
            "description": "<p>每页行数</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    page:1\n    rows:2\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [\n    {\n    \"ids\": null,\n    \"rows\": 20,\n    \"page\": 0,\n    \"pageStart\": 0,\n    \"message\": null,\n    \"id\": 1,\n    \"account\": \"2016072007\",\n    \"password\": \"123456\",\n    \"name\": \"曾天臆\",\n    \"roleId\": 0,\n    \"createTime\": \"2019-05-05T03:57:05.000+0000\"\n    },\n    {\n    \"ids\": null,\n    \"rows\": 20,\n    \"page\": 0,\n    \"pageStart\": 0,\n    \"message\": null,\n    \"id\": 2,\n    \"account\": \"2016072000\",\n    \"password\": \"123456\",\n    \"name\": \"管理员0\",\n    \"roleId\": 1,\n    \"createTime\": \"2019-05-09T06:10:53.000+0000\"\n    }\n    ],\n    \"allDataNum\": 2\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/UserInfoController.java",
    "groupTitle": "用户",
    "name": "GetUserList"
  },
  {
    "type": "get",
    "url": "/user/one",
    "title": "获取单个用户信息",
    "group": "User",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>用户id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    id:1\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"ids\": null,\n    \"rows\": 20,\n    \"page\": 0,\n    \"pageStart\": 0,\n    \"message\": null,\n    \"id\": 1,\n    \"account\": \"2016072007\",\n    \"password\": \"123456\",\n    \"name\": \"曾天臆\",\n    \"roleId\": 0,\n    \"createTime\": \"2019-05-05T03:57:05.000+0000\"\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/UserInfoController.java",
    "groupTitle": "用户",
    "name": "GetUserOne"
  },
  {
    "type": "get",
    "url": "/user/pageByFilter",
    "title": "条件筛选分页获取用户",
    "group": "User",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "page",
            "description": "<p>页号</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "rows",
            "description": "<p>每页行数</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "account",
            "description": "<p>账号(精确查询)</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>姓名(模糊查询)</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request1:",
          "content": "{\n    page:1\n    rows:2\n    account:2016072007\n}",
          "type": "json"
        },
        {
          "title": "Success-Request2:",
          "content": "{\n    page:1\n    rows:2\n    name:曾\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [\n    {\n    \"ids\": null,\n    \"rows\": 20,\n    \"page\": 0,\n    \"pageStart\": 0,\n    \"message\": null,\n    \"id\": 1,\n    \"account\": \"2016072007\",\n    \"password\": \"123456\",\n    \"name\": \"曾天臆\",\n    \"roleId\": 0,\n    \"createTime\": \"2019-05-05T03:57:05.000+0000\"\n    }\n    ],\n    \"allDataNum\": null\n}",
          "type": "json"
        },
        {
          "title": "Success-Response2:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": [\n    {\n    \"ids\": null,\n    \"rows\": 20,\n    \"page\": 0,\n    \"pageStart\": 0,\n    \"message\": null,\n    \"id\": 1,\n    \"account\": \"2016072007\",\n    \"password\": \"123456\",\n    \"name\": \"曾天臆\",\n    \"roleId\": 0,\n    \"createTime\": \"2019-05-05T03:57:05.000+0000\"\n    }\n    ],\n    \"allDataNum\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/UserInfoController.java",
    "groupTitle": "用户",
    "name": "GetUserPagebyfilter"
  },
  {
    "type": "post",
    "url": "/user/add",
    "title": "新增用户账号",
    "group": "User",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "account",
            "description": "<p>账号</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>密码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>用户名称</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "roleId",
            "description": "<p>角色id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    account:2016072000\n    password:123456\n    name:管理员0\n    roleId:1\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n     \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": 1\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/UserInfoController.java",
    "groupTitle": "用户",
    "name": "PostUserAdd"
  },
  {
    "type": "post",
    "url": "/user/delete",
    "title": "删除用户账号(可批量)",
    "group": "User",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>单个id(传参方式二选一)</p>"
          },
          {
            "group": "Parameter",
            "type": "int[]",
            "optional": false,
            "field": "ids",
            "description": "<p>多个id(传参方式二选一)</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    id:2\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n     \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": 1\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/UserInfoController.java",
    "groupTitle": "用户",
    "name": "PostUserDelete"
  },
  {
    "type": "post",
    "url": "/user/login",
    "title": "用户登录",
    "group": "User",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "account",
            "description": "<p>账号</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>密码</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    account:2016072007\n    password:123456\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n    \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": {\n    \"ids\": null,\n    \"rows\": 20,\n    \"page\": 0,\n    \"pageStart\": 0,\n    \"message\": null,\n    \"id\": 1,\n    \"account\": \"2016072007\",\n    \"password\": \"123456\",\n    \"name\": \"曾天臆\",\n    \"roleId\": 0,\n    \"createTime\": \"2019-05-05T03:57:05.000+0000\"\n    }\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "error": {
      "examples": [
        {
          "title": "Error-Request1:",
          "content": "{\n    account:2016072007\n    password:123\n}",
          "type": "json"
        },
        {
          "title": "Error-Request2:",
          "content": "{\n    account:2016\n    password:123\n}",
          "type": "json"
        },
        {
          "title": "Error-Response1:",
          "content": "{\n    \"resultCode\": 500,\n    \"resultMsg\": \"密码不正确\",\n    \"data\": {\n    \"ids\": null,\n    \"rows\": 20,\n    \"page\": 0,\n    \"pageStart\": 0,\n    \"message\": null,\n    \"id\": null,\n    \"account\": \"2016072007\",\n    \"password\": \"123\",\n    \"name\": null,\n    \"roleId\": null,\n    \"createTime\": null\n    }\n}",
          "type": "json"
        },
        {
          "title": "Error-Response2:",
          "content": "{\n    \"resultCode\": 500,\n    \"resultMsg\": \"账号不存在\",\n    \"data\": {\n    \"ids\": null,\n    \"rows\": 20,\n    \"page\": 0,\n    \"pageStart\": 0,\n    \"message\": null,\n    \"id\": null,\n    \"account\": \"2016\",\n    \"password\": \"123\",\n    \"name\": null,\n    \"roleId\": null,\n    \"createTime\": null\n    }\n}",
          "type": "json"
        }
      ]
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/UserInfoController.java",
    "groupTitle": "用户",
    "name": "PostUserLogin"
  },
  {
    "type": "post",
    "url": "/user/update",
    "title": "修改用户账号",
    "group": "User",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "id",
            "description": "<p>账号id</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "account",
            "description": "<p>账号</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>密码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>用户名称</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "roleId",
            "description": "<p>角色id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n    id:2\n    password:ipbase508\n    roleId:2\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n     \"resultCode\": 200,\n    \"resultMsg\": \"成功\",\n    \"data\": 1\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "resultCode",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "resultMsg",
            "description": "<p>结果描述</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>数据主体</p>"
          },
          {
            "group": "Success 200",
            "type": "Integer",
            "optional": false,
            "field": "allDataNum",
            "description": "<p>数据库中满足条件的总条数（用于分页）</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "./src/main/java/com/ipbase/DataBack/controller/UserInfoController.java",
    "groupTitle": "用户",
    "name": "PostUserUpdate"
  }
] });
