package ds.matrix;

public class DisplayInRequiedFormat {
	public static void main(String... args) {

		char matrix[][] = new char[][] { { 'A', 'A', 'A' }, { 'B', 'B', 'B' },
				{ 'C', 'C', 'C' } };
		int rows = matrix.length;
		int columns = matrix[0].length;

		char outputMatrix[][] = new char[columns][rows];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++)
				outputMatrix[j][i] = matrix[i][j];
		}

		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < rows; j++)
				System.out.print(outputMatrix[i][j] + " ");

			System.out.println();
		}
	}
}
/*OUTPUT

A B C 
A B C 
A B C 

*/