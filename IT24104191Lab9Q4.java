/*Write a Java program to calculate the Final Mark and Grade of 5 students for a subject.
 a) Write a Java method called calcFinalMark() to calculate the final mark of the
 subject. When calculating the final mark, 30% is taken from the assignment mark
 and 70% is taken from the exam paper mark.
 Method should return the final mark
 b) Write a method called findGrades() to return the grade obtained for the given
 final mark. 
 c) Write a method called printDetails() to print the Name, Final Mark and Grade
 of a student.
 Your output should be as Name,Final mark And Grade as a table
 d) In your Main Method, ask the user to enter the Name, Assignment Mark (out of
 100) and the Exam Paper Mark (out of 100) of the 5 students from the keyboard.
 Display the Name, Final Mark and Grade of a student.
 Hint: Use the methods written in section b) and c */


import java.util.Scanner;

public class IT24104191Lab9Q4 {
    public static double calcFinalMark(double examMark, double assignMark) {
        return (examMark * 0.7) + (assignMark * 0.3);
    }

    public static char findGrade(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-10s %10.2f %10c\n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[5];
        double[] assignMarks = new double[5];
        double[] examMarks = new double[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name of the student " + (i + 1) + ": ");
            names[i] = input.next();
            System.out.print("Enter assignment mark (mark out of 100) for " + names[i] + ": ");
            assignMarks[i] = input.nextDouble();
            System.out.print("Enter exam paper mark (mark out of 100) for " + names[i] + ": ");

            examMarks[i] = input.nextDouble();
            finalMarks[i] = calcFinalMark(examMarks[i], assignMarks[i]);
            grades[i] = findGrade(finalMarks[i]);

System.out.println();
        }

        System.out.printf("%-10s %10s %10s\n", "Name", "Final Mark", "Grade");
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }
    }
}
