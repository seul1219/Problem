import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int C = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[C][R];
		int K = Integer.parseInt(br.readLine());
		
		if(K > C*R) {
			System.out.println(0);
			return;
		}
		
		int[] dr = {0, 1, 0, -1};
		int[] dc = {1, 0, -1, 0};
				
		int cnt = 1;
		int r=0;
		int c=0;
		int d = 0;
		
		while(cnt < C*R+1) {
			
			arr[r][c] = cnt++;
			
			if(arr[r][c] == K) {
				System.out.print(r+1);
				System.out.print(" ");
				System.out.println(c+1);
				return;
			}
			
			r += dr[d];
			c += dc[d];
			
			if(r<0 || r>C-1 || c<0 || c>R-1 || arr[r][c] != 0) {
				r -= dr[d];
				c -= dc[d];
				
				d = (d+1)%4;
						
				r += dr[d];
				c += dc[d];
			}
		}
	}
}