/* Write a Java program to add the content of array A and B and store it in a new array
 called C.
 int A[5] = 10, 20, 30, 40, 50;
 int B[5] = 34, 67, 12, 89, 12;
 int C[5];
 Calculate A+B and store in Array C*/

public class IT24104191Lab8Q2

{
    public static void main(String[] args) {

        int A[] = { 10, 20, 30, 40, 50 };
        int B[] = { 34, 67, 12, 89, 12 };
        int C[] = new int[5];

        for (int i = 0; i < 5; i++) {

            C[i] = A[i] + B[i];
        }

        System.out.println("A Array container : ");

        for (int i = 0; i < 5; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("\n");
        System.out.println("B Array container : ");

        for (int i = 0; i < 5; i++) {

            System.out.print(B[i] + " ");
        }
        System.out.println("\n");

        System.out.println("C Array container (A+B) : ");

        for (int i = 0; i < 5; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println("\n");
    }

}