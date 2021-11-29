package ds.arrays.recursion;

public class FactorialRecursionEx {
	public static void main(String... args) {
		int num = 4;
		System.out.println(
				"Factorial of " + num + " is: " + factorial(num));
	}

	/*
	 * return factorial of num.
	 */
	public static int factorial(int num) {

		if (num == 0)
			return 1;

		return num * factorial(num - 1);
	}
}
/*
 * OUTPUT
 * 
 * Factorial of 4 is: 24
 * 
 */