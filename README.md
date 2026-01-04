# Object-Oriented-Programming

# 🧬 Object-Oriented Programming (OOP) Concepts

![Language](https://img.shields.io/badge/Language-Java-orange) ![Concepts](https://img.shields.io/badge/Concepts-OOP-blue) ![License](https://img.shields.io/badge/License-MIT-green)

Welcome to my **OOP Concepts Repository**! 🚀

This repository acts as a comprehensive guide and code collection demonstrating the four fundamental pillars of Object-Oriented Programming. Each module contains practical code examples designed to illustrate how to build modular, scalable, and secure software.

---

## 📚 Table of Contents
- [1. Encapsulation](#1-encapsulation)
- [2. Polymorphism](#2-polymorphism)
- [3. Inheritance](#3-inheritance)
- [4. Abstraction](#4-abstraction)
- [How to Run](#-how-to-run)

---

## 1. Encapsulation 🛡️
**Encapsulation** is the mechanism of wrapping data (variables) and code acting on the data (methods) together as a single unit. It acts as a protective shield that prevents the data from being accessed by the code outside this shield.

### Key Features:
* **Data Hiding:** Variables are declared as `private`.
* **Controlled Access:** Public `getter` and `setter` methods are used to view and modify data.
* **Security:** Prevents unauthorized or invalid data modification.

```java
// Example Snippet
public class Account {
    private double balance; // Hidden data

    public void setBalance(double amount) {
        if(amount > 0) {
            this.balance = amount;
        }
    }
}
```


# 🚀 OOP Pillars: Polymorphism, Inheritance, & Abstraction

![Java](https://img.shields.io/badge/Language-Java-orange) ![OOP](https://img.shields.io/badge/Concepts-Object--Oriented-blue)

This repository contains practical implementations of advanced Object-Oriented Programming concepts. The code demonstrates how to achieve flexibility, reusability, and security in software design using Polymorphism, Inheritance, and Abstraction.

---

## 📑 Table of Contents
- [1. Polymorphism](#1-polymorphism)
  - [Compile-Time (Overloading)](#a-compile-time-polymorphism-static-binding)
  - [Run-Time (Overriding)](#b-run-time-polymorphism-dynamic-binding)
- [2. Inheritance](#2-inheritance)
  - [Types of Inheritance](#types-of-inheritance-included)
- [3. Abstraction](#3-abstraction)
  - [Abstract Classes](#a-abstract-classes)
  - [Interfaces](#b-interfaces)
- [How to Run](#-how-to-run)

---

## 1. Polymorphism 🎭
**Polymorphism** (Greek for "many forms") allows objects to be treated as instances of their parent class rather than their actual class. It enables a single interface to control access to a general class of actions.

### A. Compile-Time Polymorphism (Static Binding)
Also known as **Method Overloading**.
This occurs when multiple methods in the same class share the same name but have different parameters (different type, number, or sequence).

* **Goal:** Readability and convenience.
* **Example Code:** `MathOperations.java` (shows `add(int, int)` vs `add(double, double)`).

### B. Run-Time Polymorphism (Dynamic Binding)
Also known as **Method Overriding**.
This occurs when a subclass provides a specific implementation of a method that is already defined in its parent class. The method signature must be identical.

* **Goal:** Specific behavior for subclasses.
* **Example Code:** `Animals.java` (shows `Dog` overriding `sound()` from generic `Animal` class).

---

## 2. Inheritance 🧬
**Inheritance** is the mechanism where a new class (Child) derives properties and behaviors from an existing class (Parent). It promotes code reusability and establishes a "is-a" relationship.

### Types of Inheritance Included:

#### 1. Single Inheritance
* **Structure:** Class A ➔ Class B
* **Description:** A single child class inherits from a single parent class.

#### 2. Multilevel Inheritance
* **Structure:** Class A ➔ Class B ➔ Class C
* **Description:** A chain of inheritance. Class C inherits from B, and B inherits from A.

#### 3. Hierarchical Inheritance
* **Structure:** Class A ➔ Class B & Class C
* **Description:** Multiple distinct child classes inherit from the same single parent class.

*(Note: Java does not support Multiple Inheritance with classes to avoid the "Diamond Problem," but it can be achieved using Interfaces.)*

---

## 3. Abstraction 📦
**Abstraction** is the process of hiding implementation details and showing only the essential functionality to the user. It lets you focus on *what* an object does, not *how* it does it.

### A. Abstract Classes
* **Keyword:** `abstract`
* **Details:** Can contain both abstract methods (no body) and concrete methods (with body). Cannot be instantiated directly.
* **Use Case:** When distinct classes share some common implementation but also have specific behaviors.

### B. Interfaces
* **Keyword:** `interface`
* **Details:** A blueprint of a class containing only abstract methods (prior to Java 8) and static constants. It provides 100% abstraction.
* **Use Case:** To implement multiple inheritance and define a contract that classes must follow.

---

## 💻 How to Run

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/YOUR-USERNAME/YOUR-REPO-NAME.git](https://github.com/YOUR-USERNAME/YOUR-REPO-NAME.git)
    ```
2.  **Navigate to the project folder:**
    ```bash
    cd YOUR-REPO-NAME
    ```
3.  **Compile and Run:**
    Open the folder in your IDE (IntelliJ/Eclipse/VS Code) or run via terminal:
    ```bash
    javac Main.java
    java Main
    ```

---


