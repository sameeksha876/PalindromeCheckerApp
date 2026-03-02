# PalindromeCheckerApp

## 📌 Objective
To build a console-based Java application that checks whether a string is a palindrome using multiple Data Structure and Algorithm approaches.

This project was developed incrementally using Git branches for each Use Case (UC).

---

## 🚀 Features / Use Cases Implemented

### UC1 – Welcome Page
Displays:
- Application Name
- Version
- Initialization Message

---

### UC2 – Hardcoded Palindrome Check
Checks palindrome using a fixed string and loop comparison.

---

### UC3 – String Reverse Method
Reverses string and compares with original.

---

### UC4 – Character Array Approach
Uses two-pointer technique on char array.

---

### UC5 – Stack-Based Palindrome Check
Uses Stack (LIFO) to reverse characters.

Data Structure used:
- `Stack<Character>`

---

### UC6 – Queue + Stack Comparison
Uses:
- Queue (FIFO)
- Stack (LIFO)

Validates palindrome using both structures.

---

### UC7 – Deque Optimized Approach
Uses Double Ended Queue for efficient front/back comparison.

Data Structure used:
- `ArrayDeque<Character>`

---

### UC8 – Linked List Approach
Stores characters in LinkedList and compares from both ends.

Data Structure used:
- `LinkedList<Character>`

---

### UC9 – Recursive Palindrome Checker
Uses recursion to check palindrome.

Concept used:
- Recursion
- Base case & recursive case

---

### UC10 – Ignore Case & Spaces
Enhancement:
- Case insensitive
- Ignores spaces and special characters

Example:
A man a plan a canal Panama → Palindrome


---

### UC11 – Object Oriented Design
Introduced service class:
- `PalindromeService`
  Encapsulated palindrome logic using OOP principles.

Concepts used:
- Encapsulation
- Separation of concerns

---

### UC12 – Strategy Pattern Implementation
Implemented multiple algorithms using Strategy Design Pattern.

Strategies:
- Stack Strategy
- Deque Strategy

Concepts used:
- Interface
- Polymorphism
- Strategy Pattern

---

### UC13 – Performance Comparison
Measured execution time of algorithms using:
System.nanoTime()


Compared:
- Stack Strategy
- Deque Strategy

Displays execution time in nanoseconds.

---

## 🛠 Technologies Used
- Java
- IntelliJ IDEA
- Git & GitHub

---

## 🌱 Git Workflow Followed
For every Use Case:
1. Created new branch
2. Implemented feature
3. Committed changes
4. Created Pull Request
5. Merged into `main`

This demonstrates real-world Git workflow.

---

## 👩‍💻 Author
**Sameeksha Khurpe**