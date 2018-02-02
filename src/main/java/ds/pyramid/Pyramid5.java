package ds.pyramid;

import java.util.Scanner;

public class Pyramid5 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = scanner.nextInt();
		System.out.println("");

		for (int i = n; i > 0; i--) {
			for (int j = n, k = 1; k <= i; j--, k++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		scanner.close();
	}
}


/*OUTPUT

Enter n : 5
 
54321
5432
543
54
5
 
*/