# Class Reflection – 01-09-2026 & 03-09-2026

## Topics Covered

* Discussion of different student projects and their technical requirements
* Matrices, rank of a matrix, and the form \(AX = B\)
* Representing equations of a triangle using matrices
* Taking mathematical equations as user input for programming projects
* JavaFX canvas and drawing circles using mouse events
* Connecting graphical objects using arrows
* Binary trees and their structure
* Root nodes, parent nodes, and child nodes
* ASCII trees and text-based tree representation
* Vertical and horizontal representation using characters
* Console, terminal, and text-based graphics
* Comparison between console output and graphical output
* Connecting to remote and supercomputing systems
* SSH, daemon processes, master nodes, and login nodes
* Unit testing and acceptance testing
* FXML and its role in JavaFX applications
* Splash screens and their purpose
* Automatic serialization
* Progress bars and background tasks
* Threads and thread cancellation

## Notes

### Discussion of Different Student Projects

During these classes, a significant part of the discussion was based on the different projects assigned to different students. Since every project had different requirements, the discussion helped us explore many concepts from mathematics, programming, graphics, data structures, and software development.

One interesting aspect of these discussions was that we were not only looking at our own project requirements. By listening to the problems faced by other students, we were introduced to different technical concepts and possible approaches for solving them. This gave the class a broader understanding of how different programming concepts can be applied depending on the requirements of a project.

The project discussions also showed me that the same programming language can be used for very different purposes. Some projects required mathematical calculations, some involved graphical applications, while others required data structures or remote systems.

### Matrices, Rank, and the AX = B Form

There was one mathematical discussion that was mentioned of using matrices in programming problems. We talked about the concept of a matrix and how a system of linear equations can be represented using matrices.

A system of linear equations can be solved in the following general form:

AX = B

In this case A is the coefficient matrix, X is the variables and B is the constant values.

The rank of a matrix was also discussed. The rank tells us how many rows (or columns) are independent in a matrix. It is helpful to know when solving systems of equations and to see if a system can have one solution, more than one solution or no solution.

I was able to see that matrices are not just abstract mathematical objects from a discussion. They may also be directly related to programming problems, particularly if a programme has to use several equations or do mathematical calculations.
### Representing Triangle Equations Using Matrices

One student's project involved taking equations related to a triangle as input from the user. This led to a discussion about how mathematical equations can be represented inside a program.

We discussed how equations can first be written in their normal mathematical form and then converted into a matrix representation. The coefficients of the variables can be stored in a matrix, while the constant values can be stored separately.

This was useful for understanding how a mathematical problem can be translated into a programming structure. A computer cannot understand a handwritten equation in the same way as a person, so the equation needs to be represented in a structured form that the program can process.

The discussion also helped me understand the importance of converting a problem from one representation to another. In this case, a geometric or mathematical problem can be represented using equations, and those equations can then be represented using matrices for computation.

### JavaFX Canvas, Mouse Events, and Drawing Circles

The other project-related task was to create a JavaFX program that would draw a circle on a canvas when it was right-clicked and link circles with arrows.

This brought in the concept of user interaction and graphical programming. The application can detect the mouse event and depending on the event, take an action like drawing a circle at a specific point.

The canvas is an area to draw graphical objects. The mouse's position can be used to calculate the position of the circle.

The next requirement was to link the circles with arrows. This includes locating the co-ordinates of the graphical objects and plotting lines connecting them. Then the direction can be indicated by placing arrowheads.

The professor gave an introduction to the task but didn't do the program itself in detail, but I got the gist of how to use interactive graphics. A program can react to actions by the user and generate objects or link together objects on the screen dynamically.
### Binary Trees

The concept of binary tree which is an important data structure, was also discussed.

A tree is a structure that contains branches and nodes that are connected in a hierarchical manner. The topmost node is called the root node. The node having nodes below them is known as parent node and the nodes below them are called child nodes.

Each node in a binary tree can have a maximum of two children. This can typically be called the left child and the right child.

I had an understanding in binary trees why sometimes data can be organized in a different way to the standard linear list (arrays or list) or sequence. The tree is used to store data in a hierarchical structure, rather than a linear series.

This can be very useful in a variety of applications: e.g., searching, organization of information, representation of hierarchies, effective algorithms.
### ASCII Trees and Text-Based Representation

