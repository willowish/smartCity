# Users schema

# --- !Ups

CREATE TABLE user (
    username varchar(255) not NULL,
    password varchar(255),
    role varchar(255),
    company_id bigint,
    PRIMARY KEY (username)
);

# --- !Downs

DROP TABLE user;
