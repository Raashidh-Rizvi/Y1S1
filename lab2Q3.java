public class lab2Q3 {

public static void main (String[]args) {

/*Write a Java program that calculates the length of the hypotenuse of a right triangle
 when two other sides are known (assume Side A = 3 and Side B = 4). */



	double A=3;
	double B=4;


	double h= Math.sqrt  ( Math.pow(A,2) + Math.pow(B,2));

	System.out.print("Length Of The Hypotenuse : " + h );
	
}



}

	