# Guice-Injection-Sample

Sample Program that described on the how the GUICE successfully does the Dependency Injection

## Guice Sample - "Welcome" Display

The intention of the application in a simple terms to understand the dependency injection using GUICE framework. Once you have configured as a maven project, use the below maven dependency to successfully use the Google's Guice JAR.

`<dependency>
  <groupId>com.google.inject</groupId>
  <artifactId>guice</artifactId>
  <version>5.1.0</version>
</dependency>`

After adding the above, We usually need a custom module class to be create which will extend the AbstractModule class of GUICE to override the methods based on our needs and perform the desired operation in the application.

In our example, We have override the configure method to bind the *WelcomeMessage* interface class with the *WelcomeMessageImpl* implementation class. 
Later, we have used @Inject annotation in the service class which holds a parameterized constructor. The constructor receives the *WelcomeMessage* instance, which will now work as per our configuration made in our custom module.

And finally, We are seeing the WELCOME message being displayed successfully. - This is just a quick example which can make you understand the need of Google's Guice.
