# 🎓 Student Grade Calculator

A Java console application developed as **Project 2** for the DecodeLabs Java Programming Internship.

The program accepts marks for multiple subjects, calculates the total marks and average percentage, assigns a grade, and displays the result clearly.

## 🚀 Features

- Accepts a user-defined number of subjects
- Takes marks out of 100 for each subject
- Calculates total marks and maximum possible marks
- Calculates the average percentage with decimal precision
- Assigns a grade using conditional statements
- Displays PASS/FAIL status
- Validates the number of subjects and marks
- Handles non-numeric input without crashing
- Uses loops to process any positive number of subjects

## 🛠️ Technologies Used

- Java
- Visual Studio Code
- Git & GitHub

## 📁 Project Structure

```text
decodelabs-java-project-2/
├── src/
│   └── StudentGradeCalculator.java
├── sample-output.txt
├── .gitignore
└── README.md
```

## ▶️ How to Run in VS Code

### Requirements
1. Install a JDK (Java Development Kit).
2. Install Visual Studio Code.
3. Install the **Extension Pack for Java** in VS Code.

### Run from the terminal

Open this project folder in VS Code, then run:

```bash
javac -d out src/StudentGradeCalculator.java
java -cp out StudentGradeCalculator
```

Alternatively, open `src/StudentGradeCalculator.java` and click **Run** above the `main` method if the Java extensions are installed.

## 🧪 Sample Output

```text
========================================
       STUDENT GRADE CALCULATOR
========================================
Enter the number of subjects: 5
Enter marks for subject 1 (0-100): 95
Enter marks for subject 2 (0-100): 88
Enter marks for subject 3 (0-100): 76
Enter marks for subject 4 (0-100): 84
Enter marks for subject 5 (0-100): 92

=============== RESULT ===============
Total Marks       : 435 / 500
Average Percentage: 87.00%
Grade             : B
Result            : PASS
======================================


<img width="355" height="290" alt="image" src="https://github.com/user-attachments/assets/4724a1e5-0c3e-4e17-8099-dac168d7779b" />

```

## 📊 Grade Criteria

| Average Percentage | Grade |
|---|---|
| 90–100% | A |
| 80–89.99% | B |
| 70–79.99% | C |
| 60–69.99% | D |
| 40–59.99% | E |
| Below 40% | F |

The project brief explicitly illustrates A at 90+, B at 80+, and C at 70+. The lower bands and 40% pass threshold above are sensible documented choices for this implementation; adjust them if your internship portal specifies a different grading scale.

## 🧠 Concepts Demonstrated

- Variables and data types
- `Scanner` and console input
- `for` and `while` loops
- Arithmetic operations
- Type casting (`double`)
- `if-else` conditional statements
- Input validation and exception handling
- Methods for reusable logic
- Formatted output with `printf`

## 👨‍💻 Developed By

**Devkant Prajapati**  
DecodeLabs Java Programming Internship — Project 2
