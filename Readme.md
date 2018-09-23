# Gradle profiles
Example project to show how to generate and use different profiles for local, development and production environment by running a gradle task and making use of application configuration.

### Software and tools required
* Koltin 1.2.51
* Gradle 4.8
* Java 8

### Gradle Profiles
There are totally 3 environments: local, dev, prod.
* ***Local***
    ```
    $ gradle profileSetup -Penvironment=local build -x test
    ```
* ***Development***
    ```
    $ gradle profileSetup -Penvironment=prod build -x test
    ```
* ***Production***
    ```
    $ gradle profileSetup -Penvironment=dev build -x test
    ```
### Complete steps to run the project
* Navigate to the cloned project directory, i.e, **gradle-profile**

* Build the project by selecting appropriate gradle profile by using one of the above mentioned command.

* This creates/updates the application.properties file in **src** folder and generates the build based on the profile mentioned.

* Run the application by clicking run command or by running the jar created.

    * **Run Command**
        ```
        java -jar /build/libs/gradle-profile-0.0.1-SNAPSHOT.jar
        ```

        Now hit the base URL with port 9090. We can see a welcome message along with environment(profile) name on which the server is running.


**Author**\
Chandrika Rao C