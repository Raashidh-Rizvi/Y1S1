/*Write a java program to fill the following array to represent a Fibonacci series. 
  0  1  1  2  3  5  8  13  21  34       
 
a) Create an array called fib of size 10. 
b) Initialize first two array elements with 0 and 1 respectively. 
c) Fill the other array elements as follows using a repetition structure. 
 
   fib[2] = fib[0] + fib[1] 
   fib[3] = fib[1] + fib[2] 
   fib[4] = fib[2] + fib[3] 
 
d) Display the output as shown in the above figure. */



public class IpStudyPackQn1Part1 {

	public static void main(String[]args) {



		int fib[] =new int[10];
		fib[0]=0;
		fib[1]=1;
	for(int i=0;i<=7;i++){
		
		fib[i+2]=fib[i]+fib[i+1];

	
	}
	

	for(int i=0;i<=9;i++){
		System.out.print(fib[i] +" ");
	}



	}

}