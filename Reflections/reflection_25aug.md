# Class Reflection – 25-08-2026

## Topics Covered

* Computer Graphics: Square, Trees, Triangles, and Image Analysis
* Trees and Parent–Child Relationships
* Maven, `pom.xml`, and Project Build Process
* Java Files, `.class` Files, `.xsd`, and `target`
* GUI, Java Swing, Components, and Accessibility
* Processes, Threads, Multithreading, and Thread Safety

## Notes

### Computer Graphics, Trees, and Image Analysis

In the discussion, we moved on to the fundamentals of Computer Graphics and took a look at the code that is used to draw a simple square. Because we had been discussing the basic algorithm and the basic coordinates for a square, this class helped me to understand how this thought actually is implemented in a java program. Additionally the idea was put forward that we would be using additional shapes (trees, triangles etc) during the coming classes. That made me realise that graphics programming begins by creating simpler graphics elements, then gradually building up more complex graphics elements through combination of various graphics elements, coordinates and structure.

We also been given an overview of trees and how they can be depicted in various ways including horizontally or vertically. Parent and children: A parent can be related to other elements in the parent-child hierarchy, below them. I knew that a tree is something more than a picture of a tree; it's a hierarchical relationship of objects like a tree. We also spoke a bit about image analysis and were introduced to ImageJ package, which can be used for image analysing. That was to make me realise that Computer Graphics isn't just about making pictures, but can also be about dealing with images, analysing them.
### Maven, `pom.xml`, and the Build Process

### Maven, `pom.xml`, and Build Process

In this class, I understood more clearly how Maven works in a Java project.

* **`pom.xml`** – It is the main configuration file of a Maven project. It contains information about the project, its dependencies, plugins, and build settings. I understood that Maven uses this file to know what the project needs and how it should be built.

* **Dependencies** – These are external libraries or code that our project needs. Instead of manually downloading and managing these libraries, Maven can manage them through the information given in `pom.xml`.

* **Validate** – This checks whether the Maven project is correctly structured and whether the required information is available. I understood it as an initial check before starting the actual build process.

* **Compile** – This converts our `.java` source files into `.class` files. The `.java` file is the code we write, while the `.class` file contains bytecode that can be used by the JVM.

* **Test** – This stage runs the tests written for the project and checks whether the code is working as expected. So, testing helps find problems before the project is finally prepared.

* **Package** – After compilation and testing, Maven can package the project into a usable format, such as a JAR file. I understood this as preparing the project so it can be distributed or used.

* **Clean** – This removes the files generated during previous builds, mainly from the `target` folder. It does not delete our original `.java` source files. This is useful when we want to build the project again from a clean state.

* **`target` folder** – This is where Maven keeps generated files such as compiled classes and other build output. I understood that these are generated files, not the original source code of the project.

Overall, I understood that Maven manages the complete build process instead of us manually compiling, testing, and managing every generated file. The different stages take the project from source code to a compiled, tested, and packaged form.

### GUI, Java Swing, Components, and Accessibility

The other important component of the class was GUI (Graphical User Interface). We discussed the use of java Swing for creating graphical interfaces and we saw components like JButton, JPanel and Jlist. I now have a rough idea of what these are called and that they are the base of an interactive GUI. A button, for instance, can enable a user to carry out a particular action, a panel can organise and encompass other parts of the GUI.

We also spoke about what accessibility is and the need for alt text. Accessibility is the process that involves the design of software in order to be used by people with various needs and abilities. Alternative text can convey information to an image when the image is not visible, for screen reader users, and for people who are blind. This, I realized, is not just about a pretty interface, it's about a usable, understandable interface for various users.
### Processes, Threads, and Multithreading

The concepts of processes and threads were also discussed. A process is a running instance of a program, a thread is a unit of execution within a process. Threads can be part of one process, allowing different tasks to be performed in the same application.

Talked about single threaded, multi-threaded and why an application could require multiple threads. In the single threshold execution, instructions are executed mainly in a sequence, while in multithreade execution, multiple instructions can progress within a process. A new thread is not a completely new program, it's a new set of instructions within the same program to run.

This thread safety discussion was particularly helpful. I knew there are potential issues with sharing the same resource when several threads are read and written simultaneously if access to the resource isn't controlled properly. This is especially significant for programming with Java Swing and GUI, where Swing components (as a rule) are not thread-safe. This in other words translates to not allowing different threads to update GUI parts of your application at will. This knowledge allowed me to appreciate the ability to multithreaded and make the program more responsive, but at the same time, it is clearly very important to manage or keep in check shared resources.
## Reflection

This class gave me a sense of the many other programming realms where Computer Graphics fits in. We began with a simple square, then went on to trees, analysis of images, and GUI building and threads. I learned that, in addition to having to follow rules, even the simplest of graphic forms needed to have the correct logic, and that more complex graphics could be developed by associating the smaller graphics and the relationships among them.

I also found extended discussion on Maven and java project files which helped me to get more knowledge on what is going in the background with the code. Before, I was primarily thinking of a java program as just the .java file that we write. So now I know that .class, .xsd, .pom and the target folder have different purposes in the process of development and build. In addition, I got the idea that the Maven lifecycle is separate below steps: compile, build, package, clean.

GUI and Swing part was interesting, as it illustrated the concepts of programming to be something which a man can manipulate. In the process, I discovered that in addition to working the way it should, software ought to be designed so that it can be used by various users.

Last, I've learned about process, thread, multithreading, and thread safety, which has helped me understand what will occur when a program needs to do multiple things. I knew that if I had to make a new thread that would also start a new path of execution in a process, but multiple threads or paths of execution that access the same resources would also bring problems. Overall this class helps me to understand the fundamental interconnections between graphics, structure of a project, GUI and how this is used in the running of a Java application.
