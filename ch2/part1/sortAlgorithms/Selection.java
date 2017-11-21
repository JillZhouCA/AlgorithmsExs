class Selection{
	//inplace sort the int array a by using selection sort algorithm
	public static void sort(int a[]){
		for(int i = 0; i < a.length; i++){
			int minPos = i;
			for(int j = i + 1; j < a.length; j++){
				if(a[j] < a[minPos])
					minPos = j;
			}
			int temp = a[i];
			a[i] = a[minPos];
			a[minPos] = temp;
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