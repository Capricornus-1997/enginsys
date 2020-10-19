/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : engine

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 19/10/2020 20:01:14
*/

CREATE DATABASE engine;
USE engine;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for attendance
-- ----------------------------
DROP TABLE IF EXISTS `attendance`;
CREATE TABLE `attendance`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gcmc` int(255) NULL DEFAULT NULL,
  `xm` int(11) NULL DEFAULT NULL,
  `rq` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `bz` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for engine
-- ----------------------------
DROP TABLE IF EXISTS `engine`;
CREATE TABLE `engine`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gcmc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `dz` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `isdelete` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of engine
-- ----------------------------
INSERT INTO `engine` VALUES (1, '工程1', '千岛湖镇新安大街111号', 1);
INSERT INTO `engine` VALUES (2, '工程2', '千岛湖镇新安大街111号', 0);
INSERT INTO `engine` VALUES (3, '工程3', '千岛湖镇新安大街111号', 0);

-- ----------------------------
-- Table structure for hrmresource
-- ----------------------------
DROP TABLE IF EXISTS `hrmresource`;
CREATE TABLE `hrmresource`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `xm` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sfzh` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `yhzh` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for material
-- ----------------------------
DROP TABLE IF EXISTS `material`;
CREATE TABLE `material`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gcmc` int(255) NULL DEFAULT NULL,
  `clmc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sl` int(255) NULL DEFAULT NULL,
  `jg` decimal(10, 0) NULL DEFAULT NULL,
  `hj` decimal(10, 0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `text` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `iconCls` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `state` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `fid` int(10) NULL DEFAULT NULL,
  `url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES (1, '系统参数', 'icon-sum', 'open', NULL, '');
INSERT INTO `menu` VALUES (2, '工程名称', '', NULL, 1, 'http://localhost:8080/home/engine');
INSERT INTO `menu` VALUES (3, '人力资源', 'icon-more', NULL, NULL, '');
INSERT INTO `menu` VALUES (4, '员工信息', NULL, NULL, 3, 'http://localhost:8080/home/hrmresource');
INSERT INTO `menu` VALUES (5, '考勤模块', 'icon-more', NULL, NULL, NULL);
INSERT INTO `menu` VALUES (6, '员工考勤', NULL, NULL, 5, 'http://localhost:8080/home/attendance');
INSERT INTO `menu` VALUES (7, '工程材料单', 'icon-more', NULL, NULL, NULL);
INSERT INTO `menu` VALUES (8, '材料单', NULL, NULL, 7, 'http://localhost:8080/home/material');

SET FOREIGN_KEY_CHECKS = 1;
