# Java Basics and Object-Oriented Programming Task

## Overview
This small Java project demonstrates conditions, loops, arrays, classes and objects, inheritance, method overriding/polymorphism, and encapsulation through getters and setters.

## Files
- `BasicsDemo.java` — if/else, `for`, `while`, enhanced `for`, arrays, sum, and average.
- `Person.java` — base class with private fields, constructor, getters, setters, and a method.
- `Student.java` — inherits from `Person` and overrides `introduce()`.
- `Teacher.java` — inherits from `Person` and overrides `introduce()`.
- `OOPDemo.java` — creates objects and demonstrates polymorphism.

## How to compile and run
Install a JDK (Java 17 or newer is recommended). Open a terminal in this folder and run:

```bash
javac *.java
java BasicsDemo
java OOPDemo
```

## Short explanation of OOP concepts used
1. **Class:** A blueprint for objects. `Person`, `Student`, and `Teacher` are classes.
2. **Object:** An instance of a class. `new Student(...)` creates a Student object.
3. **Encapsulation:** `Person` fields such as `name` and `age` are `private`. Public getters and setters control access and validate values.
4. **Inheritance:** `Student` and `Teacher` use `extends Person`, so they reuse common properties and behavior from `Person`. `super(...)` calls the parent constructor.
5. **Polymorphism:** `Student` and `Teacher` override `introduce()`. In `OOPDemo`, a `Person[]` stores objects of different subclasses; calling `introduce()` invokes the implementation for the actual object at runtime.
6. **Method overriding:** `@Override` marks subclass methods that provide specialized behavior for a parent method.

## Basic Java concepts demonstrated
- **Conditions:** `if/else` checks whether a number is even or odd.
- **Loops:** `for`, `while`, and enhanced `for` repeat operations.
- **Arrays:** An integer array stores marks; the program calculates their total and average.

## Example output
`BasicsDemo` prints whether 7 is odd, numbers 1–5, a countdown, marks, total, and average.

`OOPDemo` prints an updated age, introductions for a person/student/teacher, and the student's updated marks.

## Notes
This is a learning/demo project. Run both programs yourself and be prepared to explain each class and concept during a review or interview.
