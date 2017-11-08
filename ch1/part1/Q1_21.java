import java.util.Scanner;

class Q1_21{
	public static void main(String args[]){
		try(Scanner s = new Scanner(System.in)){
			while(s.hasNext()){
				String line = s.nextLine();
				String[] items = line.split("\\s+");
				System.out.printf("%s  %s  %s  %.3f%n", items[0], items[1], items[2], 
				(double)Integer.parseInt(items[1])/Integer.parseInt(items[2]));
			}
		}
	}
}