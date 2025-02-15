/* Write three Java methods do the following
 • add()– add two integers pass as parameters and return the result
 • multiply()– multiply two integers pass as parameters and return the result
 • square()– receive an integer as a parameter and return the result after multiplying
 the number by itself.
 Use the above methods in the Main Method to calculate the result of the following
 mathematical expressions:
 i.
 ii.
 (3 ∗ 4+5∗7)^2
 (4 +7)^2 +(8+3)^2*/

public class IT24104191Lab9Q3

{

	public static void main(String[] args)

	{
		int ans2 = square(add(multiply(3, 4), multiply(5, 7)), 2);

		int ans1 = add(square(add(4, 7), 2), square(add(8, 3), 2));

		System.out.println("Result of (3 * 4 + 5 * 7) \u00B2      : " + ans2);
		System.out.println("Result of (4 + 7)\u00B2 + (8 + 3)\u00B2    :  " + ans1);

	}

	public static int add(int c, int z) {
		return c + z;

	}

	public static int multiply(int b, int a) {
		return b * a;

	}

	public static int square(int d, int e) {
		return (int) Math.pow(d, e);

	}

}