import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	//0 초과 30 미만(1~29)
	public static int[][] dp = new int[30][30];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			
			int A = Integer.parseInt(st.nextToken()); 
			int B = Integer.parseInt(st.nextToken());
			
			StringBuilder sb = new StringBuilder();
			sb.append(C(A, B));
			System.out.println(sb.toString());
		}
	}
	
	public static int C(int A, int B) {
		
		if(A==B) {
			return dp[A][B] = 1;
		}
		
		else if(A==1) {
			return dp[A][B] = B;
		}
		
		else if(A>B) {
			return 0;
		}
		
		else if(dp[A][B] > 0) {
			return dp[A][B];
		}
		
		return dp[A][B] = C(A, B-1) + C(A-1, B-1);
	}
}