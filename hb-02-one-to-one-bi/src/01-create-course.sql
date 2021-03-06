DROP SCHEMA IF EXISTS `hb-03-one-to-many`;

CREATE SCHEMA `hb-03-one-to-many`;

USE `hb-03-one-to-many`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `instructor_detail`;

CREATE TABLE `instructor_detail`(
`id` int(11) NOT NULL AUTO_INCREMENT,
`you_tube_channel` VARCHAR(125) DEFAULT NULL,
`hobby` VARCHAR(45) DEFAULT NULL,
PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `instructor`;

CREATE TABLE `instructor`(
`id` int(11) NOT NULL AUTO_INCREMENT,
`first_name` VARCHAR(45) DEFAULT NULL,
`last_name` VARCHAR(45) DEFAULT NULL,
`email` VARCHAR(45) DEFAULT NULL,
`instructor_detail_id` INT(11) DEFAULT NULL,
PRIMARY KEY(`id`),
KEY `FK_DETAIL_idx`(`instructor_detail_id`),
CONSTRAINT `FK_DETAIL` FOREIGN KEY(`instructor_detail_id`) REFERENCES `instructor_detail`(`id`) ON DELETE NO ACTION ON UPDATE NO ACTION)
ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course`(
`id` INT(11) NOT NULL AUTO_INCREMENT,
`title` VARCHAR(128) DEFAULT NULL,
`instructor_id` INT(11) DEFAULT NULL,
PRIMARY KEY(`id`),
UNIQUE KEY `TITLE_UNIQUE`(`title`),
KEY `FK_INSTRUCTOR_idx`(`instructor_id`),
FOREIGN KEY(`instructor_id`)
REFERENCES `instructor`(`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;





