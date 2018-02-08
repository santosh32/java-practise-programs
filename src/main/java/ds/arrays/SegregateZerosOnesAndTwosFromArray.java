package ds.arrays;

import java.util.Arrays;

public class SegregateZerosOnesAndTwosFromArray {

	public static void main(String[] args) {

		segregateZerosOnesAndTwos(new int[] { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 });
	}
	
	static void segregateZerosOnesAndTwos(int a[]) {

		System.out.println("Array Before segregate : " + Arrays.toString(a));

		int lo = 0;
		int hi = a.length - 1;
		int mid = 0, temp = 0;

		while (mid <= hi) {
			switch (a[mid]) {
			case 0: {
				temp = a[lo];
				a[lo] = a[mid];
				a[mid] = temp;
				lo++;
				mid++;
				break;
			}
			case 1:
				mid++;
				break;
			case 2:
				temp = a[mid];
				a[mid] = a[hi];
				a[hi] = temp;
				hi--;
				break;
			}
		}

		System.out.println("Array After segregate : " + Arrays.toString(a));

		System.out.println("=========================================");
	}
}