# Class Reflection – 01-09-2026

## Topics Covered

- Entry point and execution of a Java application
- Maven, JAR files, and repositories
- Dependencies, transitive dependencies, and JavaFX packages
- Java versions, source version, runtime version, and backward compatibility
- UTF-8 and character sets
- JUnit and different types of testing
- CI/CD pipelines, YAML files, integration, and deployment

## Notes

### Entry Point, Maven, JAR Files, and Repositories

In this class, we discussed how a Java application is executed and what happens beyond simply writing and running a Java file. One of the first concepts was the **entry point** of a program. The entry point is the point from which the execution of an application begins. In a Java program, this is generally associated with the `main()` method. Understanding the entry point helped me realise that a program needs a defined place from which the system can begin executing the instructions.

We then discussed **Maven** and its role in managing a Java project. Maven helps in building a project by managing different processes such as compiling the source code, handling dependencies, running tests, and packaging the application. We discussed the `mvn install` command and how, after the project is successfully built, a JAR file can be created.

A **JAR file** contains the packaged application and can be used for storing and distributing the compiled project. When Maven installs a project, the required files can also be stored in a repository. This led to the discussion of **local repositories and remote repositories**.

A local repository is present on our own computer and stores downloaded dependencies and packages that can later be reused. A remote repository is an external location from where Maven can obtain dependencies and other required packages. Understanding this helped me see why developers do not have to manually download every library every time they create a project. Maven can manage these resources through repositories.

### Dependencies, Transitive Dependencies, and JavaFX Modules

Another important part of the class was understanding **dependencies**. A dependency is an external library or package that our program requires in order to use certain functionality. Instead of writing every feature from scratch, developers can use existing libraries by adding them as dependencies to their project.

We also discussed **transitive dependencies**. This means that when we add one dependency to our project, that dependency may itself require other libraries to function correctly. These additional required libraries can automatically be downloaded and included. This helped me understand why sometimes many packages appear in a project even though we may have directly added only one dependency.

We also explored JavaFX-related packages such as **Controls, FXML, Web, and Media**. These packages provide different functionalities for an application. Controls provide graphical interface components such as buttons and other UI elements. FXML is related to defining and organising the structure of a JavaFX user interface. Web provides functionality related to browser and web content, while Media supports multimedia features such as audio and video.

We also discussed the idea of a **BOM (Bill of Materials)** in dependency management. I understood that when a project uses multiple related dependencies, it becomes important to manage compatible versions. The BOM helps organise these versions so that related libraries can work together properly.

### Java Versions, Source Version, Runtime Version, and Compatibility

We also discussed different Java versions, including Java release versions such as **Java 17**, and why version compatibility is important in software development.

The **source version** refers to the Java version and language features targeted while writing and compiling the source code. The **runtime version** refers to the Java environment used to actually execute the program. These do not always have to be understood as the same thing because code can be compiled for a particular target while being executed in a particular runtime environment.

We also discussed **backward compatibility**. This helped me understand why software does not necessarily become useless when a new Java version is released. Newer versions are designed to maintain compatibility with many older applications and features. This is important because developers and organisations may have large existing projects that cannot simply be rewritten whenever a new version of Java becomes available.

### UTF-8 and Character Sets

Another topic that I found interesting was **UTF-8 and character sets**. A character set is a system used by computers to represent characters such as letters, numbers, symbols, and characters from different languages.

We discussed why there are so many character sets and why a single limited system is not sufficient. Different languages contain different characters and symbols, so computer systems need a way to correctly represent them. UTF-8 is widely used because it can support a large variety of characters.

This made me realise that something as simple as displaying text on a screen actually involves an underlying system for representing those characters. Character encoding is also important for correctly handling information across different computers, applications, and systems.

### JUnit and Different Types of Testing

JUnit was also covered, and discussing the value of testing in the real world of software development. Testing isn't just about running the full application and seeing if it seems to function.

Unit testing emphasize the testing of individual or miniature programs. This is very convenient as it enables to spot problems within a certain section of the code. But simply testing on a unit is an inadequate method.

If each small device functions perfectly as an independent piece, then it may have trouble if combined with other components. This is where the role of integration testing is important. Integration test determines whether modules, subsystems or components of an application function together properly.

Black-box testing for which the behavior of the system may be tested, without necessarily examining the internal implementation of the code, we also spoke of. This enabled me to grasp software being tested from various angles based on what we are trying to prove true.
### CI/CD Pipelines, YAML, Integration, and Deployment

The final part of the discussion focused on how software is handled in a more professional development environment. We discussed **CI/CD pipelines**, which help automate different stages of software development.

Instead of manually building, testing, and preparing software every time changes are made, a pipeline can automate many of these processes. We also discussed **YAML files**, which can be used to define the configuration and steps of these automated workflows.

The concepts of **integration and deployment** were also discussed. Integration involves bringing different parts of a project together and ensuring that they work correctly as a complete system. Deployment is the process of making the completed application available in the environment where it is intended to run or be accessed.

This discussion helped me understand that writing the code is only one part of developing software. After writing the program, it may need to be built, tested, integrated with other components, and eventually deployed.

## Reflection

For me this was very valuable Graphics class as it provided a wider window into a Java program than just seeing what was happening in the source code. I was primarily interested in writing a Java file and running that, before. But ideas like entry points, Maven, dependency, repository, testing, deployment, just to mention a few, taught me that a professional software development project is made up of a lot of interrelated processes.

For me the funniest part is the understanding of how Maven works with the dependencies. I had come across packages being added as dependencies but not really understood how and why. This helped me to understand the concepts of transitive dependencies and repositories.

Scripting of the discussion on testing use was also of significance. I was sure that the complete program was working properly if it was able to execute a single time earlier. But I now realize why testing needs to be done in various steps in the professional software development. Unit testing can provide an assurance that smaller components are functioning correctly and integration testing can provide an assurance of working correctly when components are integrated into a complete program.

Also something else I learned, after finishing the coding you would read the code, that's the end of software engineering. To run, the code must have an entry point to start the run, other code is necessary so as to have more functionability, Maven can be used for building the code and packaging, testing to verify correctness of code and processes like integration and deployment so that it can be used in a bigger surrounding.

Overall, many concepts in this class have tied together that are not seen as connected. Aside from the fact that programming is not just about learning the syntax or getting things to work, my biggest sign-off was shouldering responsibility for the artefacts I created.The thing that I took away from this was taking ownership for the artefacts that I produced. A full understanding of software is required if you want to understand how all the elements in software development work together, ranging from writing the source code up to building, testing, integration, and finally deployment of an application to be released to the users.
