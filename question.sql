/*
Navicat MySQL Data Transfer

Source Server         : jdbcdemo
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : question

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2019-12-05 08:41:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `question`
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
  `question_id` int(11) NOT NULL AUTO_INCREMENT,
  `question_title` varchar(256) DEFAULT NULL,
  `option_a` varchar(128) DEFAULT NULL,
  `option_b` varchar(128) DEFAULT NULL,
  `option_c` varchar(128) DEFAULT NULL,
  `option_d` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`question_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of question
-- ----------------------------
INSERT INTO `question` VALUES ('1', '目前大家普遍认同的地震成因是', '大陆漂移说', '板块构造说', '海底扩张说', '地震核变成因论');
INSERT INTO `question` VALUES ('2', '中国位于哪个地震带？', '环太平洋地震带', '欧亚地震带', '大洋中脊（海岭）地震带', '大陆断裂谷地震带');
INSERT INTO `question` VALUES ('3', '中国地震主要分布在哪些区域？', '西北地区', '华北地区', '西南地区', '台湾地区');
INSERT INTO `question` VALUES ('4', '以下哪种地震发生的次数最多，破坏力也最大？', '构造地震', '人工地震', '火山地震', '塌陷地震');
INSERT INTO `question` VALUES ('5', '以下哪些可能是地震前的征兆？', '地下水变味', '动物烦躁不归巢', '有声音从地下传来', '地下冒出有颜色有异味的气体');
INSERT INTO `question` VALUES ('6', '你认为地震能够预测吗？', '能具体预测', '能大概预测其方位', '完全不能预测', '视情况而定');
INSERT INTO `question` VALUES ('7', '通常你是通过什么途径关注了解地震的？', '网络媒体', '听别人说的', '无意间看到', '没了解过');
INSERT INTO `question` VALUES ('8', '如果不幸被埋压怎么办？', '找一藏身处', '大声呼救', '逃跑', '待在原地');
INSERT INTO `question` VALUES ('9', '如果被压时间很长且你很困的时候，你该怎么办？', '努力提神', '回忆美好事物', '大声呐喊', '不断鼓励自己');
INSERT INTO `question` VALUES ('10', '您对地震有关安全防范逃生知识关心么？', '非常关心', '经常关心', ' 偶尔关心', '从不关心');

-- ----------------------------
-- Table structure for `result`
-- ----------------------------
DROP TABLE IF EXISTS `result`;
CREATE TABLE `result` (
  `result_id` int(11) NOT NULL DEFAULT '0',
  `select_a` int(11) DEFAULT NULL,
  `select_b` int(11) DEFAULT NULL,
  `select_c` int(11) DEFAULT NULL,
  `select_d` int(11) DEFAULT NULL,
  PRIMARY KEY (`result_id`),
  CONSTRAINT `question_result` FOREIGN KEY (`result_id`) REFERENCES `question` (`question_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of result
-- ----------------------------
INSERT INTO `result` VALUES ('1', '56', '45', '84', '45');
INSERT INTO `result` VALUES ('2', '45', '23', '87', '96');
INSERT INTO `result` VALUES ('3', '88', '45', '62', '12');
INSERT INTO `result` VALUES ('4', '56', '87', '21', '36');
INSERT INTO `result` VALUES ('5', '96', '12', '48', '75');
INSERT INTO `result` VALUES ('6', '78', '45', '15', '43');
INSERT INTO `result` VALUES ('7', '45', '65', '14', '47');
INSERT INTO `result` VALUES ('8', '45', '85', '24', '45');
INSERT INTO `result` VALUES ('9', '56', '45', '12', '32');
INSERT INTO `result` VALUES ('10', '23', '15', '56', '75');
