
public class ArrayConversion {

	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[] OneDArray = new int[] { 8, 9, 10, 11, 12, 13, 14, 15, 16, 1, 2, 3, 4, 5, 6, 7 };

		int rows = 4;
		int columns = 4;

		int[][] twoDArray = new int[rows][columns];
		int pos = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				twoDArray[i][j] = OneDArray[pos];
				pos++;
			}
		}
		System.out.println("Original 1D Array:");
		printArray(OneDArray);

		System.out.println("\nConverted 2D Array:");
		printArray(twoDArray);
	}

}
