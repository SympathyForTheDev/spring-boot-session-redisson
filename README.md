# spring-boot-session-redisson
Spring Boot Demo project Integration of Spring Security with Spring Session and Redisson

=== Setting Up a Redis Server

The server is available for free here https://redis.io/download

Follow the installation instruction and then start the server:

```shell
$ redis-server
```

=== Run the Sample Application

With Gradle
```shell
$ ./gradlew clean bootRun
```

=== Test the application

- Open the browser and access the application at http://localhost:2222/login
- Login with credential "admin/password"
- Logout at http://localhost:2222/logout

