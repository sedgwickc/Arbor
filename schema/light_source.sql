create table light_source(
id int primary key,
isArtificial boolean,
manufacturer varchar(255),
first_use date,
condition int,
lumens int,
spectrum int,
technology enum('LED', 'FLORESCENT', 'HID', 'NATURAL'),
picture blob);