class Shell{
	public static void sort(int[] a){
		int h = 1;
		while(h < a.length / 3)
			h = h*3 + 1;
		while(h >= 1){
			for(int i = h; i < a.length; i++){
				for(int j = i; j >= h && (a[j - h] > a[j]); j-= h){
						int temp = a[j];
						a[j] = a[j - h];
						a[j - h] = temp;
					}
				}
				h /= 3;
			}
			
		}

	public static void main(String[] args){
		int[] a = {7, 4, 3, 1, 9 , 12};
		Shell.sort(a);
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
}