# spring-boot-session-redisson
Spring Boot Demo project Integration of Spring Security with Spring Session and Redisson


=== Dependency Version
- Sprint Boot - 2.0.4.RELEASE => https://spring.io/projects/spring-boot
- Spring Security - 5.0.7.RELEASE => https://spring.io/projects/spring-security
- Spring session - 2.0.5.RELEASE => https://spring.io/projects/spring-session
- Redisson - 3.8.0 => https://github.com/redisson/redisson


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
- Check data in the redis database 


```shell
# list all spring session in the redis
redis-cli -a 123456789 keys "redisson_spring_session*"
# ready the content of a session  
redis-cli -a 123456789 hgetall redisson_spring_session:238f20ce-9b91-4415-8cd4-525791c59f51
# you should see the spring session and the spring security stuff like that 
1) "\xfc\x14session:creationTime"
2) "\xf6\x82z\xb6C\xd8e\x01\x00\x00"
3) "\xfc\x17SPRING_SECURITY_CONTEXT"
4) "\x00\x01=org.springframework.security.core.context.SecurityContextImpl\x00\x01Oorg.springframework.security.authentication.UsernamePasswordAuthenticationToken\x80\x00\x01&java.util.Collections$UnmodifiableListB\x00\x10\x01\x00\x01Borg.springframework.security.core.authority.SimpleGrantedAuthority\xfc\nROLE_ADMIN\x00\x00B\xf9\x80\xbd\x00\x00\xff\x00\x01Horg.springframework.security.web.authentication.WebAuthenticationDetails\xfc\t127.0.0.1\xff\x00\x00\x012org.springframework.security.core.userdetails.User\xf0\x00\x01%java.util.Collections$UnmodifiableSet\x00\x167c\x00\xed\x00\x01Forg.springframework.security.core.userdetails.User$AuthorityComparator\x00\x01\xed\xf9\x80\xc0\x00\x00\xff\xfc\x05admin\x00\x00\x00"
5) "\xfc\x18session:lastAccessedTime"
6) "\xf6\x82\xca\xb6C\xd8e\x01\x00\x00"
7) "\xfc\x1bsession:maxInactiveInterval"
8) "\xf6\x80\b\a"

```

- Logout at http://localhost:2222/logout



