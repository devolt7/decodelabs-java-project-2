import java.util.Scanner;

/**
 * DecodeLabs Java Programming Internship - Project 2
 * Student Grade Calculator
 *
 * Calculates total marks, average percentage, and grade.
 */
public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("       STUDENT GRADE CALCULATOR");
        System.out.println("========================================");

        int numberOfSubjects = readPositiveInteger(
                scanner, "Enter the number of subjects: ");

        int totalMarks = 0;
        int maximumMarks = numberOfSubjects * 100;

        for (int i = 1; i <= numberOfSubjects; i++) {
            int marks = readMarks(scanner, "Enter marks for subject " + i + " (0-100): ");
            totalMarks += marks;
        }

        // Cast to double before division so decimal places are preserved.
        double averagePercentage = (double) totalMarks / numberOfSubjects;
        String grade = calculateGrade(averagePercentage);

        System.out.println();
        System.out.println("=============== RESULT ===============");
        System.out.printf("Total Marks       : %d / %d%n", totalMarks, maximumMarks);
        System.out.printf("Average Percentage: %.2f%%%n", averagePercentage);
        System.out.println("Grade             : " + grade);

        if (averagePercentage >= 40.0) {
            System.out.println("Result            : PASS");
        } else {
            System.out.println("Result            : FAIL");
        }

        System.out.println("======================================");
        scanner.close();
    }

    private static int readPositiveInteger(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                int value = Integer.parseInt(input);
                if (value > 0) {
                    return value;
                }
                System.out.println("Please enter a number greater than 0.");
            } catch (NumberFormatException exception) {
                System.out.println("Invalid input. Please enter a whole number.");
            }
        }
    }

    private static int readMarks(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                int marks = Integer.parseInt(input);
                if (marks >= 0 && marks <= 100) {
                    return marks;
                }
                System.out.println("Invalid marks. Marks must be between 0 and 100.");
            } catch (NumberFormatException exception) {
                System.out.println("Invalid input. Please enter marks as a whole number.");
            }
        }
    }

    private static String calculateGrade(double percentage) {
        if (percentage >= 90.0) {
            return "A";
        } else if (percentage >= 80.0) {
            return "B";
        } else if (percentage >= 70.0) {
            return "C";
        } else if (percentage >= 60.0) {
            return "D";
        } else if (percentage >= 40.0) {
            return "E";
        } else {
            return "F";
        }
    }
}
