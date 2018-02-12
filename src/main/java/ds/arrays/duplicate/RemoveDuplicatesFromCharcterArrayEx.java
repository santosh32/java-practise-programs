package ds.arrays.duplicate;

public class RemoveDuplicatesFromCharcterArrayEx {

	public static void main(String a[]) {

		String str = "JavaJ2EE";
		char[] ch = str.toCharArray();

		System.out.println("Original Str: " + str);

		System.out
				.println("After removed duplicates from str"
						+ " : " + removeDuplicates(ch));

	}

	public static String removeDuplicates(char[] ch) {
		int n = ch.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (ch[i] == ch[j]) {
					ch
					j--;
					n--;
				}
			}

		}
		return null;
	}

}
