# Design Patterns

Design patterns are proven solutions to common problems in software design. Here are some common design patterns used in software architecture:

## :dna: Creational Patterns 
***
### :dart: Singleton:

Ensures a class has only one instance and provides a global point of access to it.
> Example: Database connection pool.

### :factory: Factory Method:

Defines an interface for creating an object but lets subclasses alter the type of objects that will be created.
> Example: Creating different types of documents in a document editor.


### :department_store: Abstract Factory:

Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
> Example: UI components for different operating systems.

### :hammer_and_wrench: Builder:

Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
> Example: Building a complex configuration object.

### :space_invader: Prototype:

Creates new objects by copying an existing object, known as the prototype.
> Example: Cloning objects in a game.


## :bricks: Structural Patterns
***
### :pencil: Adapter:

Allows incompatible interfaces to work together by wrapping an existing class with a new interface.
> Example: Adapting a legacy system to a new interface.

### :bridge_at_night: Bridge:

Separates an object’s abstraction from its implementation, allowing the two to vary independently.

> Example: Separating the interface and implementation of a remote control and TV.


### :open_file_folder: Composite:

Composes objects into tree structures to represent part-whole hierarchies, allowing clients to treat individual objects and compositions uniformly.
> Example: File system directories and files.


### :art: Decorator:

Adds additional responsibilities to an object dynamically by wrapping it.
> Example: Adding scrollbars to a window.

### :twisted_rightwards_arrows: Facade:

Provides a simplified interface to a complex subsystem.
> Example: Simplified API for a complex library.


### :money_with_wings: Flyweight:

Reduces the cost of creating and manipulating a large number of similar objects by sharing common parts of the state.
> Example: Characters in a text editor.


### :signal_strength: Proxy:

Provides a surrogate or placeholder for another object to control access to it.
> Example: Remote proxy for accessing a remote service.

## :smile: Behavioral Patterns
*** 
### :cyclone: Chain of Responsibility:

Passes a request along a chain of handlers, allowing each handler to process the request or pass it to the next handler.
> Example: Event handling in a GUI framework.

### :computer: Command:

Encapsulates a request as an object, allowing parameterization of clients with queues, requests, and operations.
> Example: Undo/redo functionality in an editor.


### :information_desk_person: Interpreter:

Defines a representation for a language’s grammar and an interpreter to interpret sentences in the language.
> Example: Parsing and interpreting expressions in a scripting language.


### :arrows_counterclockwise: Iterator:

Provides a way to access elements of a collection sequentially without exposing its underlying representation.
> Example: Iterating over a collection in Java.


### :speech_balloon: Mediator:

Defines an object that encapsulates how a set of objects interact, promoting loose coupling by preventing objects from referring to each other explicitly.
> Example: Chat room mediator.


### :floppy_disk: Memento:

Captures and externalizes an object’s internal state without violating encapsulation, allowing the object to be restored to this state later.
> Example: Saving and restoring the state of a game.


### :eyes: Observer:

Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
> Example: Event listeners in a GUI framework.


### :repeat_one: State:

Allows an object to alter its behavior when its internal state changes, appearing to change its class.
> Example: State transitions in a vending machine.


### :cop: Strategy:

Defines a family of algorithms, encapsulates each one, and makes them interchangeable, allowing the algorithm to vary independently from clients that use it.
> Example: Sorting algorithms.


### :ledger: Template Method:

Defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
> Example: Abstract class with a template method in a framework.


### :hotsprings: Visitor:

Represents an operation to be performed on elements of an object structure, allowing new operations to be defined without changing the classes of the elements.
> Example: Operations on a composite structure like a file system.

## :fire: Conclusion
These design patterns provide reusable solutions to common problems, promoting code reuse, flexibility, and maintainability in software architecture.




