# Smart Task Manager

The **Smart Task Manager** is a JavaFX-based application designed to help users efficiently manage their tasks. Through a user-friendly graphical interface, it allows for adding, removing, and updating tasks. This document explains the project's class hierarchy, use of OOP principles, GUI implementation, version control approach, team contributions, and challenges faced during development.

## Table of Contents
1. [Introduction](#introduction)
2. [Class Hierarchy and Design](#class-hierarchy-and-design)
3. [OOP Principles](#oop-principles)
4. [GUI Implementation](#gui-implementation)
5. [Software and Tools Used](#software-and-tools-used)
6. [Version Control](#version-control)
7. [Team Contributions and Challenges](#team-contributions-and-challenges)
8. [Conclusion](#conclusion)

---

## Introduction

The **Smart Task Manager** is a JavaFX application for managing tasks. It features:
- Adding, removing, and updating tasks.
- A visually appealing interface using JavaFX and Scene Builder.

---

## Class Hierarchy and Design

- **`Main` (com.fx.Main)**
  - **Role**: Entry point for the application.
  - **Functionality**: Loads `task.fxml`, sets the scene and primary stage, and starts the application lifecycle.

- **`Task` (com.fx.Task)**
  - **Type**: Abstract class defining the attributes and behaviors of a task.
  - **Attributes**:
    - `String name`: Task title or description.
    - `boolean isDone`: Indicates task completion status.
  - **Methods**:
    - `setName(String name)` and `setDone(boolean isDone)`: Mutators.
    - `getName()` and `isDone()`: Accessors.
    - Abstract methods for task management to be implemented by subclasses.

- **`TaskManager` (com.fx.TaskManager)**
  - **Extends**: `Task`
  - **Role**: Manages multiple tasks using an `ArrayList`.
  - **Key Methods**:
    - `addTask(Task task)`
    - `removeTask(Task task)`
    - `updateTask(int index, String newName)`
    - `getTasks()`

- **`Controller` (com.fx.Controller)**
  - **Role**: Intermediary between the GUI and task management logic.
  - **Key Methods**:
    - `onAddTaskClick()`: Prompts user to add a task.
    - `onRemoveTaskClick()`: Removes selected tasks.
    - `onUpdateTaskClick()`: Updates the name of a selected task.

---

## OOP Principles

- **Abstraction**: Abstract methods in `Task` enforce concrete implementation in subclasses.
- **Inheritance**: `TaskManager` extends `Task`, inheriting its properties and methods.
- **Encapsulation**: Private fields with public getters and setters ensure controlled access.
- **Polymorphism**: Treating `TaskManager` as a `Task` reference allows uniform task handling.

---

## GUI Implementation

- **JavaFX & FXML**:
  - Components include a welcome label, buttons for task management, and a `ScrollPane` displaying tasks as `CheckBox` elements.

- **User Interaction**:
  - **Add Task**: Prompts user for a task name and displays it as a `CheckBox`.
  - **Remove Task**: Removes selected tasks.
  - **Update Task**: Allows renaming of tasks.

---

## Software and Tools Used

- **JavaFX & Scene Builder**: For GUI design and development.
- **Development Environments**:
  - IntelliJ IDEA for some team members.
  - VS Code and Linux for others.
- **Version Control**: Git/GitHub.

---

## Version Control

- **Approach**:
  - Simple workflow: Local changes were committed and pushed directly to the `main` branch.
- **Repository**: [GitHub Repository](https://github.com/xnts0/Mini-Project/tree/main)

**Sample Commit History**:
- `add name` (by xnts0)
- `fix errors` (by xnts0)
- `add remove method` (by HaruAzashi)
- `fix update method` (by manaf45)

---

## Team Contributions and Challenges

### Team Contributions
- **Faisal Hassan Ahmed Sumayli** (Leader):
  - Established project structure and implemented core classes.
- **Abdullah**:
  - Developed `addTask` functionality.
- **Saleh**:
  - Implemented `removeTask` functionality.
- **Manaf**:
  - Created the `updateTask` feature.

### Challenges
1. **Scheduling Conflicts**: Balancing development with exams and commitments.
2. **Environment Issues**: Transitioning between VS Code and IntelliJ IDEA.
3. **Debugging Difficulties**: Resolving toolchain conflicts across operating systems.

---

## Conclusion

The **Smart Task Manager** exemplifies the effective application of OOP principles, a well-structured class hierarchy, and a user-friendly GUI. Despite challenges, the team delivered a functional and extensible task management application.

---

**GitHub Repository**: [Smart Task Manager](https://github.com/xnts0/Mini-Project/tree/main)
