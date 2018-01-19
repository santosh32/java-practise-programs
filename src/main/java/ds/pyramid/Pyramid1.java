package ds.pyramid;

import java.util.Scanner;

public class Pyramid1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = scanner.nextInt();
		System.out.println("");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}

/*OUTPUT

Enter n : 5
 
1
12
123
1234
12345
 
*/