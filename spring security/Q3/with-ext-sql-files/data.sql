INSERT INTO users(username, password, enabled)
VALUES ('aavi','aavi' ,true);

INSERT INTO users(username, password, enabled)
VALUES ('snehal','snehal', true);


INSERT INTO authorities(username,authority)
VALUES ('aavi','ROLE_USER');

INSERT INTO authorities(username,authority)
VALUES ('snehal','ROLE_ADMIN');