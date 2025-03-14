# Step1-git clone 

> git clone 

```bash
git clone 
```





# Step2-execute docker-compose

> execute docker-compose

i use docker-desktop in windows 

```bash
docker-compose up -d
```

![step2-docker-compose](./assets/step2-docker-compose.png)

after that you can see container like this

![step2-docker-compose-2](./assets/step2-docker-compose-2.png)



# Step3-execute sql

> init mysql

use nacos require create table in mysql. I provide sql script.

![Step3-before-execute-sql](./assets/Step3-before-execute-sql.png)

1、execute `alter_root_login_plugin.sql`

![Step3-execute-sql-1](./assets/Step3-execute-sql-1.png)

2、execute `nacos_init.sql`

![Step3-execute-sql-2](./assets/Step3-execute-sql-2.png)

after execute sql table in mysql like this

![Step3-after-execute-sql](./assets/Step3-after-execute-sql.png)

# Step4-restart Nacos

> `restart nacos`

you can access nacos UI through the following URL 

```http
http://localhost:8848/nacos/
```

![Step4](./assets/Step4.png)

add following configuration in nacos

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/naos?autoReconnect=true&allowMultiQueries=true&sslMode=DISABLED&useUnicode=true&characterEncoding=UTF8&useLocalSessionState=true&connectionTimeZone=UTC
    username: root
    password: root
test:
  flag: true
```

![Step4-2](./assets/Step4-2.png)

![Step4-3](./assets/Step4-3.png)

finally you can see as follow

![Step4-4](./assets/Step4-4.png)

# Step5-run SpringBoot 

![Step5](./assets/Step5.png)

# Step6-change configuration in nacos

![Step6](./assets/Step6.png)

![Step6-3](./assets/Step6-3.png)

# Step7

**then you can see error in springboot project**

![Step7](./assets/Step7.png)

# Step8
![Step8-debug-condition](./assets/Step8-debug-condition.png)

![Step8-debug-condition-2](./assets/Step8-debug-condition-2.png)