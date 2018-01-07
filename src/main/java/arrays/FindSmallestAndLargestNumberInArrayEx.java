package arrays;

public class FindSmallestAndLargestNumberInArrayEx {
	static int ar[] = { 3, 9, 4, 9, 1, 2, 5, 8, 12, 7 }; // given array

	public static void main(String[] args) {

		int smallestNumber = ar[0];
		int largestNumber = ar[0];

		for (int i = 1; i < ar.length; i++) {
			if (ar[i] > largestNumber)
				largestNumber = ar[i];
			else if (ar[i] < smallestNumber)
				smallestNumber = ar[i];
		}

		System.out.println("Smallest Number in array is : " + smallestNumber);
		System.out.println("Largest Number in array is : " + largestNumber);
	}

}

/*
 * 
 * Smallest Number in array is : 1 
 * Largest Number in array is : 12
 * 
 */