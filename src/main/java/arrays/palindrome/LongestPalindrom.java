package arrays.palindrome;

public class LongestPalindrom {

	public static void main(String[] args) {
		// System.out.println(longestPalindromeStr("1234"));
		System.out.println(longestPalindromeStr("12321"));
		// System.out.println(longestPalindromeStr("9912321456"));
		// System.out.println(longestPalindromeStr("9912333321456"));
		// System.out.println(longestPalindromeStr("12145445499"));
		// System.out.println(longestPalindromeStr("1223213"));
		// System.out.println(longestPalindromeStr("abb"));
	}

	// O(n^2)
	public static String longestPalindromeStr(String str) {

		if (str == null)
			return null;

		String longest = str.substring(0, 1);

		for (int i = 0; i < str.length() - 1; i++) {
			// odd cases like 121
			String palindrome = intermediatePalindrome(str, i, i);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}

			// even cases like 1221
			palindrome = intermediatePalindrome(str, i, i + 1);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}
		}
		return longest;
	}

	public static String intermediatePalindrome(String str, int left, int right) {

		if (left > right)
			return null;

		while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
			left--;
			right++;
		}
		return str.substring(left + 1, right);
	}

}