The class also covered the topic of ASCII trees. An ASCII tree is a way of representing a tree structure using characters.

We discussed how to represent nodes using characters and what characters to use for the vertical and horizontal connections of the tree. We also talked about the importance of spacing and the connection to the actual structure of the tree. For instance, a tree may require a certain amount of characters to show a vertical connection to understand that a node is below another node and horizontal connections to show different branches of the same node.

I found the discussion interesting because it showed that a graphical structure does not require a graphical interface. Some structures can even be represented within the console by using characters.
### Console, Terminal, Text Graphics, and Graphical Output

We also discussed what a console and terminal is, and how it is different compared to graphical applications.

For example, a console based program generally communicates with the user through text, and displays input and output using characters to represent text. Text based graphics can also be achieved by using symbols and characters

While graphical applications make use of components such as windows, buttons, graphics, colors, images and animations.

We discussed what benefits and limitations each approach has. I think console applications are simple, quick to develop and useful when the graphical user interface is not needed or desired. In some cases a console application can also prove to be useful and straightforward to test, and to quickly understand how the program works.

On the other hand graphical applications can give the application a more interactive and richer appearance and feel. The downside to using graphical applications is that it can involve more code and concepts to implement compared to console applications.

This discussion helped me understand that just because graphical output is not always better than textual output, and that it depends on the application or problem at hand
### Connecting to Remote Computers and Supercomputing Systems

Another topic that was discussed was establishing a connection to a remote computer or, more specifically, a more powerful system.

We discussed the principles of connecting to a remote system via text-based logon. Such connections allow the user to perform various operations remotely without being physically located at the computer.

We also discussed the means of implementing such connections, particularly SSH. By virtue of such tools, one can perform operations on the remote system: run commands and work with files.

In addition, we discussed such terms as the login node, the master node, and multi-machine systems. The login node is the starting point for interaction with the system, while the master node refers to more powerful systems needed for heavy calculations.

This knowledge gives a more comprehensive understanding of how a system working on a large scale differs from a regular personal computer.

### SSH and Daemon Processes

The concept of daemon was also mentioned during the lecture, in relation to system and remote communication.

A daemon is typically a background process which provides services or waits to be triggered. In the context of networking and remote systems, background processes are essential for allowing computers to offer services without a human operator manually launching processes, and responding to requests.

This helped me realize that when two computers communicate with each other, there are a great number of processes which take place in the background for the communication to be successful.

As such, the lecture on SSH and remote systems really drove home the importance of text-based commands in modern professional systems, despite the prevalence of graphical interfaces in everyday applications.

### Unit Testing and Acceptance Testing

Testing was also discussed in relation to software projects.

**Unit testing** focuses on testing small and individual parts of a program. The purpose is to check whether a particular method, function, or component behaves correctly.

We also discussed **acceptance testing** at a basic level. Acceptance testing focuses more on whether the overall software meets the required expectations or requirements.

This discussion helped me understand that testing can take place at different levels. A small component may work correctly by itself, but the complete application must also satisfy the requirements for which it was developed.

Testing is therefore important not only for finding errors but also for verifying whether the program actually solves the intended problem.

### FXML in JavaFX

We also discussed **FXML** and its role in JavaFX applications.

FXML is used to describe the structure of a JavaFX user interface. Instead of writing every interface component directly inside Java code, the structure of the interface can be organised separately.

This can make an application easier to manage because the user interface and application logic can be separated to some extent.

The discussion helped me understand why JavaFX projects can contain different types of files. A complete application may not consist of only Java source code. It can also contain files that describe the interface and resources used by the application.

### Splash Screens

Another concept discussed was the **splash screen**.

A splash screen is a temporary screen that appears when an application is starting. It may display the name, logo, or loading status of the application.

The purpose of a splash screen is not only visual. It can also provide feedback to the user while the application is loading resources or performing initial setup.

This helped me understand that application design also includes the experience of the user while the application is starting, not only what happens after the main window appears.

### Automatic Serialization

We also briefly discussed **automatic serialization**.

Serialization is related to converting the state or data of an object into a format that can be stored or transferred. This can be useful when information needs to be saved and later reconstructed.

The idea of automatic serialization helped me understand that programs may need mechanisms for preserving data without manually handling every individual part of an object.

