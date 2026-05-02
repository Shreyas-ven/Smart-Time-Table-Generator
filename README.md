# Smart Timetable Generator (Backtracking)

## 📌 Project Overview

The **Smart Timetable Generator** is a Java-based mini project that automatically creates a timetable by assigning subjects to available time slots while avoiding scheduling conflicts.

This project uses the **Backtracking Algorithm**, a common technique used in Constraint Satisfaction Problems (CSP), where the program tries possible assignments and backtracks whenever a conflict occurs.

---

## 🎯 Objectives

* Assign subjects to available time slots
* Avoid teacher overlap conflicts
* Prevent room clashes
* Generate a valid timetable automatically
* Demonstrate practical use of recursion and backtracking

---

## 🛠️ Technologies Used

* Java
* IntelliJ IDEA / VS Code / Eclipse
* Git & GitHub

---

## 📚 Concepts Used

* Arrays
* Classes & Objects
* Recursion
* Backtracking
* Constraint Validation
* Scheduling Logic

---

## 📂 Project Structure

```text
Smart-Time-Table-Generator/
│── Main.java
│── README.md
```

---

## 🧠 How It Works

Each subject contains:

* Subject Name
* Teacher Name
* Room Number

Each slot contains:

* Day
* Time

The program:

1. Picks a subject
2. Tries assigning a time slot
3. Checks:

   * Same teacher already busy?
   * Same room already occupied?
4. If conflict occurs → undo assignment
5. Try next slot
6. Continue until timetable is complete

---

## 🔁 Backtracking Logic

```text
Try Slot
   ↓
Valid? ---- No → Try Next Slot
   ↓ Yes
Assign Subject
   ↓
Next Subject
   ↓
If stuck → Backtrack
```

---

## 💻 Sample Output

```text
Generated Timetable:
----------------------
Math -> Monday 9 AM | Teacher: Ravi | Room: R1
Physics -> Monday 9 AM | Teacher: Anu | Room: R2
Chemistry -> Monday 10 AM | Teacher: Ravi | Room: R1
English -> Tuesday 9 AM | Teacher: Kiran | Room: R3
```

---

## 🚫 Constraints Handled

### Teacher Conflict

A teacher cannot handle two subjects at the same time.

### Room Clash

A room cannot host two classes at the same time.

---

## ▶️ How to Run

1. Clone repository

```bash
git clone git@github.com:Shreyas-ven/Smart-Time-Table-Generator.git
```

2. Open project in IntelliJ / VS Code

3. Compile and run:

```bash
javac Main.java
java Main
```

---

## 📈 Future Enhancements

* GUI version using Java Swing
* Dynamic input from user
* Multiple sections support
* Lab room scheduling
* Teacher workload limits
* Export timetable to PDF/Excel

---

## 🎓 Academic Relevance

This project demonstrates how real-world scheduling systems work in:

* Schools
* Colleges
* Universities
* Exam scheduling systems

---

## 👨‍💻 Author

**Shreyas V**

