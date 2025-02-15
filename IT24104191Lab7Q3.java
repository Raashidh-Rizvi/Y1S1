/* SunSet supermarket has decided to give a 5% discount to the total bill amount during
 the festive season. A discount is given only to the customers who pay the bill in cash.
 Write a Java program to enter the total bill amount of 5 customers from the keyboard
 and calculate the discount and the amount to be paid.
 The program should ask the user to enter the mode of payment. The mode of payment
 can be either cash (C or c) or other (O or o). Allow the user to enter only ‘C’ and ‘O’
 (both capital or simple) and display error message ‘Payment Mode is Not Valid’ for
 any other mode of payment*/


import java.util.Scanner;

public class IT24104191Lab7Q3 
{
public static void main (String[]args)
{


        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[5]; // Array size is 5
        
        // Input 5 numbers
        System.out.println("Enter 5 Numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }

        // Print array in reverse order
        System.out.println("\nArray in Reverse Order:");
        for (int i = 4; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }


}
	
