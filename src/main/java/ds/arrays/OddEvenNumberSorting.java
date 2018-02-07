package ds.arrays;

import java.util.Arrays;

public class OddEvenNumberSorting {

	static void sorting(int a[]) {
		System.out.println("Array Before sorting : " + Arrays.toString(a));

		int i = 0, j = a.length - 1;

		while (i < j) {
			while (a[i] == 0)
				i++;
			while (a[j] == 1)
				j--;
			if (i < j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}

		System.out.println("Array After sorting : " + Arrays.toString(a));

		System.out.println("=========================================");
	}

	public static void main(String[] args) {
		sorting(new int[] { 4, 5, 8, 9, 10 });

		sorting(new int[] { 12, 9, 21, 17, 33, 7 });

	}
}