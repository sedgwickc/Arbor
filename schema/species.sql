create table species(
name varchar(255),
genus varchar(255),
name_common varchar(255) unique,
water_amount int,
soil_type int,
light_amount int,
picture blob,
primary key(name, genus));