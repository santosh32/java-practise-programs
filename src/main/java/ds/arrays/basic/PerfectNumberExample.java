package ds.arrays.basic;

public class PerfectNumberExample {

	public static void main(String a[]) {
		int n = 28;
		System.out.println(
				isPerfectNumber(n) == true ? n + " is perfect number."
						: n + " is not a perfect number.");
	}

	public static boolean isPerfectNumber(int n) {

		int sumOfDivisors = 1; // 1 is divisor of all the numbers, so initially
								// keep the sumOfDivisors=1 and start check
								// divisors from 2.
		for (int i = 2; i <= n / 2; i++)
			if (n % i == 0)
				sumOfDivisors += i;

		if (sumOfDivisors == n)
			return true;
		else
			return false;

	}

}
/*
 * OUTPUT
 * 
 * 28 is perfect number.
 * 
 */