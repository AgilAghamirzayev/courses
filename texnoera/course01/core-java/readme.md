# 03 Loops in Java

- loops introduction
- for lesson01
    - for lesson01 syntax
    - for lesson01 generation
    - first 100 num sum
    - multiplication table
    - nested for lesson01
    - advanced multiplication table
- while lesson01
- do while lesson01
- break
- continue
- return

# 04 Java Arrays

- Methods
    - Method solved problems
    - Method return types
    - void methods
    - static methods
- Arrays
    - Introduction to Arrays (data structure)
    - Declarations of arrays
    - Creation of arrays
    - Accessing arrays
    - Size of arrays
    - Array initialization {1,2,3,4}
    - int, long, float, double, String default values
    - Print all values
    - Arrays.toSting()
    - fill random numbers in array
    - array sorting
    - Multi-dimensional array

- Challenges
    - Find minimum number from entered number
    - Create calculator app (User can choose operator and enter numbers)
    - [TASK](src/main/java/lesson02/task.md)

# 05 String, stack, heap, random number

- Memory management introduction
    - Stack
    - Heap
- String
    - String methods
    - String immutable
    - String memory (string pool)
    - String casting
    -
    - StringBuilder
    - StringBuffer
- Ternary operator
- Random number
    - Random class
    - Math.random()
- Method
    - Parameter passing
        - primitive
        - array
        - object (future)

# 06 Java String, Challenge

- Java String Casting
- String Builder
- String Buffer
- String problems
- [TASK](src/main/java/lesson04/task.md)

# 07 OOP Part 1

- What is object?
- Principles of OOP
    - Abstraction
    - Encapsulation
    - Inheritance
    - Polymorphism
        - Specializations
        - Generalization
- Object and class
- UML
- Box class
    - Set variables with .
    - Volume finding
    - setDimension(double w, double h, double d)

# 08 OOP Part 2:

- constructor
    - default constructor
    - parametrized constructor w,d,h
    - this. keyword
    - parametrized constructor with this
    - constructor overloading
        - all arguments
        - no arguments but set -1 to all values
        - sen length
            - width = height = depth = length
- static variables
- final variables
- static methods

# 09 OOP PART 3:

- cass association
    - one-to-one association
    - one-to-many association
    - many-to-one association
    - many-to-many association
    - bidirectional association (2)
    - unidirectional association (1)
    - this keyword's use cases

# 10 OOP PART 4:

- class, instance, local variables
    - [What are class variables, instance variables and local variables in Java?](https://www.tutorialspoint.com/what-are-class-variables-instance-variables-and-local-variables-in-java)
- static variable
- packets
- encapsulation
    - getter
    - setter

# 11 OOP PART 5:

- Comparing variables
- Inheritance
    - Introduction to Inheritance
        - Definition and purpose
        - Real-world analogy
    - Types of Inheritance in Java
        - Single inheritance
        - Multilevel inheritance
        - Hierarchical inheritance
        - Why Java doesn’t support multiple inheritance directly
    - How Inheritance Works Under the Hood
        - Memory allocation for parent and child classes
        - Method lookup and method overriding
        - Early and late binding (static vs dynamic polymorphism)
    - Code Examples and Bug Scenarios
        - Working code examples
        - Common inheritance bugs
        - Debugging inheritance-related issues
    - constructor in inheritance
        - super.
        - super()
    - Method hiding and overriding
    - Performance and Memory Considerations
        - Object creation and memory footprint
        - Vtables (Virtual Method Tables) in inheritance
    - Best Practices and Common Mistakes
        - Composition vs Inheritance
        - When and when not to use inheritance
        - Avoiding deep inheritance hierarchies

- Access modifiers
    - public
    - private
    - protected
    - default

# 11 OOP PART 6:

- Polymorphism
    - Compile time polymorphism -> **overloading**
      The compiler determines which method to call based on the type and number of arguments passed to the method.
    - Runtime polymorphism -> **overriding**
    - Dynamic Method Dispatch
      When a method is called on an object, the runtime system determines which implementation of the method to use
      based on the actual type of the object, not just its declared type.
      Association, composition, and aggregation are all types of relationships between classes in object-oriented
      programming

- Association (Has a)

  Association, in general terms, refers to the relationship between any two entities. Association in java is the
  relationship that can be established between any two classes.

  These relationships can be of four types:

    * One-to-One relation (Email -> User Account)
    * One-to-many relation (Country -> City)
    * Many-to-one relation (Order -> Customer)
    * Many-to-many relation (Book -> Author)

# 12 OOP PART 7:

- Aggregation
    * has a
    * weak association
      Aggregation represents a weak relationship between two classes where one class (the whole) contains a reference to
      the other class (the part), but the part can exist independently of the whole.

- Composition
    - part-of
    - strong association
    - child does not exist independently of its parent
      Composition represents a strong relationship between two classes where one class (the composite) contains the
      other class (the component). The component cannot exist independently of the composite, and any changes to the
      composite will affect the component.

- Object class
    - Default extends
    - Methods
        - equals
            - == and equals
        - hashcode
        - toString
        -
- is-a relationship
- has-a relationship
- POJO (Plain Old Java Object)

# 13 Test

# 14 OOP PART 8:

- Abstraction
    - Abstract class
    - Interface

# 15 OOP PART 9:

- Enum
    - .values()
    - https://docs.oracle.com/javase/1.5.0/docs/guide/language/enums.html
- Java Collection
    - List
- Wrapper classes
    - https://www.geeksforgeeks.org/wrapper-classes-java/
    - valueOf()
    - Converting wrapper to primitive
    - Autoboxing, Unboxing
    - Immutable
    - Integer cache
    - performance problems with wrapper type
- Immutable class
    - The class is declared as final, so it cannot be subclassed.
    - All fields are private and final.
    - No setter methods.
    - The constructor initializes all fields.
    - If the class has mutable fields, ensure defensive copies are made when returning or accepting them.
- Record
    - Constructor
    - extends
    - Record abstract class
- var
    - limitation (cannot be global, method parameter, null, without assignment)

# Additional

- Classes
    - Concrete class
    - Abstract class
    - Super class and Subclass
    - Object class
    - Nested class
        - Inner class (Non-static nested class)
        - Anonymous inner class
        - Member inner class
        - Local inner class
        - Static nested class / static class
- Generic classes
- POJO classes
- Bean classes
- Enum classes
- Final classes
- Singleton classes
- Immutable classes
- Wrapper classes


- https://www.geeksforgeeks.org/dynamic-method-dispatch-runtime-polymorphism-java/
- https://www.youtube.com/watch?app=desktop&v=4naPQH-BPYU&ab_channel=ChannelGreenfoot
- https://medium.com/ingeniouslysimple/static-and-dynamic-dispatch-324d3dc890a3
- https://www.youtube.com/watch?app=desktop&v=eIO9dNLkhDQ&ab_channel=Telusko
- https://medium.com/@barbieri.santiago/notes-on-dynamic-method-dispatch-in-java-968d93350e3a
- https://www.youtube.com/watch?v=hw8sxhqgMo0&ab_channel=DouglasSchmidt

