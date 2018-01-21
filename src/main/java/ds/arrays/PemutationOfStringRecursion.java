package ds.arrays;

import java.util.HashSet;
import java.util.Set;

public class PemutationOfStringRecursion {

	public static void main(String... args) {
		String inputString = "XYZ";
		System.out.println("Permutations of inputString(" + inputString
				+ ") are: " + findPermutation(inputString));
	}

	/**
	 * method returns permutations of string.
	 */
	public static Set<String> findPermutation(String inputString) {
		Set<String> set = new HashSet<String>();
		Set<String> set2;
		String stringWithoutFirstChar;
		char firstChar;

		if (inputString.length() == 0) {
			set.add("");
			return set;
		}
		firstChar = inputString.charAt(0);
		stringWithoutFirstChar = inputString.substring(1);
		set2 = findPermutation(stringWithoutFirstChar);

		for (String s : set2) {
			for (int k = 0; k <= s.length(); k++) {
				set.add(insertCharacter(s, firstChar, k));
			}
		}
		return set;
	}

	public static String insertCharacter(String s, char ch, int i) {
		String begin = s.substring(0, i);
		String end = s.substring(i);
		return begin + ch + end;
	}

}
/*
 * OUTPUT
 * 
 * Permutations of inputString(XYZ) are: [XYZ, XZY, YZX, ZYX, ZXY, YXZ]
 * 
 */