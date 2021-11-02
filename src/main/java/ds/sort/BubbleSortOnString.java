package ds.sort;

public class BubbleSortOnString {

	String sortMethod(String s) {

		char ch[] = s.toCharArray();
		char chTemp;

		// bubble Sort - to perform reverse sorting
		for (int i = ch.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (ch[j] > ch[j + 1]) {
					// Swap logic in below 3 lines
					chTemp = ch[j];
					ch[j] = ch[j + 1];
					ch[j + 1] = chTemp;
				}
			}
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		BubbleSortOnString o = new BubbleSortOnString();
		String stringToBeSorted = "java";
		// String stringToBeSorted= "javaMadeSoEasy"; //Test String
		System.out.println(o.sortMethod(stringToBeSorted));
	}

}

/*
 * OUTPUT
 * 
 * aajv
 * 
 */