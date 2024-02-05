import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static int N;
	public static int M;
	public static StringBuilder sb = new StringBuilder();
	public static int[] sel;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		sel = new int[M];
		NM(0, 1);
		
		System.out.println(sb.toString());
	}
	
	public static void NM(int cnt, int start) {
		
		if(cnt==M) {
			for(int i=0; i<M; i++) {
				sb.append(sel[i]).append(" ");
			}
			sb.append("\n");
			
			return;
		} else {
			for(int i=start; i<=N; i++) {
					sel[cnt] = i;
					NM(cnt+1, i+1);
			}
		}
	}
}