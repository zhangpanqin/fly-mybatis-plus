DELETE
FROM `user`;

INSERT INTO `user` (id, name, sex, email)
VALUES (1, 'Jone', 1, 'test1@baomidou.com'),
       (2, 'Jack', 1, 'test2@baomidou.com'),
       (3, 'Tom', 2, 'test3@baomidou.com'),
       (4, 'Sandy', 2, 'test4@baomidou.com'),
       (5, 'Billie', 2, 'test5@baomidou.com');

DELETE
FROM `book`;

INSERT INTO `book` (id, name, data_json)VALUES (1,'庆余年', '[{"url": "url1", "fileName": "fileName1"}]');