DROP TABLE IF EXISTS champion;

-- case-insensitive: ko quan trong viet thuong or viet hoa
 --Champion CHAMPION
CREATE TABLE champion (
    ID int auto_increment primary key,
    Name text,
    Lane text
);

-- must define a schema

INSERT INTO champion (ID, Name, Lane) VALUES(1, 'Yasuo', 'Mid');
INSERT INTO champion (Name, Lane) VALUES('Ahri', 'Mid');
INSERT INTO champion VALUES('Jinx', 'AD');



