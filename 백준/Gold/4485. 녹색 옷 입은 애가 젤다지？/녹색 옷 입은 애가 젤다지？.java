import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	public static StringTokenizer st;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = 1;
		while(true) {
			int N = Integer.parseInt(br.readLine());
			if(N==0) {
				break;
			}
			
			int[][] arr = new int[N][N];
			for(int r=0; r<N; r++) {
				st = new StringTokenizer(br.readLine());
				for(int c=0; c<N; c++) {
					int w = Integer.parseInt(st.nextToken());
					arr[r][c] = w;
				}
			}
			
			boolean[][] visited = new boolean[N][N];
			
			int[] dr = {1, -1, 0, 0};
			int[] dc = {0, 0, 1, -1};
			
			//r, c, w 
			PriorityQueue<int[]> que = new PriorityQueue<>(new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[2] - o2[2];
				}
			});
			
			que.offer(new int[] {0, 0, arr[0][0]});
			
			while(!que.isEmpty()) {
				int[] cur = que.poll();
				
				for(int d=0; d<4; d++) {
					int nr = cur[0] + dr[d];
					int nc = cur[1] + dc[d];
					
					if(nr>=0 && nr<N && nc>=0 && nc<N && !visited[nr][nc]) {
						visited[nr][nc] = true;
						arr[nr][nc] += cur[2];
						que.offer(new int[] {nr, nc, arr[nr][nc]});
					}
				}
			}
			
			System.out.println("Problem " + (cnt++) + ": " + arr[N-1][N-1]);
		}
	}
}