package ds.pyramid;

import java.util.Scanner;

public class Pyramid12 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = scanner.nextInt();
		System.out.println("");

		for (int i = 1; i <= n; i++) {
			int k = i;
			for (int j = 1; j <= n; j++) {
				System.out.print((j <= n - i ? " " : k--));
			}
			System.out.println();
		}

	}
}

/*OUTPUT

Enter n : 5
 
    1
   21
  321
 4321
54321
 
*/