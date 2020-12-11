create table container(
id identity,
location varchar(255),
description varchar(255),
status enum('EMPTY', 'IN_USE', 'DAMAGED', 'RETIRED'),
drainage boolean,
width float,
height float,
volume float,
material enum('PLASTIC', 'CERAMIC', 'METAL', 'WOOD', 'TERRACOTTA', 'FIBER', 'CONCRETE', 'UNKNOWN'),
type enum('SOIL', 'HYDRO'),
picture blob,
foreign key (location) references location(name));