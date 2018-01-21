package ds.arrays.basic;

public class SumOfDigitsInNumberEx {
	
	public static void main(String... args) {

		int number = 1234;

		System.out.println("number     : " + number);
		System.out.println("sum of digits : " + sumOfDigits(number));

	}

	public static int sumOfDigits(int number) {
		int sum = 0;
		int remainder;

		while (number > 0) {
			remainder = number % 10;
			number = number / 10;
			sum += remainder;
		}
		return sum;
	}
}

/*OUTPUT

number          : 1234
sum of digits : 10
 
 
*/
