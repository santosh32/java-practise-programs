package ds.arrays;

public class ReverseStringEx {
	
	public static void main(String... args) {
		String originalString = "abcde"; // String to be reversed

		System.out.println("Original String: " + originalString);
		System.out.println(
				"Reversed String: " + reverseString(originalString));
	}

	/*
	 * return reversed String.
	 */
	public static String reverseString(String originalString) {
		char ar[] = originalString.toCharArray();
		char temp;
		for (int i = 0, j = ar.length - 1; i < (ar.length / 2); i++, j--) {
			temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
		}
		return new String(ar);
	}
}
/*OUTPUT

Original String: abcde
Reversed String: edcba
 
*/