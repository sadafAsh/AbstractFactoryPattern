# AbstractFactoryPattern

     Abstract Factory pattern, provide a way to encapsulate a group of individual factories that have a 
common theme without specifying the concrete classes.It is one the best method to create an object where
 object creational is hidden from the client.It comes under creational design pattern. 


          In this project,there is a 'Animal' interface and a 'Dog','Cat','Duck' are the concrete class 
implementing it.There is 'Color' interface and 'Black','White','Grey' are the concrete class implementing 
it.AbstractFactory is the next step.Factoryclass(AnimalFactory and ColorFactory) is defined,which implements
the AbstractFactory which uses the Animal and Color class to find their objects.A factoryProducer is created.
Main class uses FactoryProducer to get a AbstractFactory object.It will pass information (color And Animal) 
to AbstractFactory to get the type of objects it needs.  


JunitTest:
     There is Junit Test for all the type of Abstract Factory pattern and test coverage in jacoco report is 100% 
successful.

SONARQUBE 

gradle command to publish code to SonarQube
gradle sonarqube 
  -Dsonar.projectKey=AbstractFactoryPattern 
  -Dsonar.host.url=http://localhost:9000 
  -Dsonar.login=013d9dff811b8ddf7ea9e53b9b3372aa175c2a48