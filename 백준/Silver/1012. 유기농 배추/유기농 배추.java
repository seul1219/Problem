import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static StringTokenizer st;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			int[][] arr = new int[M][N]; 
			
			for(int j=0; j<K; j++) {
				st = new StringTokenizer(br.readLine());
				int num = Integer.parseInt(st.nextToken());
				int num2 = Integer.parseInt(st.nextToken());
				arr[num][num2] = 1;
			}
			
//			for(int r=0; r<M; r++) {
//				for(int c=0; c<N; c++) {
//					System.out.print(arr[r][c] + " ");
//				}
//				System.out.println();
//			}
			
			Stack<int[]> st = new Stack<>();
			
			int cnt = 0;
			
			boolean[][] visited = new boolean[M][N];
			
			int[] dr = {1, -1, 0, 0};
			int[] dc = {0, 0, 1, -1};
			
			for(int r=0; r<M; r++) {
				for(int c=0; c<N; c++) {
					if(arr[r][c]==1 && !visited[r][c]) {
						st.push(new int[] {r, c});
						cnt++;
						
						while(!st.isEmpty()) {
							int[] cur = st.pop();
							
							if(!visited[cur[0]][cur[1]]) {
								visited[cur[0]][cur[1]] = true;
								
								for(int d=0; d<4; d++) {
									int nr = cur[0] + dr[d];
									int nc = cur[1] + dc[d];
									
									if(nr>=0 && nr<M && nc>=0 && nc<N) {
										if(arr[nr][nc]==1) {
											st.push(new int[] {nr, nc});
										}
									}
								}
							}
						}
					}
				}
			}
			
			System.out.println(cnt);	
		}//T
	}//main
}