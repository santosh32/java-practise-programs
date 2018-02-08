package ds.arrays;

import java.util.Arrays;

public class SegregateOddEvenNumberSorting {

	static void sorting(int a[]) {
		
		System.out.println("Array Before sorting : " + Arrays.toString(a));
		System.out.println("=========================================");

		int i = 0, j = a.length - 1;

		while (i < j) {
			while (a[i] % 2 == 0)
				i++;
			while (a[j] % 2 != 0)
				j--;
			if (i < j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
			System.out.println(Arrays.toString(a));
		}

		System.out.println("Array After sorting : " + Arrays.toString(a));

		// TODO: two sub sets sorting goes
		
		System.out.println("i=" + i + " , j=" + j);

		System.out.println("=========================================");
	}

	public static void main(String[] args) {
		sorting(new int[] { 4, 5, 8, 9, 10 });

		sorting(new int[] { 12, 9, 21, 17, 33, 7 });

	}
}