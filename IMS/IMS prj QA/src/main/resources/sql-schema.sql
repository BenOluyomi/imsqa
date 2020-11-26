drop schema customerorders;
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
    `product_name` VARCHAR(40) NULL DEFAULT NULL,
    `item_price` DECIMAL(10,2) NULL DEFAULT NULL,
    PRIMARY KEY (`item_id`)
);


CREATE TABLE IF NOT EXISTS `customerorders`.`orders` (
    `order_id` INT(11) NOT NULL AUTO_INCREMENT,
    `id` INT,
    PRIMARY KEY (`order_id`),
    FOREIGN KEY (`id`) REFERENCES customers(`id`)
);


CREATE TABLE IF NOT EXISTS `customerorders`.`order_items` (
    `order_id` INT,
    `item_id` INT,
    `quantity` INT(11) NOT NULL,
    FOREIGN KEY (`order_id`) REFERENCES orders(`order_id`),
    FOREIGN KEY (`item_id`) REFERENCES items(`item_id`)
    
);

