/*
Navicat MySQL Data Transfer
Source Host     : localhost:3306
Source Database : test
Target Host     : localhost:3306
Target Database : test
Date: 2010-05-28 22:35:45
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for generator_table
-- ----------------------------
DROP TABLE IF EXISTS `generator_table`;
CREATE TABLE `generator_table` (
  `g_key` varchar(100) NOT NULL,
  `g_value` int(11) default NULL,
  PRIMARY KEY  (`g_key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of generator_table
-- ----------------------------
INSERT INTO `generator_table` VALUES ('role_pk', '3');
INSERT INTO `generator_table` VALUES ('user_pk', '4');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL,
  `name` varchar(50) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '超级管理员');
INSERT INTO `role` VALUES ('2', '系统管理员');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(20) default NULL,
  `role_id` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', '1');
INSERT INTO `user` VALUES ('2', '李四', '2');
INSERT INTO `user` VALUES ('3', '王五', '1');
