package ds.arrays;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCountInStringUsingHashMapEx {

	public static void main(String[] args) {
		String inputString = "This is it";
		System.out.println("inputString is : " + inputString);
		System.out.print("Output is : ");
		characterCount(inputString);
	}

	/**
	 * Method calculates count of all characters in inputString.
	 */
	public static void characterCount(String inputString) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>(); // LinkedHashMap
																				// used
																				// so
																				// that
																				// we
																				// could
																				// maintain
																				// insertion
																				// order.
		char[] inputAr = inputString.toCharArray();

		for (int i = 0; i < inputAr.length; i++) {
			char ch = inputAr[i];
			if (map.containsKey(ch))
				map.put(ch, map.get(ch) + 1);
			else
				map.put(ch, 1);

		}
		/*
		 * Till this point of program, we have stored all unique characters in
		 * map as key & corresponding value representing count of character.
		 */

		Iterator<Character> charIterator = map.keySet().iterator();
		while (charIterator.hasNext()) {
			char ch = charIterator.next();
			System.out.print(ch + "=" + map.get(ch) + " ");
		}

	}

}

/*
 * OUTPUT
 * 
 * inputString is : This is it Output is :T=1 h=1 i=3 s=2 =2 t=1
 * 
 */