package ds.pyramid;

public class Pyramid11 {
	
	public static void main(String[] args) {

		int rows = 8;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= (rows - i) * 2; j++)
				// create initial spacing.
				System.out.print(" ");

			for (int k = i; k >= 1; k--)
				// creates left half.
				System.out.print(" " + k);

			for (int k = 2; k <= i; k++)
				// creates right half.
				System.out.print(" " + k);

			System.out.println();
		}
	}

}

/*OUTPUT

               1
             2 1 2
           3 2 1 2 3
         4 3 2 1 2 3 4
       5 4 3 2 1 2 3 4 5
     6 5 4 3 2 1 2 3 4 5 6
   7 6 5 4 3 2 1 2 3 4 5 6 7
 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8

*/