# Class Reflection – 08-09-2026

## Topics Covered

* Exception handling and error management
* Generic programming and collections
* Graphical user interfaces and event handling
* Swing and JavaFX
* Layouts and interface components
* Image processing

## Notes

### Exception Handling and Error Management

In this class, we discussed **exceptions** and how they are handled in Java programs. An exception is a problem that occurs during the execution of a program and can interrupt its normal flow. Before this class, I generally thought of an error as something that simply makes the program stop. After discussing the topic and trying to read about it on my own, I understood that Java provides mechanisms to detect and handle many unexpected situations.

We discussed `try`, `catch`, and `finally`. The code that may produce an exception can be placed inside a `try` block, while the `catch` block can handle the exception. The `finally` block can be used for code that needs to execute after the operation, such as cleaning up resources.

We also discussed the difference between **checked and unchecked exceptions**. A checked exception is checked by the compiler and generally needs to be handled or declared by the programmer. These can occur in situations such as working with files or external resources. Unchecked exceptions generally occur during runtime and are often related to programming mistakes, such as `NullPointerException` or `ArithmeticException`.

I also tried to understand **assertions** separately because initially I was confused about how they differ from exceptions. An assertion is used to check whether a condition that the programmer expects to be true actually remains true. It is mainly useful for finding logical or programming mistakes during development. I understood that assertions are not a replacement for normal input validation or exception handling.

Another related topic was **logging**. Logging is used to record information about what is happening inside an application. Earlier, I would mainly use `System.out.println()` to check what was happening in my code. After learning about logging and reading about it myself, I understood why larger applications use proper logging systems. Logs can record information, warnings, and errors, making it easier to understand and debug an application.

### Generic Programming and Collections

We also discussed **generic programming** and **collections**. I searched about generics after class because the syntax such as `<T>` was initially not very clear to me. Generics allow classes and methods to work with different data types while maintaining type safety.

For example, instead of writing separate code for a collection of integers and another collection of strings, we can use a generic collection such as `List<T>`. This reduces repeated code and allows many type-related errors to be detected during compilation.

The concept of **collections** helped me understand how Java manages groups of objects. We discussed structures such as lists, sets, and maps. A list is useful when we want to maintain an ordered collection, a set is useful when duplicate elements are not required, and a map stores values using keys.

I tried looking at examples of these collections myself to understand when each one would be useful. This helped me realise that there is no single collection that is best for every situation. The choice depends on whether we need ordering, uniqueness, key-value relationships, or other properties.

We also discussed **views**. A view provides another way of accessing or looking at existing data without necessarily creating a completely separate copy of that data. While reading about this concept, I understood that views can be useful when we want to work with a particular part or representation of existing data while still relating it to the original data.

### Graphical User Interfaces and Event Handling

Another major part of the class was **graphical user interfaces and event handling**. A GUI application is different from a simple program that executes instructions from beginning to end. In a GUI, the user can perform different actions such as clicking a button, selecting an option, moving a slider, or typing something.

These actions generate **events**. Event handling is the mechanism through which the application detects these events and performs the required action in response. I searched for some examples myself to understand this better. For example, when a button is clicked, an event can be generated and the corresponding event handler can execute some code.

We also discussed the **event hierarchy**. Initially, I thought that event hierarchy was mainly something that needed to be memorised. After trying to understand it properly, I realised that different events can have relationships with more general event classes. Events related to the mouse, keyboard, buttons, and other components can therefore be organised in a structured way.

This helped me understand why GUI applications are called **event-driven applications**. The program waits for actions from the user and responds to those actions instead of simply following one fixed sequence of instructions.

### Swing and JavaFX

We discussed **Swing and JavaFX** as Java technologies used for developing graphical applications. Swing has been used for a long time and provides many components for building desktop interfaces. JavaFX provides another framework for creating graphical applications with features such as controls, styling, FXML, media, and other facilities.

We also discussed different **GUI components**. These include buttons, labels, text fields, check boxes, radio buttons, and sliders. I tried relating these components to applications that I use normally, which made their purpose easier to understand.

