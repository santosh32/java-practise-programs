package ds.pyramid;

import java.util.Scanner;

public class Pyramid3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = scanner.nextInt();
		System.out.println("");

		for (int i = n; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		scanner.close();
	}
}
/*OUTPUT

Enter n : 5
 
12345
1234
123
12
1
 
*/