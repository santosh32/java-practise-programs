package ds.matrix;

public class SpiralMatrix1 {

	public static void main(String args[]) {

		System.out.println("Enter The Value For N :");

		// Scanner sc = new Scanner(System.in);
		//
		// int n = sc.nextInt();

		int n = 4;

		int[][] spiral = new int[n][n];

		int count = 0;

		for (int i = 0; i < n; i++) {
			int k = n - 1;
			for (int j = 0; j < n; j++) {
				if (i % 2 != 0) {
					spiral[i][k] = ++count;
					k--;
				} else {
					spiral[i][j] = ++count;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(spiral[i][j] + "\t");
			}
			System.out.println();
		}

		// sc.close();
	}
}

/*
Enter The Value For N :
1	2	3	4	
8	7	6	5	
9	10	11	12	
16	15	14	13	 
 

*/