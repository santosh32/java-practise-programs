package ds.pyramid;

import java.util.Scanner;

public class Pyramid9Double {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = scanner.nextInt();
		System.out.println("");

		for (int i = 1; i <= n; i++) { // it will create upper half
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println("");
		}

		for (int i = n; i > 0; i--) { // it will create lower half
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println("");
		}

	}
}

/*OUTPUT

Enter n : 4
 
*
**
***
****
****
***
**
*
 
 
*/