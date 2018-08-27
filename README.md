# spring-boot-session-redisson
Spring Boot Demo project Integration of Spring Security with Spring Session and Redisson

=== Dependency Version
- Sprint Boot - 1.5.10.RELEASE
- Spring Security - 4.2.4.RELEASE
- Spring session - 2.0.1.RELEASE
- Redisson - 3.6.1

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

