create schema sharding;
create schema sharding1;

create table sharding.sharding_first_0
(
    `idf`     INT UNSIGNED AUTO_INCREMENT,
    `title`   VARCHAR(100) NOT NULL,
    `author`  VARCHAR(40)  NOT NULL,
    `date`    DATETime,
    `title_id`  int(12),
    `column_id` int(12),
    PRIMARY KEY (`idf`)
)
    comment 'test';
create table sharding.sharding_first_1
(
    `idf`     INT UNSIGNED AUTO_INCREMENT,
    `title`   VARCHAR(100) NOT NULL,
    `author`  VARCHAR(40)  NOT NULL,
    `date`    DATETime,
    `title_id`  int(12),
    `column_id` int(12),
    PRIMARY KEY (`idf`)
)
    comment 'test';

create table sharding1.sharding_first_0
(
    `idf`     INT UNSIGNED AUTO_INCREMENT,
    `title`   VARCHAR(100) NOT NULL,
    `author`  VARCHAR(40)  NOT NULL,
    `date`    DATETime,
    `title_id`  int(12),
    `column_id` int(12),
    PRIMARY KEY (`idf`)
)
    comment 'test';
create table sharding1.sharding_first_1
(
    `idf`     INT UNSIGNED AUTO_INCREMENT,
    `title`   VARCHAR(100) NOT NULL,
    `author`  VARCHAR(40)  NOT NULL,
    `date`    DATETime,
    `title_id`  int(12),
    `column_id` int(12),
    PRIMARY KEY (`idf`)
)
    comment 'test';


-- truncate sharding.sharding_first_0;
-- truncate sharding.sharding_first_1;
-- truncate sharding1.sharding_first_0;
-- truncate sharding1.sharding_first_1;