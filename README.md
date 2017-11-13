5 Maven Archetypes to create : java app, java library, web app with spring mvc, web app with spring boot, rest service with spring boot.

Java app features :
- Shade plugin.
- Executable jar.
- log4j2.

Web app features :
- Tomcat7 plugin.
- Spring MVC / Spring Boot
- log4j2.
- run project : mvn tomcat7:run / mvn spring-boot:run
- spring boot project also can be run by executing jar file : java -jar (artifactId).jar
- test url : http://localhost:8080/

Java Library :
- log4j2.

Install using : mvn install<br/>
To create project, run : mvn archetype:generate -DarchetypeCatalog=local
