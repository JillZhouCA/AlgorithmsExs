class Q1_15{
	public static int[] histogram(int[] a, int M){
		int[] result = new int[M];
		for(int i = 0; i < a.length; i ++){
			result[i] += 1;
		}
		return result;
	}

	public static void main(String args[]){
		int[] a = {1, 2, 3, 4};
		int[] hist = histogram(a, 5);

		for (int i = 0; i < hist.length; i++){
			System.out.print(hist[i]);
		}
		System.out.println();
	}
}