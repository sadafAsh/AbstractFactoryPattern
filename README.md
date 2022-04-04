# AbstractFactoryPattern

     Abstract Factory pattern, provide a way to encapsulate a group of individual factories that have a 
common theme without specifying the concrete classes.It is one the best method, to create an object where
 object creational is hidden from the client.It comes under creational design pattern. 


          In this project,'Dog','Cat','Duck' are the concrete classes that implement the 'Animal' interface.
'Black','White','Grey' are the concrete classes that implement the 'Color' interface.AbstractFactory is the
next step.Factory class(AnimalFactory and ColorFactory) is also defined,which implements AbstractFactory 
which uses the Animal and Color class to find their objects.Main class uses FactoryProducer class to get a 
AbstractFactory object.It will pass information ("Color" And "Animal") to AbstractFactory to get the type
of objects it needs.  


JunitTest:
     The  Junit Test is done of all the classes in  Abstract Factory pattern project and test coverage is
100% successful in jacoco report.

       
  SONARQUBE :
          In sonarqube,reliability ,security , securityReview and maintainability is A and 
the code coverage is 100%. 
  

SONARQUBE :

gradle command to publish code to SonarQube
gradle sonarqube 
  -Dsonar.projectKey=AbstractFactoryPattern 
  -Dsonar.host.url=http://localhost:9000 
  -Dsonar.login=013d9dff811b8ddf7ea9e53b9b3372aa175c2a48