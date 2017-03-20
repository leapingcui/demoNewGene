/*
SQLyog Ultimate v12.09 (32 bit)
MySQL - 5.7.13-log : Database - gene
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`gene` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `gene`;

/*Table structure for table `classes` */

DROP TABLE IF EXISTS `classes`;

CREATE TABLE `classes` (
  `cla_id` varchar(16) NOT NULL,
  `cla_name` varchar(16) DEFAULT NULL,
  `cla_total_num` int(8) DEFAULT NULL,
  PRIMARY KEY (`cla_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `classes` */

insert  into `classes`(`cla_id`,`cla_name`,`cla_total_num`) values ('1','一班',10),('2','二班',20),('3','三班',30);

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `stu_id` int(10) NOT NULL,
  `stu_pwd` varchar(32) DEFAULT NULL,
  `stu_name` varchar(16) DEFAULT NULL,
  `stu_sex` varchar(4) DEFAULT '男',
  `stu_birth` date DEFAULT NULL,
  `stu_cla_id` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`stu_id`),
  KEY `stu_cla_id_fk` (`stu_cla_id`),
  CONSTRAINT `stu_cla_id_fk` FOREIGN KEY (`stu_cla_id`) REFERENCES `classes` (`cla_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`stu_id`,`stu_pwd`,`stu_name`,`stu_sex`,`stu_birth`,`stu_cla_id`) values (101,'101','崔一','男','1992-10-23','1'),(102,'102','崔二','女','2017-03-08','2'),(103,'103','崔三','女','2017-03-20','1'),(115,'115','崔十五','女','2017-03-18','1'),(116,'116','崔十六','女','2017-03-18','2'),(122,'122','崔二十二','男','2017-03-16','1');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
