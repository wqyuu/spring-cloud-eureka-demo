/*
Navicat MySQL Data Transfer

Source Server         : 101.132.66.175
Source Server Version : 50638
Source Host           : 101.132.66.175:3306
Source Database       : teacher

Target Server Type    : MYSQL
Target Server Version : 50638
File Encoding         : 65001

Date: 2018-07-06 13:09:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `Tno` varchar(20) NOT NULL DEFAULT '',
  `Tname` varchar(50) DEFAULT NULL,
  `sex` char(2) DEFAULT NULL,
  `dept` varchar(25) DEFAULT NULL,
  `birth` date DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  PRIMARY KEY (`Tno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', '王老师', '1', '王老师上课很认真', '2018-07-06', '35');
