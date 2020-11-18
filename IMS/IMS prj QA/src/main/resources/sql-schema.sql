drop schema ims;
CREATE SCHEMA IF NOT EXISTS `customerorders`;
USE `customerorders` ;
CREATE TABLE IF NOT EXISTS `customerorders`.`customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) NULL DEFAULT NULL,
    `last_name` VARCHAR(40) NULL DEFAULT NULL,
    PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `customerorders`.`items` (
    `item_id` INT(11) NOT NULL AUTO_INCREMENT,
    `price` DECIMAL(10,2) NOT NULL,
    PRIMARY KEY (`item_id`)
);
