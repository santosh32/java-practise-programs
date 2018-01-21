package ds.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacterInStringExample {

	public static void main(String[] args) {

		String inputString = "this is it";
		System.out
				.println("The first non repeated character in inputString("
						+ inputString + ") is :  "
						+ firstNonRepeatedCharacter(inputString));
	}

	/**
	 * Method returns first non-repeating character in inputString. Returns null
	 * if there is no non-repeating character in inputString
	 */
	public static Character firstNonRepeatedCharacter(String inputString) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>(); // LinkedHashMap
																				// used
																				// so
																				// that
																				// we
																				// could
																				// maintain
																				// insertion
																				// order.
		char ar[] = inputString.toCharArray();
		char ch;

		for (int i = 0; i < ar.length; i++) {
			ch = ar[i];

			if (map.containsKey(ch)) // if map already contains this character
										// as key, get value corresponding to
										// key and increment it.
				map.put(ch, map.get(ch) + 1);
			else // put character in map with value as 1 (showing first
					// occurrence of key in string)
				map.put(ch, 1);

		}
		/*
		 * Till this point of program, we have stored all unique characters in
		 * map as key & corresponding value representing count of character.
		 */

		for (int i = 0; i < ar.length; i++) {
			ch = ar[i];
			if (map.get(ch) == 1) // we have found our first non-repeating
									// character in string.
				return ch;
		}
		return null;
	}
}
/*
 * OUTPUT
 * 
 * The first non repeated character in inputString(this is it) is : h
 * 
 */