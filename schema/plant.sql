create table plant(
id identity,
species varchar(255),
date_acquired date,
status enum('HEALTHY', 'SICK', 'DEAD', 'DORMANT', 'FLOWERING', 'GROWTH'),
location varchar(255),
parent int,
water_amount int,
soil varchar(100),
light_source int,
container int,
foreign key (species) references species(name_common),
foreign key (location) references location(name),
foreign key (parent) references plant(id),
foreign key (soil) references soil(name),
foreign key (light_source) references light_source(id),
foreign key (container) references container(id)
)

