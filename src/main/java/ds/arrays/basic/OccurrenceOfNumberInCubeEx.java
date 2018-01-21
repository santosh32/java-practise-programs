package ds.arrays.basic;

public class OccurrenceOfNumberInCubeEx {

	public static void main(String[] args) {

		long num = 1551;
		int occurrenceOf = 1; // calculate OccurrenceOf this digit in number.

		System.out.println("Cube of entered number(" + num + ") is: " + num * num * num);
		System.out.println("Occurrence of " + occurrenceOf + " in cube of " + num + " is: "
				+ calculateOccurrenceOf(num, occurrenceOf));

	}

	/**
	 * method return OccurrenceOf digit in cube of given number.
	 */
	public static int calculateOccurrenceOf(long num, int occurrenceOf) {
		long cubeOfNumber = num * num * num;
		int count = 0;

		while (cubeOfNumber > 0) {
			if (cubeOfNumber % 10 == occurrenceOf) {
				count++;
			}
			cubeOfNumber = cubeOfNumber / 10;
		}
		return count;
	}

}
/*OUTPUT

Cube of entered number(1551) is: 3731087151
Occurrence of 1 in cube of 1551 is: 3
 
*/