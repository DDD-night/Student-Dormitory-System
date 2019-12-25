/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80013
Source Host           : localhost:3306
Source Database       : student_system

Target Server Type    : MYSQL
Target Server Version : 80013
File Encoding         : 65001

Date: 2019-12-25 21:47:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `adminnumber` varchar(255) NOT NULL,
  `adminname` varchar(255) DEFAULT NULL,
  `adminhome` varchar(255) DEFAULT NULL,
  `adminemail` varchar(255) DEFAULT NULL,
  `adminpassword` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`adminnumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('3', '3', '3', '1112@qq.com', '3');
INSERT INTO `admin` VALUES ('32', '章', '2', '1@qq.com', '32');
INSERT INTO `admin` VALUES ('4', '4', '4', '1112@qq.com', '4');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `number` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `home` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '21', '21', '21', '1');
INSERT INTO `user` VALUES ('2', '3', '4', null, '1');
INSERT INTO `user` VALUES ('22', '22', '22', '22@qq', '22');
INSERT INTO `user` VALUES ('3', '3', '3', '1112@qq.com', '3');

-- ----------------------------
-- Table structure for userhome
-- ----------------------------
DROP TABLE IF EXISTS `userhome`;
CREATE TABLE `userhome` (
  `number` varchar(255) NOT NULL,
  `adminhome` varchar(255) DEFAULT NULL,
  `thing` int(11) DEFAULT NULL,
  `date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userhome
-- ----------------------------
INSERT INTO `userhome` VALUES ('1', '2', '3', '2019-12-25 21:47:26');
