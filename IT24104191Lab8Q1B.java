/* Create another array called evenArray. Find the even numbers of array myArray
 and store them in evenArray.*/

import java.util.Scanner;

public class IT24104191Lab8Q1B {

public static void main (String[]args){

int [] evenarray =new int[5];
int i;
Scanner input=new Scanner(System.in);

System.out.println("Enter 5 Numbers : " );

for( i=0;i<5;i++) {

System.out.print("Enter Number "+  (i+1) +": ");

evenarray[i]=input.nextInt();



}




System.out.println("Arrays In reverse Order ");


for( i=0;i<5;i++) {

System.out.print(evenarray[i]+" ");


}


System.out.println("\nEven Array Content: ");

for( i=0;i<5;i++) {

if(evenarray[i] % 2 ==0) {

System.out.print(evenarray[i]+" ");
}
else 
System.out.print("0 ");
}

}

}