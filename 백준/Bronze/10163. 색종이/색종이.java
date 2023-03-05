import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[1001][1001];
		
		int N = sc.nextInt();
		for(int i=1; i<=N; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int D = sc.nextInt();
			
			for(int r=B; r<B+D; r++) {
				for(int c=A; c<A+C; c++) {
					arr[r][c] = i;
				}
			}
		}
		
		int[] cnt = new int[N+1];
		for(int r=0; r<1001; r++) {
			for(int c=0; c<1001; c++) {
				cnt[arr[r][c]]++;
			}
		}
		
		for(int i=1; i<N+1; i++) {
			System.out.println(cnt[i]);
		}
	}
}