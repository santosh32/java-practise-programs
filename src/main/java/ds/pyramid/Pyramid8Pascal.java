package ds.pyramid;

import java.util.Scanner;

public class Pyramid8Pascal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter no of rows in Pascal's triangle : ");
		int rows = scanner.nextInt();
		int nextNumber;
		System.out.println("");

		for (int i = 0; i < rows; i++) {
			nextNumber = 1;

			for (int k = 0; k < (rows - i) * 2; k++)
				// create (rows-i)*2 spaces, for initial spacing.
				System.out.print(" ");

			for (int j = 0; j <= i; j++) {
				System.out.format("%4d", nextNumber); // %4d creates 4 space between number.
				nextNumber = nextNumber * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}

/* OUTPUT

Enter no of rows in Pascal's triangle : 6
 
                  1
                1   1
            1   2   1
           1   3   3   1
         1   4   6   4   1
      1   5  10  10   5   1
 
*/