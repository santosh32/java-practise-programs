package ds.arrays.basic;

public class ArmstrongNumberExample {
	
	public static void main(String... args) {
		int number = 153;
		int sum = 0;
		int temp = number; // temp will hold reference to number.
		while (temp > 0) {
			int rem = temp % 10;
			sum += (rem * rem * rem);
			temp = temp / 10;
		}

		if (number == sum)
			System.out.println(number + " is armstrong number.");
		else
			System.out.println(number + " is not armstrong number.");
	}
}

/*
 * OUTPUT
 * 
 * 153 is armstrong number.
 * 
 */