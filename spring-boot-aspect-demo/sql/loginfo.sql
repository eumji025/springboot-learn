/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50632
Source Host           : localhost:3306
Source Database       : jdbc

Target Server Type    : MYSQL
Target Server Version : 50632
File Encoding         : 65001

Date: 2017-11-25 19:37:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for loginfo
-- ----------------------------
DROP TABLE IF EXISTS `loginfo`;
CREATE TABLE `loginfo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `arges` varchar(255) DEFAULT NULL,
  `class_method` varchar(255) DEFAULT NULL,
  `header` varchar(255) DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `method` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of loginfo
-- ----------------------------
INSERT INTO `loginfo` VALUES ('1', '[]', 'com.eumji.aspect.controller.IndexController.hello', 'org.apache.tomcat.util.http.NamesEnumerator@69c5d991', null, 'GET', 'http://localhost:8080/');
INSERT INTO `loginfo` VALUES ('2', '[]', 'com.eumji.aspect.controller.IndexController.hello', 'org.apache.tomcat.util.http.NamesEnumerator@3708f4d2', null, 'GET', 'http://localhost:8080/');
INSERT INTO `loginfo` VALUES ('3', '[]', 'com.eumji.aspect.controller.IndexController.hello', 'org.apache.tomcat.util.http.NamesEnumerator@36a84315', null, 'GET', 'http://localhost:8080/');
