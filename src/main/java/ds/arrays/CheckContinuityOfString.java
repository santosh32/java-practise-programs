package ds.arrays;

public class CheckContinuityOfString {

	public static void main(String[] args) {
		String inputString = "wbaodralrd";
		String findString = "world";

		System.out.println(checkContinuity(inputString, findString) == true
				? "TRUE" : "FALSE");
	}

	/**
	 * returns true if required condition matches.
	 */
	static boolean checkContinuity(String inputString, String findString) {

		char inputCh[] = inputString.toCharArray();
		char findCh[] = findString.toCharArray();
		int pos = 0;

		for (int i = 0; i < inputCh.length; i++) {
			if (inputCh[i] == findCh[pos]) {
				pos++;
				if (pos == findCh.length)
					return true;
			}
		}
		return false;
	}
}
/*
 * OUTPUT
 * 
 * TRUE
 * 
 */