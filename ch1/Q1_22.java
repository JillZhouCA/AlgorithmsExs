class Q1_22 {
	public static int rank(int key, int[] a)
  	{  return rank(key, a, 0, a.length - 1, 0);  }
  	public static int rank(int key, int[] a, int lo, int hi, int depth)
  	{  // Index of key in a[], if present, is not smaller than lo
     //                                  and not larger than hi.
  		for(int i = 0; i < depth; i ++){
  			System.out.print(" ");
  		}
  		System.out.printf("lo: %d  high: %d%n", lo, hi);
  		depth += 1;
     	if (lo > hi) return -1;
     	int mid = lo + (hi - lo) / 2;
     	if      (key < a[mid]) return rank(key, a, lo, mid - 1, depth);
     	else if (key > a[mid]) return rank(key, a, mid + 1, hi, depth);
     	else                   return mid;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 6, 7, 8, 9, 12 };
		int key = 5;
		int pos = rank(key, a);
		if (pos == -1) {
			System.out.println("not found!");
		} else {
			System.out.println("position=" + pos);
		}
	}
}