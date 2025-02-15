/* Write a Java program to create an integer array of size 6.
 Input numbers from the keyboard and store 6 positive numbers in the array.
 If a negative number or zero is entered, display an error message.
 Finally, find the maximum number.
 Note: A total of 6 positive numbers should be stored in the array*/

import java.util.Scanner;

public class IT24104191Lab8Q3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int newarray[] = new int[6];
		int max = 0;
		int i;
		for (i = 0; i <= 5; i++) {

			System.out.println("Enter a Postive Number (" + (i + 1) + "/6)");
			newarray[i] = input.nextInt();

			while (newarray[i] <= 0) {
				System.out.println("Error:Please Enter ONLY Postive Number");

				System.out.println("Enter a Positive Number (" + (i + 1) + "/6):");
				newarray[i] = input.nextInt();

			}
		}

		System.out.println();
		System.out.println("Array Contents ");
		for (i = 0; i <= 5; i++) {

			System.out.print(newarray[i] + " ");

		}
		System.out.println();
		for (i = 0; i <= 5; i++) {

			if (newarray[i] > max) {
				max = newarray[i];
			}
		}
		System.out.println();
		System.out.println("The Maximum Number Entered Is : " + max);

	}

}