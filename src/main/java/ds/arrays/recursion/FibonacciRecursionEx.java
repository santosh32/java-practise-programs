package ds.arrays.recursion;

public class FibonacciRecursionEx {

	public static void main(String... args) {
		int n = 10; // generate series upto n.
		System.out.print("FibonacciSeries : 0 1 ");
		for (int i = 2; i <= n; i++) {
			System.out.print(fibonacciRecursion(i) + " ");
		}

	}

	/*
	 * return next number of FibonacciSeries using recursion.
	 */
	public static int fibonacciRecursion(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2); // using
																		// tail
																		// recursion
	}

}

/*
 * OUTPUT
 * 
 * FibonacciSeries : 0 1 1 2 3 5 8 13 21 34 55
 * 
 */