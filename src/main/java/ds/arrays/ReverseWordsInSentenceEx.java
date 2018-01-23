package ds.arrays;

public class ReverseWordsInSentenceEx {

	public static void main(String[] args) {
		
		String inputString = "i am doing good";
		System.out.println("Original String                       : "
				+ inputString);
		System.out.print("String after reversing words in sentence : ");
		System.out.println(reverseWordsInSentence(inputString));
	}

	public static char[] reverseWordsInSentence(String inputString) {
		char inputAr[] = inputString.toCharArray();
		char outputAr[] = new char[inputString.length()];

		int spacePos = 0, subStringLength = 0;
		int outputArIndex = 0;
		for (int inputArIndex = inputAr.length - 1; inputArIndex >= 0; inputArIndex--) { //strat iterating from last position

			if (inputArIndex == 0) { // if we have reached starting index of  inputAr.
				while (!String.valueOf(inputAr[inputArIndex]).equals(" ")) { //start iterating from start, as soon as you find space exit while loop.
					outputAr[outputArIndex++] = inputAr[inputArIndex++];
				}

				return outputAr;
			}

			if (String.valueOf(inputAr[inputArIndex]).equals(" ")) { //we have found space.

				spacePos = inputArIndex; // store space position found in variable.
				subStringLength = inputAr.length - 1 - spacePos; //calculate length of substring we have found

				while (outputArIndex < subStringLength) {
					outputAr[outputArIndex++] = inputAr[++spacePos];
				}

				outputAr[outputArIndex++] = ' '; //inserting space at last and then incrementing outputArIndex
			}
		}
		return outputAr;
	}

}

/*
 * OUTPUT
 * 
 * Original String : i am doing good String after reversing words in sentence :
 * good doing am i
 */