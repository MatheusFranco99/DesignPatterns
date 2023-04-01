# Dependency Injection

The main idea is to separate the creation of an object from its use. In this approach, dependencies are injected into the object rather than being hard-coded or coupled with its implementation. 

For example: you have a web app that requires access to database. You could hard code the access to the database as one of the features of your main class. However, if the database needed to change, you wouldn't be able to this. The only way would be to rewrite the code. Using DI, you would inject the database connection object into the application.
