package ds.arrays.basic;

public class FibonacciSeriesExampleInJava {

	public static void main(String[] args) {

		int n = 10; // number of elements in series.
		generateFibonacciSeries(n);
	}

	public static void generateFibonacciSeries(int n) {
		int first = 0; // first number of series
		int second = 1; // second number of series
		int temp;

		System.out.print("FibonacciSeries: " + first + " " + second + " ");
		for (int i = 0; i < n; i++) {
			temp = first + second;
			first = second;
			second = temp;
			System.out.print(temp + " ");
		}
	}
}

/*OUTPUT

FibonacciSeries: 0 1 1 2 3 5 8 13 21 34 55 89
 
*/
