CREATE USER 'monster_dev'@'%' IDENTIFIED BY 'monster_dev';
GRANT ALL PRIVILEGES ON monster.* TO 'monster_dev'@'%' WITH GRANT OPTION;
FLUSH PRIVILEGES;