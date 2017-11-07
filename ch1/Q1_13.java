class Q1_13{
	public static void printTransposeMatrix(int[][] matrix){
		for(int j = 0; j < matrix[0].length; j++){
			for(int i = 0; i < matrix.length; i ++)
				System.out.print(matrix[i][j]);
			System.out.println();
		}
	}
	public static void main(String args[]){
		int[][] matrix = {{1,2,1},{3,4,3}};
		printTransposeMatrix(matrix);
	}
}