# MicroservicesUsingSpringBoot
This is a CRUD application made using Java SpringBoot for Computer Lab Management

# open first command prompt
cd get-service
mvnw spring-boot:run
http://localhost:3001/get/all
http://localhost:3001/get/1

# open second command prompt
cd lab-service
mvnw spring-boot:run
http://localhost:3002/create
http://localhost:3002/update/1
http://localhost:3002/delete/1
http://localhost:3002/deleteAll

# open third command prompt
cd discovery_service
mvnw spring-boot:run
http://localhost:3000

# open fourth command prompt 
cd gateway_service
mvnw spring-boot:run
http://localhost:3081/lab-service/create
http://localhost:3081/lab-service/update/2
http://localhost:3081/get/all
http://localhost:3081/get/4
