INSERT INTO `customerorders`.`customers` (`first_name`, `last_name`) VALUES ('jordan', 'harrison');
INSERT INTO `customerorders`.`customers` (`first_name`, `last_name`) VALUES ('david', 'stone');

INSERT INTO `customerorders`.`items` (`product_name`, `item_price`) VALUES ('guitar', 74.99);
INSERT INTO `customerorders`.`items` (`product_name`, `item_price`) VALUES ('microphone', 89.99);

INSERT INTO `customerorders`.`orders` (id, order_id) VALUES (1, 1);


INSERT INTO `customerorders`.`order_items` (order_id, item_id, quantity) VALUES (1, 1, 3);


alter table order_items add cost decimal(10,2);


update order_items set cost = ( select item_price from items where order_items.item_id = items.item_id);

alter table order_items add total_cost decimal(10,2);
update order_items set total_cost = quantity*cost;