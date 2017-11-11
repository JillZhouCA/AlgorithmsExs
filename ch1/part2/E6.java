import java.util.*;

class E6{
	public static void main(String args[]){
		String s = "";
		String t = "";
		try(Scanner scanner = new Scanner(System.in)){
				s = scanner.nextLine();
				System.out.println(s);
				t = scanner.nextLine();
				System.out.println(t);
		if(s.concat(s).indexOf(t) >= 0)
			System.out.println("true");
		else
			System.out.println("false");	
		}
	}
}