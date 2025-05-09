-- 创建公共数据库
CREATE DATABASE common_db
DEFAULT CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;
--赋权
GRANT ALL PRIVILEGES ON common_db.* TO 'root'@'localhost';
FLUSH PRIVILEGES;


