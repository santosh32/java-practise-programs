package ds.arrays.basic;

import java.util.ArrayList;
import java.util.List;

public class DividesWholeStringInStringsOfLengthOf3AndReturnListOfReversedStrings {

	static List<String> split(String s) {
		List<String> list = new ArrayList<String>();// to be returned, will keep
													// reversed subString [i.e.
													// cba and fed and ... ]
		char ch[] = s.toCharArray();
		int ctr = 0;
		char chSmall[] = new char[3];

		for (int i = 0; i < ch.length; i++) {
			chSmall[ctr] = ch[i];
			ctr++;
			if (ctr == 3 || i + 1 == ch.length) {
				ctr = 0;
				reverse(chSmall);
				list.add(new String(chSmall));
				chSmall = new char[3];
			}
		}
		return list;
	}

	static void reverse(char ch[]) {
		char temp;
		for (int i = 0, j = ch.length - 1; i <= ch.length / 2; i++, j--) {
			temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		}
	}

	public static void main(String[] args) {
		String s = "abcdefghi";
		// String s = "abcdefgh"; //Test String
		// String s = "abcdefghij"; //Test String
		List<String> list = split(s);
		System.out.println(list);
	}
}

/*
 * OUTPUT
 * 
 * [cba, fed, ihg]
 * 
 */