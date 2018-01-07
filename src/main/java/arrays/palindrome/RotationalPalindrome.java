package arrays.palindrome;

public class RotationalPalindrome {

	public static void main(String[] args) {

		String inputStr = "aaaad";

		isRotationalPaliondrome(inputStr);

	}

	public static boolean isRotationalPaliondrome(String inputStr) {

		char ch[] = inputStr.toCharArray();

		for (int x = 0; x < inputStr.length(); x++) {
			rotateString(ch);
			if (isPalindrome(ch)) {
				System.out.println("inputString(i.e " + inputStr + ") is rotation of the palindrome: " + String.valueOf(ch));
				return true;
			}
		}
		return false;
	}

	public static void rotateString(char[] ch) {
		char temp = ch[0];
		int x = 0;
		for (x = 0; x < ch.length - 1; x++) {
			ch[x] = ch[x + 1];
		}
		ch[x] = temp;
	}

	public static boolean isPalindrome(char ch[]) {
		for (int i = 0, j = ch.length - 1; i < (ch.length / 2); i++, j--) {
			if (ch[i] != ch[j])
				return false;
		}
		return true;
	}

}
/**
 * OUTPUT
 * 
 * inputString(i.e aadaa) is rotation of the palindrome: aadaa
 * 
 */
