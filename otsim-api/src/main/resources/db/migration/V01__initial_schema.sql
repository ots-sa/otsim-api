CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(128) NOT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `application_name` varchar(45) DEFAULT NULL,
  `rocket_token` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `users` (`username`,`password`,`first_name`,`last_name`,`application_name`,`rocket_token`) 
VALUES ('topkas','otsdba','Stelios','Topkaroglou','Adacs',NULL);