package ds.arrays.palindrome;

public class PalindromeRecursionEx {
	public static void main(String... args) {
		String inputString = "aabaa";
		System.out.println(isPalindromeUsingRecursion(inputString)
				? inputString + " is a palindrome."
				: inputString + "is not a palindrome.");
	}

	/**
	 * This methods finds out whether inputString is palindrome or not
	 * recursively. Returns true if inputString is palindrome.
	 */
	public static boolean isPalindromeUsingRecursion(String inputString) {
		if (inputString.length() == 0 || inputString.length() == 1) {
			return true;
		}
		if (inputString.charAt(0) == inputString
				.charAt(inputString.length() - 1)) {
			return isPalindromeUsingRecursion(
					inputString.substring(1, inputString.length() - 1));
		}

		return false;
	}
}
/*
 * OUTPUT
 * 
 * aabaa is a palindrome.
 * 
 */