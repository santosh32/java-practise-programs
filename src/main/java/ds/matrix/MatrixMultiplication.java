package ds.matrix;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number of rows in first matrix : ");
		int rowsMatrix1 = scanner.nextInt();
		System.out
				.print("Enter number of columns in first matrix / rows in matrix2: ");
		int columnsMatrix1RowsMatrix2 = scanner.nextInt(); // variable name used
															// for understanding
															// convenience,
															// because columns
															// in matrix1 = rows
															// in matrix2
		System.out.print("Enter number of columns in second matrix : ");
		int columnsMatrix2 = scanner.nextInt();

		int[][] matrix1 = new int[rowsMatrix1][columnsMatrix1RowsMatrix2];
		int[][] matrix2 = new int[columnsMatrix1RowsMatrix2][columnsMatrix2];
		System.out.println("Enter the first matrix in elements :");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				matrix1[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Enter the second matrix elements:");
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[0].length; j++) {
				matrix2[i][j] = scanner.nextInt();
			}
		}

		// Multiply matrices
		int[][] productMatrix = new int[rowsMatrix1][columnsMatrix2];
		for (int i = 0; i < rowsMatrix1; i++) {
			for (int j = 0; j < columnsMatrix2; j++) {
				for (int k = 0; k < columnsMatrix1RowsMatrix2; k++) { // columns
																		// in
																		// matrix1=
																		// rows
																		// in
																		// matrix2
					productMatrix[i][j] = productMatrix[i][j] + matrix1[i][k]
							* matrix2[k][j];
				}
			}
		}

		System.out.println("\nFirst matrix is : ");
		for (int i = 0; i < rowsMatrix1; i++) {
			for (int j = 0; j < columnsMatrix1RowsMatrix2; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nSecond matrix is : ");
		for (int i = 0; i < columnsMatrix1RowsMatrix2; i++) {
			for (int j = 0; j < columnsMatrix2; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nProduct of matrix1 and matrix2 is");
		for (int i = 0; i < rowsMatrix1; i++) {
			for (int j = 0; j < columnsMatrix2; j++) {
				System.out.print(productMatrix[i][j] + " ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
/*OUTPUT

Enter number of rows in first matrix : 2
Enter number of columns in first matrix / rows in matrix2: 3
Enter number of columns in second matrix : 2
Enter the first matrix in elements :
1
2
3
4
5
6
Enter the second matrix elements:
7
8
9
10
11
12
 
First matrix is :
1 2 3
4 5 6
 
Second matrix is :
7 8
9 10
11 12
 
Product of matrix1 and matrix2 is:
58 64
139 154
 
*/