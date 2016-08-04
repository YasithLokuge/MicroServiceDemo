# MicroServiceDemo

**Licensed under the [Apache License](http://www.apache.org/licenses/LICENSE-2.0) , Version 2.0**

### Prerequisites

- **Java 8 (JDK)**

- **Maven 3.0.5 or above**


(1) Execute the following command in the terminal

```
mvn clean install
```

(2) Navigate to the target directory

```
cd target
```
(5) Execute the following command to start the server
```
java -jar MicroServiceDemo-0.1-SNAPSHOT.jar
```

(4) GET method Invokation : Navigate to `http://localhost:8081/service` on a web browser or execute the following command
```
curl -v http://localhost:8081/service
```

(5)POST method Invokation : Execute the following command in terminal
```
curl -X POST -H "Content-Type: application/json" -d '{ "name": "yasith", "age": "25", "height": "6" }' "http://localhost:8081/service"
```