/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50632
Source Host           : localhost:3306
Source Database       : jdbc

Target Server Type    : MYSQL
Target Server Version : 50632
File Encoding         : 65001

Date: 2017-11-25 21:19:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user2
-- ----------------------------
DROP TABLE IF EXISTS `user2`;
CREATE TABLE `user2` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user2
-- ----------------------------
INSERT INTO `user2` VALUES ('1', '修改了名字的liji', 'women');
INSERT INTO `user2` VALUES ('2', 'xiaohua', 'women');
INSERT INTO `user2` VALUES ('3', 'admin', 'man');
INSERT INTO `user2` VALUES ('4', 'admin', 'man');
INSERT INTO `user2` VALUES ('5', 'admin', 'man');
INSERT INTO `user2` VALUES ('6', 'admin', 'man');
