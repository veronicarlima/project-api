# Project Springboot REST API Database & Docker 

Objective of this project to represents a Sample project, that you can use just like a skelleton to guide in the next projects. 

#### This project envolving the simple concepts such as : 

- GET methods
- Integration with Postgres Docker
- Pagination
- Request Postman to testing

You can find dependencys: 
- Springboot Web 

#### Modules to support : 

- Logback 
- 


#### Description Scope Project 

Sample API to used REST endpoints to connect with database using Postgres in Docker. This integration was applying pagination to return data.  


### Configurate Docker to use DataBase

I high recommend to use Docker Desktop, it's very easy to find the image to download. 
After that you can use some commands to provide alive the container to use. 

#### 1 Step - Create docker file with the instructions.     
Usually I put my Docker file in resources together with properties.properties.

#### 2 Step - Run the commands in the same directory that the file there  :                                          
"docker run -d --rm --name docker-database -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=local -p 5432:5432 postgres:17.2

#### 3 Step - Acess the docker desktop, and go to the Exec and run the command : 

#psql -U postgres -d local" 

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

Use method : POST 
Name : save-new-client
URL: localhost:8081/api/client
Body: 
{
"clientName":"Andrea",
"address":"St. Clair Ave - 997852",
"observation":"Housekeeping"
}


## References 

Pages that support all the content with this project 
- [Context about Global Expection Handler](https://www.springjavalab.com/2025/05/spring-boot-global-exception-handling.html)