A **check box** is generally used when multiple options can be selected independently. For example, a user may be able to select multiple preferences.

A **radio button**, on the other hand, is generally used when the user should select one option from a group. For example, if a form provides several choices where only one should be selected, radio buttons are suitable.

We also discussed **sliders**. A slider allows the user to select a value from a range by moving a control along a track. Examples can include controlling volume or selecting a numerical value.

While studying these components, I understood that GUI components are not useful individually only. They work together with event handling so that the application can respond to user actions.

### Layouts and Interface Components

We also discussed **layouts**, which control how different components are arranged inside a graphical interface. I realised that simply adding components to a window is not enough. They need to be positioned and organised properly so that the interface remains usable.

One of the layouts we discussed was **Grid Layout**. It divides the available space into rows and columns, allowing components to be placed inside the grid. I looked at some examples myself to understand why layouts are better than manually fixing the position of every component.

We also discussed the **Master-Detail Layout**. In this type of interface, one part displays a list or collection of items, while another part displays detailed information about the selected item. For example, one side could show a list of students, files, or products, while the other side displays details of the selected item.

Understanding these layouts helped me see that GUI design is not only about adding components but also about organising information in a way that makes the application easier to use.

### Image Processing

Another interesting part of the class was **image processing**. Image processing involves using a computer to analyse or modify digital images. I tried reading about this topic separately because it was different from the GUI concepts we had discussed earlier.

I understood that a digital image can be represented using **pixels**. Each pixel contains information about the colour or intensity at a particular position. Once I understood the idea of an image as pixel data, concepts such as filtering, histograms, and black-and-white conversion became easier to understand.

We discussed **histograms** in image processing. A histogram shows the distribution of pixel intensity values in an image. For a grayscale image, it can show how many pixels have low, medium, or high intensity. This can help in understanding whether an image is generally dark, bright, or has a particular distribution of intensities.

We also discussed **image filtering**. Filtering means applying an operation to image data to modify the image or extract useful information. Filters can be used for purposes such as reducing noise, blurring an image, or highlighting certain features. I understood that these operations can involve using the values of neighbouring pixels to calculate a new pixel value.

Another concept was converting an image to **black and white**. A grayscale image contains different shades between black and white, while a binary black-and-white image can classify pixels into two groups using a threshold. I found this interesting because the final result may look simple, but the computer has to process the pixels of the image to produce it.

## Reflection

This class helped me understand that Java programming is not only about writing code and getting an output. The concepts covered in the class connected different areas such as error handling, data management, graphical interfaces, and image processing.

The topic of **exceptions** was particularly useful for me because I understood that a program should be prepared for situations where something unexpected happens. Learning about checked and unchecked exceptions also helped me understand that different types of problems are handled differently in Java. I also tried searching about assertions and logging on my own, which made their purpose clearer to me.

I found **generic programming and collections** useful because they showed me how Java can make code reusable while still maintaining type safety. I had seen collections before, but understanding lists, sets, maps, generics, and views together gave me a better idea of how data can be organised and accessed.

The GUI section was also interesting because I understood that an application is not simply a collection of buttons and text fields. **Event handling and event hierarchy** are important because the application needs to respond correctly to whatever the user does. The discussion of Swing and JavaFX also helped me understand how different Java frameworks provide components for creating graphical applications.

I also tried searching about **layouts and GUI components** after the class because I wanted to understand their practical use rather than only remembering their definitions. Concepts such as Grid Layout and Master-Detail Layout made me realise that arranging information properly is an important part of interface design.

The introduction to **image processing** was another new area for me. Understanding images as collections of pixels helped me connect programming with visual information. Histograms, filtering, and black-and-white conversion showed me that even a simple visual change can involve processing a large amount of underlying data.

Overall, I tried to read and search about many of the concepts after the class so that I could understand them beyond what was discussed during the lecture. My main takeaway from this class was that learning Java is not only about remembering syntax. It is also about understanding how the language and its frameworks can be used to handle errors, manage data, create interactive applications, and work with images.

