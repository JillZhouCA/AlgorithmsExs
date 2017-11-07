class Q1_3{
	//Write a program that takes three integer command-line arguments 
	//and prints equal if all three are equal, and not equal otherwise.
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		System.out.println(a == b & b == c);
	}
}