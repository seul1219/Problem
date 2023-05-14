import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		sb.append(A+B).append("\n");
		sb.append(A-B).append("\n");
		sb.append(A*B).append("\n");
		sb.append(A/B).append("\n");
		sb.append(A%B).append("\n");
		
		System.out.println(sb.toString());
	}
}