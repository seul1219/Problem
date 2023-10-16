import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int N;
	public static int M;
	public static int[] arr;
	public static int[] sel;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = i+1;
		}
		
		sel = new int[M];
		select(0);
		System.out.println(sb.toString());
	}

	public static void select(int cnt) {
		if(cnt==M) {
			for(int i=0; i<M; i++) {
				sb.append(sel[i]).append(" ");
			}
			sb.append("\n");
			return;
		} else {
			for(int i=0; i<N; i++) {
				sel[cnt] = arr[i];
				select(cnt+1);
			}
		}
	}
}