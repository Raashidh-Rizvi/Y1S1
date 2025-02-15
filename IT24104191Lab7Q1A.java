/* Write a Java program to display the grade of a student.
The user should enter marks for four subjects and find the average. The overall
grade (based on average) is assigned as follows:
Marks   - Grade
100- 75-Distinction
74- 50-Credit
49- 0-Fail */




import java.util.Scanner;

public class IT24104191Lab7Q1A {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter Marks For Four Subjects: ");

    int count = 1;
    int sum = 0;

    while (count <= 4) {

      System.out.println("Enter Subject Mark " + count);
      int mark = input.nextInt();

      count++;

      sum = sum + mark;

    }

    double avg = sum / 4.0;

    System.out.println("Average Is :" + avg);

    System.out.print("Overall Grade Is :");

    if (avg >= 75) {
      System.out.print("Distinction");

    } else if (avg >= 50) {
      System.out.print("Credit");

    } else {
      System.out.print("Fail");
    }

  }

}