class Q1_11{
	//Write a code fragment that prints the contents of a two-dimensional
	// boolean array, using * to represent true and a space to represent false. 
	// Include row and column numbers.
	public static void printBooleanMatrix(boolean[][] matrix) {
		for (int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j] ? '*' : ' ');
			}
			System.out.println();
		}
	}

	public static void main(String args[]){
		boolean[][] a = { { true, false}, { false, true}};
		printBooleanMatrix(a);
	}
}