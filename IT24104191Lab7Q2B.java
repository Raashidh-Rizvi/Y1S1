/* Write a Java program to display numbers from 1– 5 and display the stars as shown
 below.
 1- *
 2- * *
 3- * * *
 4- * * * *
 5- * * * * *
 */

public class IT24104191Lab7Q2A {

    public static void main(String[] args) {

        int i, j;
        for (i = 1; i <= 5; i++) {
            System.out.print(i + " - ");
            for (j = 1; j <= i; j++) {

                System.out.print("* ");

            }

            System.out.println();
        }

    }
}