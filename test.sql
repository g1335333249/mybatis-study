/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : mybatis

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 13/07/2019 14:24:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for class_info
-- ----------------------------
DROP TABLE IF EXISTS `class_info`;
CREATE TABLE `class_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of class_info
-- ----------------------------
BEGIN;
INSERT INTO `class_info` VALUES (1, '三年二班');
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `type` int(11) DEFAULT NULL COMMENT '用户类型0普通用户，1管路员',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (1, '张三', '13311112222', NULL);
INSERT INTO `user` VALUES (2, '李四', '9999', 1);
INSERT INTO `user` VALUES (3, '李四', '9999', 1);
INSERT INTO `user` VALUES (4, '李四', '9999', 1);
INSERT INTO `user` VALUES (5, '李四', '9999', 1);
INSERT INTO `user` VALUES (6, '李四', '9999', 1);
INSERT INTO `user` VALUES (7, '李四test', '9999test', 1);
INSERT INTO `user` VALUES (8, '李四', '9999', 1);
INSERT INTO `user` VALUES (9, '李四test', '9999test', 1);
INSERT INTO `user` VALUES (10, '李四test', '9999test', 1);
INSERT INTO `user` VALUES (11, '李四test', '9999test', 1);
INSERT INTO `user` VALUES (12, '李四test', '9999test', 1);
INSERT INTO `user` VALUES (13, '李四test', '9999test', 1);
INSERT INTO `user` VALUES (14, '李四test', '9999test', 1);
INSERT INTO `user` VALUES (15, '李四test', '9999test', 1);
INSERT INTO `user` VALUES (16, '李四test', '9999test', 1);
INSERT INTO `user` VALUES (17, '李四test', '9999test', 1);
INSERT INTO `user` VALUES (18, '李四test', '9999test', 1);
INSERT INTO `user` VALUES (19, '李四test', '9999test', 1);
INSERT INTO `user` VALUES (20, '李四test', '9999test', 1);
INSERT INTO `user` VALUES (21, '李四test', '9999test', 1);
INSERT INTO `user` VALUES (22, '李四test', '9999test', 1);
COMMIT;

-- ----------------------------
-- Table structure for user_class
-- ----------------------------
DROP TABLE IF EXISTS `user_class`;
CREATE TABLE `user_class` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `class_id` bigint(20) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user_class
-- ----------------------------
BEGIN;
INSERT INTO `user_class` VALUES (1, 1, 1);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
