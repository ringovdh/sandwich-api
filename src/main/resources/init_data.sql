insert into ingredient(id, category, name, stock) values (1, 'Vegetables', 'Tomato', 3);
insert into ingredient(id, category, name, stock) values (2, 'Vegetables', 'Salad', 3);
insert into ingredient(id, category, name, stock) values (3, 'Cheese', 'Cheddar', 2);
insert into ingredient(id, category, name, stock) values (4, 'Eggs', 'Egg', 3);
insert into ingredient(id, category, name, stock) values (5, 'Meat', 'Ham', 3);

insert into sandwich(id, name, price) values (1, 'Cheese sandwich', 4.5);
insert into sandwich(id, name, price) values (2, 'Ham sandwich', 4.0);
insert into sandwich(id, name, price) values (3, 'Egg sandwich', 3.8);

insert into sandwich_ingredient(id, sandwich_id, ingredient_id) values (1, 1, 1);
insert into sandwich_ingredient(id, sandwich_id, ingredient_id) values (2, 1, 2);
insert into sandwich_ingredient(id, sandwich_id, ingredient_id) values (3, 1, 3);
insert into sandwich_ingredient(id, sandwich_id, ingredient_id) values (4, 2, 5);
insert into sandwich_ingredient(id, sandwich_id, ingredient_id) values (5, 2, 1);
insert into sandwich_ingredient(id, sandwich_id, ingredient_id) values (6, 2, 2);
insert into sandwich_ingredient(id, sandwich_id, ingredient_id) values (7, 3, 3);
insert into sandwich_ingredient(id, sandwich_id, ingredient_id) values (8, 3, 2);