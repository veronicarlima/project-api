# project-api
Everything Rest Api 

Objective of this project to represents a Sample of funcionalitys that you can use in the project or get some skelleton to guide in the next projects. 

You can find in this project : 

- GET methods
- Integration with Postgres Docker
- LogBack
- Pagination
- Request Postman to testing

### Configurate Docker to use DataBase

I high recommend to use Docker Desktop, it's very easy to find the image to download. 
After that you can use some commands to provide alive the container to use. 

#### 1 Step - Create docker file with the instructions.     
Usually I put my Docker file in resources together with properties.properties.

#### 2 Step - Run the commands in the same directory that the file there  :                                          
"docker run -d --rm --name docker-database -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=local -p 5432:5432 postgres:17.2

#### 3 Step - Acess the docker desktop, and go to the Exec and run the command : 

#psql - U postgres -d local" 

#### 4 Step - You need to have the data already done for this step, because you just paste and execute

INSERT INTO CLIENT (CLIENT_ID, CLIENT_NAME, CLIENT_ADDRESS,CLIENT_DETAILS) VALUES ('9f717667-505a-4074-ba43-ceae2c0e9f4b', 'Adams', 'St . Roy', 'HOUSEKEEPING');

### Postman Requests

For the first REST request. 

Use method : GET   
name: get All Clients no format                     
URL : http://localhost:8081/api/client                      
Description : Just return everything exist on database

Use method : GET         
Name: pagination-client                       
URL : http://localhost:8081/api/client/pageClient?page=2&size=2                        
Description : Return with filter Pagination, URL with already the Params : Page and Size 

## References 

Pages that support all the content with this project 
- [Context about Global Expection Handler](https://www.springjavalab.com/2025/05/spring-boot-global-exception-handling.html)
