import java.io.*;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][M];
		for(int r=0; r<N; r++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			for(int c=0; c<M; c++) {
				int tmp = Integer.parseInt(st2.nextToken());
				arr[r][c] = tmp;
			}
		}
		int[][] arr2 = new int[N][M];
		for(int r=0; r<N; r++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			for(int c=0; c<M; c++) {
				int tmp = Integer.parseInt(st2.nextToken());
				arr2[r][c] = tmp;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int r=0; r<N; r++) {
			for(int c=0; c<M; c++) {
				arr[r][c] = arr[r][c] + arr2[r][c];
				sb.append(arr[r][c]).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		
	}
}