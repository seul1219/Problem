import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[101][101];
		int N = sc.nextInt();
		for(int i=0; i<N; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			for(int r=B; r<B+10; r++) {
				for(int c=A; c<A+10; c++) {
					arr[r][c] = 1;
				}
			}
		}
		
		int cnt = 0;
		for(int r=0; r<101; r++) {
			for(int c=0; c<101; c++) {
				if(arr[r][c]==1) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
}