# 🛒 Electronic Store Management System (Phase 2)

## 📋 Overview
This is the second and final phase of the **CSC113** course project. In this phase, we have evolved the system from a console-based application to a fully functional **Graphical User Interface (GUI)** application with **Data Persistence** capabilities.

The system manages an electronic store's inventory, specifically focusing on Laptops and Smartphones, using object-oriented principles and dynamic data structures (Linked Lists).

---

## 👥 Project Team
* **Student Names:** 
* Salman Muslat AL-Mutiri [446102848]
* Abdulaziz Mazen AL-Aushan [446104638]
* **University:** King Saud University (KSU)
* **Course:** Computer Science (CSC 113)
* **Supervised by:** Dr.Khaja Mohammed

---

## 🛠️ Key Features (Phase 2)
- **Graphical User Interface (GUI):** Developed using `Java Swing` and `AWT` for a seamless user experience.
- **Dynamic Product Entry:** Specialized forms to add `Laptop` and `Smartphone` objects with real-time input handling.
- **Data Persistence:** Integrated `Object Serialization` to save and load the entire Shopping Cart state to/from a binary file (`.ser`).
- **Linked List Navigation:** Seamless transition between product entry and result viewing using the custom `Node` structure.
- **Exception Handling:** Robust `try-catch` blocks to handle input errors and file processing issues.

---

## 🏗️ Technical Architecture
- **Inheritance & Polymorphism:** Core logic built on a hierarchy starting from the `Product` class.
- **File I/O:** Implementation of `Serializable` interface for persistent storage.
- **Module Configuration:** Custom `module-info.java` for modern Java desktop environments.

---

## 🖥️ How to Run
1. Clone this repository.
2. Open the project in **Eclipse** or any Java IDE.
3. Ensure you are using **Java 21** or later.
4. Run the `TestStore.java` class to launch the application.
