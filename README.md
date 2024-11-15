# Video Game Shopping System
![https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html](https://img.shields.io/badge/java-v1.8-red) 
![](https://img.shields.io/badge/nginx-v1.18.0-blue)
![https://archive.apache.org/dist/tomcat/tomcat-8/v8.5.75/](https://img.shields.io/badge/tomcat-v8.5.75-green)
![](https://img.shields.io/badge/maven-v3.6.3-yellow)
![](https://img.shields.io/badge/mysql-v8.0.39-purple)
![](https://img.shields.io/badge/redis-v5.0.7-orange)

This web-based platform allows users to explore, purchase, and manage video games in a seamless and user-friendly environment. Following is an overview of this platform.
* **User Login and Registration**
Users can easily create an account to access the full range of shopping features. Existing users can securely log in to manage their profiles and view their purchase history.
* **Game Browsing and Ordering**
Users can discover a wide selection of video games on the platform. They can browse by genre, popularity, and more. Once they find a game they like, they can add it to their cart and complete the purchase easily.
* **Game Management System**
For developers, the Game Management System offers tools to manage the issued games. They can add, update, or remove games.

## Technology List
* Spring Cloud
* Zuul
* Eureka
* MySQL
* Redis
* Kafka

## Deployment
### Tomcat
Configure Tomcat server with `conf/server.xml`. Add Context under Host label.
```xml
<Context docBase="/path/to/frontend" path="/" reloadable="true" />
```

### Nginx Forward
Configure Nginx server with `nginx.conf`. Listen port 9000 and forward requests whose url contains `/api/` to the gateway and others to Tomcat.
```conf
server {
    listen       9000;
    server_name  localhost;

    proxy_set_header X-Forwarded-Host $host;
    proxy_set_header X-Forwarded-Server $host;
    proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
    location ^~\.jsp {
            proxy_pass http://127.0.0.1:8080;
            proxy_connect_timeout 600;
            proxy_read_timeout 600;
    }
    location /api/ {
            proxy_pass http://127.0.0.1:10010;
            proxy_connect_timeout 600;
            proxy_read_timeout 600;
    }
    location / {
            proxy_pass http://127.0.0.1:8080;
            proxy_connect_timeout 600;
            proxy_read_timeout 600;
    }
}
```

## Screenshots
![Screenshot 2024-11-12 at 9.14.39 PM](assets/Screenshot%202024-11-12%20at%209.14.39%20PM.png)

![Screenshot 2024-11-12 at 9.49.13 PM](assets/Screenshot%202024-11-12%20at%209.49.13%20PM.png)
![Screenshot 2024-11-12 at 9.59.57 PM](assets/Screenshot%202024-11-12%20at%209.59.57%20PM.png)
![Screenshot 2024-11-12 at 10.04.21 PM](assets/Screenshot%202024-11-12%20at%2010.04.21%20PM.png)
![Screenshot 2024-11-12 at 10.11.16 PM](assets/Screenshot%202024-11-12%20at%2010.11.16%20PM.png)
![Screenshot 2024-11-12 at 10.30.13 PM](assets/Screenshot%202024-11-12%20at%2010.30.13%20PM.png)




