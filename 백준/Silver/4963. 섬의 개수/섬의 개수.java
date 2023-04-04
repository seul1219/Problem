import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static StringTokenizer st;
	public static int w;
	public static int h;
	public static int[][] map;
	public static boolean[][] visited;
	public static int cnt;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			
			if(w==0 && h==0) {
				break;
			}
			
			map = new int[h][w];
			for(int r=0; r<h; r++) {
				st = new StringTokenizer(br.readLine());
				for(int c=0; c<w; c++) {
					map[r][c] = Integer.parseInt(st.nextToken());
				}
			}
			
			visited = new boolean[h][w];
			cnt = 0;
			
			for(int r=0; r<h; r++) {
				for(int c=0; c<w; c++) {
					if(map[r][c]==1 && !visited[r][c]) {
						land(r, c);
						cnt++;
					}
				}
			}
			
			System.out.println(cnt);
		}
	}
	
	public static void land(int r, int c) {
		Stack<int[]> st = new Stack<>();
		st.push(new int[] {r, c});
		
		while(!st.isEmpty()) {
			int[] cur = st.pop();
			visited[cur[0]][cur[1]] = true;
			
			int[] dr = {-1, 1, 0, 0, -1, -1, 1, 1};
			int[] dc = {0, 0, -1, 1, -1, 1, -1, 1};
			
			for(int d=0; d<8; d++) {
				int nr = cur[0] + dr[d];
				int nc = cur[1] + dc[d];
				
				if(nr>=0 && nr<h && nc>=0 && nc<w && !visited[nr][nc] && map[nr][nc]==1) {
					st.push(new int[] {nr, nc});
				}
			}
		}
	}
}