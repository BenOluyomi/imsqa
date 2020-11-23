INSERT INTO `customerorders`.`customers` (`first_name`, `last_name`) VALUES ('jordan', 'harrison');
INSERT INTO `customerorders`.`customers` (`first_name`, `last_name`) VALUES ('david', 'stone');

INSERT INTO `customerorders`.`items` (`product_name`, `item_price`) VALUES ('guitar', 74.99);
INSERT INTO `customerorders`.`items` (`product_name`, `item_price`) VALUES ('microphone', 89.99);

INSERT INTO `customerorders`.`orders` (id, order_id) VALUES (1, 1);
INSERT INTO `customerorders`.`orders` (id, order_id) VALUES (2, 2);

INSERT INTO `customerorders`.`order_items` (order_id, item_id, quantity) VALUES (1, 1, 3);
INSERT INTO `customerorders`.`order_items` (order_id, item_id, quantity) VALUES (2, 2, 2);