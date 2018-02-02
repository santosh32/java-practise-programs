package ds.pyramid;

import java.util.Scanner;

public class Pyramid2 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = scanner.nextInt();
		System.out.println("");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		scanner.close();
	}
}

/*OUTPUT

Enter n : 5
 
1
22
333
4444
55555
 
*/