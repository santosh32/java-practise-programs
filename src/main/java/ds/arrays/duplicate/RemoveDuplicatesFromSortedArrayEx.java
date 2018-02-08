package ds.arrays.duplicate;

public class RemoveDuplicatesFromSortedArrayEx {

	public static void main(String a[]) {
//		int[] duplicateSortedAr = { 1, 3, 7, 8, 8, 9, 14, 16, 16, 17, 17 };
		int[] duplicateSortedAr = { 1, 3, 7, 8, 8, 9, 8, 9, 14, 16, 16, 17, 17 };
		int[] nonDuplicateSortedAr = removeDuplicates(duplicateSortedAr);

		System.out.print("Displaying contents of sorted array(with duplicate elements)  : ");
		for (int i = 0; i < duplicateSortedAr.length; i++) {
			System.out.print(duplicateSortedAr[i] + " ");
		}

		System.out.println();
		System.out.print("Displaying contents of sorted array(with non-duplicate elements) : ");
		for (int i = 0; i < nonDuplicateSortedAr.length; i++) {
			System.out.print(duplicateSortedAr[i] + " ");
		}

	}

	/**
	 * This method returns sorted array with non duplicate elements
	 */
	public static int[] removeDuplicates(int[] duplicateSortedAr) {

		int i = 0, j = 1;

		if (duplicateSortedAr.length < 2) { // means there is only one element
			return duplicateSortedAr;
		}

		while (j < duplicateSortedAr.length) {
			if (duplicateSortedAr[j] == duplicateSortedAr[i])
				j++;
			else
				duplicateSortedAr[++i] = duplicateSortedAr[j++];
		}

		int[] nonDuplicateSortedAr = new int[i + 1];
		for (int x = 0; x < nonDuplicateSortedAr.length; x++) {
			nonDuplicateSortedAr[x] = duplicateSortedAr[x];
		}

		return nonDuplicateSortedAr;
	}

}
/*
 * OUTPUT
 * 
 * Displaying contents of sorted array(with duplicate elements) : 1, 3, 7, 8, 8, 9, 14, 16, 16, 17, 17 
 * Displaying contents of sorted array(with non-duplicate elements) : 1 3 7 8 9 14 16 17 
 * 
 */