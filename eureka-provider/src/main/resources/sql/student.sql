/*
Navicat MySQL Data Transfer

Source Server         : 101.132.66.175
Source Server Version : 50638
Source Host           : 101.132.66.175:3306
Source Database       : student

Target Server Type    : MYSQL
Target Server Version : 50638
File Encoding         : 65001

Date: 2018-07-06 13:09:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `sno` int(15) NOT NULL,
  `sname` varchar(50) DEFAULT NULL,
  `sex` char(2) DEFAULT NULL,
  `dept` varchar(25) DEFAULT NULL,
  `birth` date DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  PRIMARY KEY (`sno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '李同学', '1', '王同学学习成绩很不错', '2010-07-22', '17');
