/*Modify your Lab7Q1A program to get four subjects inputs in a single line (separated by space)
 and display the grades for three (3) students.*/

import java.util.Scanner;

public class IT24104191Lab7Q1B {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Marks For Four Subjects: ");
		System.out.println(" ");

		int std = 1;

		while (std <= 3) {
			int sum = 0;

			System.out.println("Student " + std);

			System.out.print("Enter Marks :");

			for (int i = 1; i <= 4; i++) {

				int marks = 0;
				marks = input.nextInt();
				sum += marks;

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
			std++;
			System.out.println("\n");

		}

	}

}