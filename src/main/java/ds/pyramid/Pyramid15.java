package ds.pyramid;

import java.util.Scanner;

public class Pyramid15 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = scanner.nextInt();
		System.out.println("");

		for (int i = 1; i <= n; i++) {
			for (int j = 1, k = i; j <= i; j++) {
				System.out.print(k * j + " ");
			}
			System.out.println("");
		}

	}
}

/*OUTPUT

Enter n : 5
 
1
2 4
3 6 9
4 8 12 16
5 10 15 20 25
 
*/