# Fetch-Rewards-Pyramid-Words-Web-Service
A web service to evaluate if a word is a pyramid word created using Spring and Maven.

After downloading:
- Simply run the command below in the directory named "Pyramid Words":
  - MacOS/Linux: ./mvnw spring-boot:run 
  - Windows: mvnw spring-boot:run 
- Then connect to http://localhost:8080/pyramidWord
- This defaults the word to process as "banana"
- Optionally, append "?word=" and the word you wish to evaluate like so
  - Example: http://localhost:8080/pyramidWord?word=bandana
