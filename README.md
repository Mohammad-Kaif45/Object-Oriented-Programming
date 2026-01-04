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
