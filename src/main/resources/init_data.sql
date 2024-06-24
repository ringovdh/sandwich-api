insert into ingredient(id, category, name, stock) values (1, 'Vegetables', 'Tomato', 3);
insert into ingredient(id, category, name, stock) values (2, 'Vegetables', 'Salad', 3);
insert into ingredient(id, category, name, stock) values (3, 'Cheese', 'Cheddar', 2);
insert into ingredient(id, category, name, stock) values (4, 'Eggs', 'Egg', 3);
insert into ingredient(id, category, name, stock) values (5, 'Meat', 'Ham', 3);

insert into sandwich(id, name, product_ref, price) values (1, 'Cheese sandwich', 'SWC-0001', 4.5);
insert into sandwich(id, name, product_ref, price) values (2, 'Ham sandwich', 'SWC-0002', 4.0);
insert into sandwich(id, name, product_ref, price) values (3, 'Egg sandwich','SWC-0003', 3.8);

insert into sandwich_ingredient(id, sandwich_id, ingredient_id) values (1, 1, 1);
insert into sandwich_ingredient(id, sandwich_id, ingredient_id) values (2, 1, 2);
insert into sandwich_ingredient(id, sandwich_id, ingredient_id) values (3, 1, 3);
insert into sandwich_ingredient(id, sandwich_id, ingredient_id) values (4, 2, 5);
insert into sandwich_ingredient(id, sandwich_id, ingredient_id) values (5, 2, 1);
insert into sandwich_ingredient(id, sandwich_id, ingredient_id) values (6, 2, 2);
insert into sandwich_ingredient(id, sandwich_id, ingredient_id) values (7, 3, 3);
insert into sandwich_ingredient(id, sandwich_id, ingredient_id) values (8, 3, 2);