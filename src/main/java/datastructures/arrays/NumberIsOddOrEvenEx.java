package datastructures.arrays;

public class NumberIsOddOrEvenEx {
	public static void main(String[] args) {

		int number = 53;

		if ((number & 1) == 0)
			System.out.println(number + " is EVEN");
		else
			System.out.println(number + " is ODD");
	}
}
/*
 * OUTPUT
 * 
 * 53 is ODD
 * 
 */