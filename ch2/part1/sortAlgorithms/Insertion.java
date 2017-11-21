class Insertion{
	public static void sort(int[] a){
		for(int i = 0; i < a.length; i++){
			int j = i;
			while(j > 0){
				j --;
				if(a[j] > a[i]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				else
					break;
			}
		}
	}

	public static void main(String[] args){
		int[] a = {7, 4, 3, 1, 9 , 12};
		Selection.sort(a);
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
}