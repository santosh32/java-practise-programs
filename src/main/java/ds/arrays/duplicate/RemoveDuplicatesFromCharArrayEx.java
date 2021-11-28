package ds.arrays.duplicate;

public class RemoveDuplicatesFromCharArrayEx {

	public static void main(String a[]) {

		String str = "AAABBCDDD";
		char[] ch = str.toCharArray();

		System.out.println("Original Str: " + str);

		System.out.println("Removed duplicates from str" + " : "
				+ removeDuplicates(ch));

	}

	public static String removeDuplicates(char[] ch) {
		int n = ch.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (ch[i] == ch[j]) {
					int temp = j;// set duplicate element index
					// delete the duplicate element by shifting the elements to
					// left
					for (int k = temp; k < n - 1; k++) {
						ch[k] = ch[k + 1];
					}
					j--;
					n--;// reduce char array length
				}
			}
		}
		return new String(ch).substring(0, n);
	}
}
