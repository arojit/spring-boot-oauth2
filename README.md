# spring-boot-oauth2
Secure Spring REST API using OAuth2.

**Terminologies**
```
Resource Owner, Authorization Server, Resource Server
```

**Tools and Techniques**
```
Java Spring Boot, JPA-Hibernate, Rest APIs, MySQL, OAuth2
```

**prerequisite**
```
Java 8
```

**Run the following commands for setting up MYSQL in your machine as a docker container.**
```
> ./gradlew build
> java -jar build/libs/techmantra-0.0.1-SNAPSHOT.jar
```

**Try to access a resource without any auth info, wil get a 401.**

**Let's get the tokens via Postman**
```
1. Paste this in URL bar: http://localhost:8085/oauth/token?grant_type=password&username=bill&password=abc123

2. Go to Authorization tab 
     i. select Basic Auth from the TYPE dropdown menu.
     ii. username:  my-trusted-client (As mentioned in AuthorizationServerConfigurerAdapter)
         password:  secret (As mentioned in AuthorizationServerConfigurerAdapter)
3. Click on Preview Request button to add **Authorization Basic bXktdHJ1c3RlZC1jbGllbnQ6c2VjcmV0** as information in the request header

4. Send the request

  response:
      {
          "access_token": "79d9625a-0d52-4b1d-9877-ed5d54867fb3",
          "token_type": "bearer",
          "refresh_token": "5b36bfc5-62ec-423f-ad03-bdbddc9e8072",
          "expires_in": 120,
          "scope": "read write trust"
      }
   
   **I've set the life-span of the token only 120 seconds**
```

**APIs**
```
1. ADD USER: 

POST /user/add-user HTTP/1.1
Host: localhost:8085
Content-Type: application/json
Authorization: Bearer d39376dc-55ff-45b9-9ab6-dc16730bad76

{
	"user_name": "Arojit"
}

2. GET USERs:
GET /user/get-user HTTP/1.1
Host: localhost:8085
Authorization: Bearer d39376dc-55ff-45b9-9ab6-dc16730bad76

```