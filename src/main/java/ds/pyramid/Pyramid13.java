package ds.pyramid;

import java.util.Scanner;

public class Pyramid13 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = scanner.nextInt();
		System.out.println("");

		for (int i = 1; i <= n; i++) {
			int k = i;
			for (int j = 1; j <= n; j++) {
				if (j < i)
					System.out.print(" ");
				else
					System.out.print(k++);
			}
			System.out.println("");
		}

	}
}

/*OUTPUT

Enter n : 5
 
12345
 2345
  345
   45
    5
 
*/