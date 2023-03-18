import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] dp = new int[1000001];
		
		dp[1] = 0;
		dp[2] = 1;
		dp[3] = 1;
		
		if(N>3) {
			for(int i=4; i<1000001; i++) {
				dp[i] = dp[i-1] + 1;
				
				if(i%2==0 && i%3!=0) {
					dp[i] = Math.min(dp[i], dp[i/2] + 1);
				}
				else if(i%3==0 && i%2!=0) {
					dp[i] = Math.min(dp[i], dp[i/3] + 1);
				}
				else if(i%6==0) {
					dp[i] = Math.min(dp[i], Math.min(dp[i/2] + 1, dp[i/3] + 1));
				}
			}
		}
		
		System.out.println(dp[N]);
	}
}