import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int N = sc.nextInt();
		
		int res = 0;
		
		for(int i=1; i<=50; i++) {
			for(int j=1; j<=50; j++) {
				for(int k=1; k<=50; k++) {
					if(A*i + B*j + C*k == N) {
						res = 1;
					}
				}
			}
		}
		
		System.out.println(res);
	}
}