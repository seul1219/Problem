import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Y = sc.nextInt();
		
		if((Y%4)==0 && ((Y%100)!=0 || (Y%400)==0)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}