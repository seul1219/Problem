import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		if(T>=90 && T<=100) {
			System.out.println("A");
		} else if(T>=80 && T<=89) {
			System.out.println("B");
		} else if(T>=70 && T<=79) {
			System.out.println("C");
		} else if(T>=60 && T<=69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}