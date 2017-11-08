class Q1_14{
	public static int lg(int N){
		int result = -1;
		int n = 1;
		while(N > n){
			n *= 2;
			result ++;
		}
		return result;
	}

	public static void main(String[] args){
		System.out.println(lg(10));
	}
}