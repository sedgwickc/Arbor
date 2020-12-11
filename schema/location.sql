create table location (
type enum('INDOORS', 'OUTDOORS'),
name varchar(255),
temperature_avarage int,
humidity_average int,
light_source int,
primary key(name),
foreign key (light_source) references light_source(id));