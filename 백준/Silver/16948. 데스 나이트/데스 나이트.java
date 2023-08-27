import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sr = Integer.parseInt(st.nextToken());
		int sc = Integer.parseInt(st.nextToken());
		int er = Integer.parseInt(st.nextToken());
		int ec = Integer.parseInt(st.nextToken());
	
		int[] dr = {-2, -2, 0, 0, 2, 2};
		int[] dc = {-1, 1, -2, 2, -1, 1};
		
		Queue<int[]> que = new LinkedList<>();
		boolean[][] visited = new boolean[N][N];
		visited[sr][sc] = true;
		que.offer(new int[] {sr, sc, 0});
		
		boolean flag = false;
		int cnt = 0;
		while(!que.isEmpty()) {
			int[] cur = que.poll();
			if(cur[0]==er && cur[1]==ec) {
				flag = true;
				cnt = cur[2];
				break;
			}
			
			for(int d=0; d<6; d++) {
				int nr = dr[d] + cur[0];
				int nc = dc[d] + cur[1];
				
				if(nr>=0 && nr<N && nc>=0 && nc<N) {
					if(!visited[nr][nc]) {
						visited[nr][nc] = true;
						que.offer(new int[] {nr, nc, cur[2]+1});
					}
				}
			}
		}
		
		if(flag) {
			System.out.println(cnt);
		} else {
			System.out.println(-1);
		}
	}
}