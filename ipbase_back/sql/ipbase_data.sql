/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50539
Source Host           : 127.0.0.1:3306
Source Database       : ipbase_data

Target Server Type    : MYSQL
Target Server Version : 50539
File Encoding         : 65001

Date: 2019-05-09 23:21:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for achievement_info
-- ----------------------------
DROP TABLE IF EXISTS `achievement_info`;
CREATE TABLE `achievement_info` (
  `id` int(5) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(40) DEFAULT NULL COMMENT '成果名称',
  `brief` varchar(200) DEFAULT NULL COMMENT '成果简述',
  `author` varchar(255) DEFAULT NULL COMMENT '上传者',
  `author_id` int(5) NOT NULL COMMENT '上传者id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of achievement_info
-- ----------------------------
INSERT INTO `achievement_info` VALUES ('1', '基地官网的后端系统做完第一版了！', '以后大家可以用来管理官网的数据，可以找人做展示网站了', '曾天臆', '1', '2019-05-07 08:16:57');

-- ----------------------------
-- Table structure for material_info
-- ----------------------------
DROP TABLE IF EXISTS `material_info`;
CREATE TABLE `material_info` (
  `id` int(5) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) DEFAULT NULL COMMENT '资料名称',
  `description` varchar(255) DEFAULT NULL COMMENT '资料描述',
  `author` varchar(255) DEFAULT NULL COMMENT '上传者',
  `author_id` int(5) NOT NULL COMMENT '上传者id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `download` int(7) DEFAULT NULL COMMENT '下载量',
  `size` double DEFAULT NULL COMMENT '文件大小',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of material_info
-- ----------------------------

-- ----------------------------
-- Table structure for news_brief
-- ----------------------------
DROP TABLE IF EXISTS `news_brief`;
CREATE TABLE `news_brief` (
  `id` int(5) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(100) DEFAULT NULL COMMENT '标题',
  `brief` varchar(200) DEFAULT NULL COMMENT '简要内容',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `author` varchar(20) DEFAULT NULL COMMENT '创建者姓名',
  `author_id` int(5) NOT NULL COMMENT '创建者id',
  `state` int(3) DEFAULT '0' COMMENT '状态（0草稿、1已发布、-1已删除）',
  `visit` int(7) DEFAULT '0' COMMENT '访问量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news_brief
-- ----------------------------
INSERT INTO `news_brief` VALUES ('1', '恭喜蓝桥杯获奖的同学们', '蓝桥杯的获奖名单出来了，快来了解一下吧', '2019-05-09 06:23:19', '2019-05-09 06:23:19', '管理员0', '1', '0', '0');

-- ----------------------------
-- Table structure for news_detail
-- ----------------------------
DROP TABLE IF EXISTS `news_detail`;
CREATE TABLE `news_detail` (
  `id` int(5) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `brief_id` int(5) NOT NULL COMMENT 'news_brief的id',
  `content` text COMMENT '文章内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news_detail
-- ----------------------------
INSERT INTO `news_detail` VALUES ('1', '1', '<h3>获奖名单如下:</h3><ul><li>学生1</li><li>学生2</li></ul>');

-- ----------------------------
-- Table structure for picture_info
-- ----------------------------
DROP TABLE IF EXISTS `picture_info`;
CREATE TABLE `picture_info` (
  `id` int(5) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(30) NOT NULL COMMENT '图片文件名',
  `achievement_id` int(5) NOT NULL COMMENT '成果id',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of picture_info
-- ----------------------------

-- ----------------------------
-- Table structure for role_info
-- ----------------------------
DROP TABLE IF EXISTS `role_info`;
CREATE TABLE `role_info` (
  `id` int(5) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(20) DEFAULT NULL COMMENT '角色名称',
  `note` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_info
-- ----------------------------
INSERT INTO `role_info` VALUES ('1', '研发部成员', '普通研发部成员');

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(5) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `account` varchar(20) DEFAULT NULL COMMENT '账号（学号）',
  `password` varchar(20) DEFAULT NULL COMMENT '密码',
  `name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `role_id` int(5) NOT NULL DEFAULT '0' COMMENT '角色id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', '2016072007', '123456', '曾天臆', '0', '2019-05-05 03:57:05');
INSERT INTO `user_info` VALUES ('2', '2016072000', '123456', '管理员0', '1', '2019-05-09 06:10:53');
