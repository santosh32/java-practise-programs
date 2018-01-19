package ds.pyramid;

import java.util.Scanner;

public class Pyramid7Floyds {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter rows in Floyd's triangle : ");
		int rows = scanner.nextInt();
		System.out.println("");

		int nextNumber = 1;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(nextNumber < 10 ? ("  " + nextNumber++) : (" " + nextNumber++)); 
				// 2spaces in single digit & 1 space in double digit.
				// System.out.format("%3d",nextNumber++ ); //You may use this
				// line for formatting as a replacement of above line. (comment
				// above line before using this)
			}
			System.out.println();
		}

	}
}

/*OUTPUT

Enter rows in Floyd's triangle : 5
 
  1
  2  3
  4  5  6
  7  8  9 10
 11 12 13 14 15
 
*/