/*Write a Java program to input numbers via keyboard to an array called myArray.
 Size of the array is 5.
 Print the contents of the myArray in the reverse order you entered.*/
 
 import java.util.Scanner;

public class IT24104191Lab8Q1A {

    public static void main(String[] args) {

        int[] myarray = new int[5];
        int i;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 Numbers : ");

        for (i = 0; i < 5; i++) {

            System.out.print("Enter Number " + (i + 1) + ": ");

            myarray[i] = input.nextInt();

        }

        System.out.println("Arrays In reverse Order ");

        for (i = 4; i >= 0; i--) {

            System.out.print(myarray[i] + " ");
        }

    }

}