package ds.arrays.duplicate;

import java.util.Arrays;

public class RemoveDuplicatesFromUnSortedArrayEx {

	static void unique_array(int[] a) {
		System.out.println("Original Array : " + Arrays.toString(a));

		// Assuming all elements in input array are unique

		int n = a.length;

		// Comparing each element with all other elements

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				// If any two elements are found equal
				if (a[i] == a[j]) {
					//int temp = j;// set duplicate element index
					// delete the duplicate element by shifting the elements to
					// left
					for (int k = j; k < n - 1; k++) {
						a[k] = a[k + 1];
					}
					j--;
					n--;// reduce char array length
				}
			}
//			System.out.println(Arrays.toString(a));
		}

		// Copying only unique elements of my_array into array1
		int[] array1 = Arrays.copyOf(a, n);

		// Printing arrayWithoutDuplicates
		System.out.println("Array with unique values : " + Arrays.toString(array1));

		System.out.println("---------------------------");
	}

	public static void main(String[] args) {
		unique_array(new int[] { 0, 3, -2, 4, 3, 2 });

		unique_array(new int[] { 10, 22, 10, 20, 11, 22 });

	}
}