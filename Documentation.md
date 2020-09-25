# Fetch-Rewards-Pyramid-Words-Web-Service
A web service to evaluate if a word is a pyramid word created using Spring and Maven.

After downloading the directory/folder named "Pyramid Words":
- Simply run the command below in terminal/bash at the directory/folder named "Pyramid Words":
  - MacOS/Linux: ./mvnw spring-boot:run 
  - Windows: mvnw spring-boot:run 
- Then connect to http://localhost:8080/pyramidWord
- This defaults the word to process as "banana"
- Optionally, append "?word=" and the word you wish to evaluate like so
  - Example: http://localhost:8080/pyramidWord?word=bandana

- To run locally, the following is required
  - Java
  - Maven
