# spring-boot-session-redisson
Spring Boot Demo project Integration of Spring Security with Spring Session and Redisson

=== Dependency Version
- Sprint Boot - 2.0.4.RELEASE
- Spring Security - 5.0.7.RELEASE
- Spring session - 2.0.5.RELEASE
- Redisson - 3.7.5

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

