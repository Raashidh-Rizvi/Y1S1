import java.util.Scanner;

public class IT24104191Lab3Q3 {

public static void main (String[]args) {

Scanner input = new Scanner(System.in);

	System.out.print ("Enter The Amount : ");

	int num[] ={5000,1000,500,200,100,50,20,10,5,2,1};

	int amount = input.nextInt();

	int note[] = new int [11];
	int x[] = new int [11];

	for(int i=0; i<11; i++){
	
	note[i] = amount / num [i];

	amount = amount % num [i];


	System.out.println(num[i]+ " Notes - " + note[i]);

	}


}

}
	
	
	
