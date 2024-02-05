import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static int N;
	public static int M;
	public static int[] arr;
	public static StringBuilder sb = new StringBuilder();
	public static int[] sel;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		sel = new int[M];
		NM(0, 0);
		
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
			for(int i=start; i<N; i++) {
				sel[cnt] = arr[i];
				NM(cnt+1, i+1);
			}
		}
	}
}