/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : 127.0.0.1:3306
 Source Schema         : db2020

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 15/05/2020 01:31:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for com.demo.payment
-- ----------------------------
DROP TABLE IF EXISTS `com.demo.payment`;
CREATE TABLE `com.demo.payment`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `serial` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of com.demo.payment
-- ----------------------------
INSERT INTO `com.demo.payment` VALUES (1, 'lalallal');
INSERT INTO `com.demo.payment` VALUES (2, 'lalallal222');
INSERT INTO `com.demo.payment` VALUES (3, 'lalallal222');
INSERT INTO `com.demo.payment` VALUES (4, '服务调用生成');

SET FOREIGN_KEY_CHECKS = 1;
