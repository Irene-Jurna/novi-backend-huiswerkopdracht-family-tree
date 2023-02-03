drop table if exists wall_brackets;
drop table if exists ci_modules;
drop table if exists remote_controllers;
drop table if exists televisions;

create table televisions
(
    id            serial,
    name          varchar(255),
    brand         varchar(255),
    price         double precision,
    current_stock int DEFAULT 0,
    sold          int,
    type          varchar(255) NOT NULL UNIQUE,
    -- available double precision,
    refresh_rate  double precision,
    screen_type   varchar(255),
    primary key (id)
);

create table remote_controllers
(
    id              serial,
    name            varchar(255),
    brand           varchar(255),
    price           double precision,
    current_stock   int DEFAULT 0,
    sold            int,
    compatible_with varchar(255),
    battery_type    varchar(255),
    -- Kolom maken voor de foreign key (om de data types gelijk te maken):
    television_id   int,
    primary key (id),
    -- 1 op 1 relatie:
    foreign key (television_id) references televisions (id)
);

create table ci_modules
(
    id            serial,
    name          varchar(255),
    brand         varchar(255),
    price         double precision,
    current_stock int DEFAULT 0,
    sold          int,
    primary key (id),
    foreign key (id) references televisions (id)
);

-- Veel op veel relatie
create table wallbrackets
(
    id            serial,
    name          varchar(255),
    brand         varchar(255),
    price         double precision,
    current_stock int DEFAULT 0,
    sold          int
);

insert into televisions(name, brand, price, current_stock, sold, type, refresh_rate, screen_type)
values ('Oled', 'Samsung', 1100, 24, 152, 'XPH45', 66.5, 'XXL'),
       ('Frame', 'Samsung', 1450, 14, 243, 'FFG33', 75, 'IPS');

insert into remote_controllers(name, brand, price, current_stock, sold, battery_type, television_id)
values ('One for all', 'Philips', 10, 25, 60, 'aaa', (select id from televisions where type = 'XPH45'));

select *
from televisions
         join remote_controllers on televisions.id = remote_controllers.television_id;