This concept is important in larger applications where objects and data may need to be stored, transferred, or reused.

### Progress Bars and Background Tasks

Another topic was the use of a **progress bar**.

A progress bar provides visual feedback about the progress of a task. It can be useful when an operation takes time and the user needs to know that the application is still working.

We discussed this in relation to tasks that may run in the background. If a long operation is performed directly on the main application thread, the user interface may stop responding.

Using background tasks or threads can allow the application to continue responding while another operation is being performed.

This discussion helped me understand that programming a graphical application is not only about displaying objects on the screen. It is also important to manage what happens while the application is performing longer operations.

### Threads and Thread Cancellation

We also discussed threads and the idea of cancelling a running task.

A **thread** allows a program to perform tasks independently. In graphical applications, threads can be useful for running longer operations without freezing the user interface.

We also discussed **thread cancellation**, which is important when a task should be stopped before it is completed.

For example, a user may start a long-running operation and later decide to cancel it. The application should therefore have a proper way to respond to cancellation requests and stop the task safely.

This gave me an introduction to the fact that managing a program involves more than simply starting operations. A program may also need to monitor, pause, cancel, or safely complete tasks.

## Combined Reflection

The combined classes on 1 September and 3 September were fascinating in that learning did not focus on a specific subject. Instead, various concepts emerged as a natural outcome of the discussion of the students’ individual projects. At first, it seemed like a number of topics had been randomly brought up, including matrices, triangle equations, JavaFX graphics, binary trees, ASCII trees, remotes, testing, FXML, splash screens, and threads, among others. However, when reflecting on both classes, I realised that all of these topics could be connected in that they represent different approaches and technical means used in programming.

The most valuable takeaways for me were related to the connection between mathematics and programming. In particular, the discussion of matrices, rank, and the representation of equations in the form of AX = B was invaluable in that it demonstrated that a mathematical problem can be recognised and solved in a programming environment. Essentially, a mathematical equation can be put into a certain form so that it can be converted into a programming task. The discussion of triangle equations was a valuable addition, as it demonstrated how a requirement could be transformed into a mathematical equation and then implemented in code.

The JavaFX section was also valuable to me, as it provided an important insight into the nature of graphical programming. Specifically, the task to draw circles on the canvas with a right-click and connect them with arrows showed that a graphical application is characterised by its ability to respond to user input. Prior to this task, I used to think of programming in terms of inputting instructions and obtaining a result. However, the discussion helped me realise that an application can also respond to the programmer’s commands in real time in order to modify the graphical output.

The discussion of binary trees and ASCII trees was interesting to me, as it showed different approaches to implementing the same idea. In particular, binary trees introduced me to the concept of trees in general and their use in programming, specifically the hierarchical structure of data, which is manifested in the existence of root, parent, and child nodes. ASCII trees, on the other hand, demonstrated how one can use a graphical interface to represent a tree, which was an enlightening experience. Moreover, the discussion connected to the one of consoles and terminals. In particular, I found it interesting that command line interfaces can be used in place of GUI in certain applications, which allows one to achieve a specific purpose.

Finally, the classes provided an important introduction to the concept of remote computing and SSH. While I used to think of a computer as a local entity, the discussion showed the extent to which modern programming and testing rely on remote, login, and master nodes.

The discussion of FXML, splash screens, serialization, progress bars, and threads was also valuable to me, in that it showed the extent to which attention to detail matters. Specifically, a program has to meet a number of requirements, which goes beyond the coding itself. For example, an application might have to have a certain user interface arranged in a particular way. Moreover, it often has to have features such as a splash screen, so that the user knows that the application is launching. A program also has to be able to store data and respond to certain processes without freezing the interface.

Overall, the combined classes on 1 September and 3 September were valuable to me in that they showed the extent of the knowledge required of a programmer. At any given point, one may find oneself facing mathematical, graphical, or system-related challenges, among others. Moreover, the classes were interesting to me, as they were largely based on the discussion of the students’ projects. Thus, rather than following a strict course, we were exposed to a number of topics that would be difficult to explore individually.

My biggest takeaway from the combined classes was the realisation that programming is a complex process that involves a number of interrelated tasks. Being able to write code is only a small part of any larger project, as one also has to know how to present one’s product, make sure that it responds to user input, and follow specific conventions.
