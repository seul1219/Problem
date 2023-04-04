import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static int N;
	public static int[][] map;
	public static StringTokenizer st;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		
		int max = Integer.MIN_VALUE;
		
		for(int r=0; r<N; r++) {
			st = new StringTokenizer(br.readLine());
			for(int c=0; c<N; c++) {
				map[r][c] = Integer.parseInt(st.nextToken());
				
				if(max<map[r][c]) {
					max = map[r][c];
				}
			}
		}
		
		int res = 0;
		int h = 0;
		
		while(h<max+1) {
			int cnt = 0;
			boolean[][] visited = new boolean[N][N];
			
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					//물에 잠기지 않은 지점
					if(map[r][c]>h && !visited[r][c]) {
						safe(r, c, h, visited);
						cnt++;
					}
				}
			}
			
			res = Math.max(res, cnt);
			h++;
		}
		
		System.out.println(res);
	}//main
	
	public static void safe(int r, int c, int h, boolean[][] visited) {
		Stack<int[]> st = new Stack<>();
		st.push(new int[] {r, c});
		
		
		int[] dr = {-1, 1, 0, 0};
		int[] dc = {0, 0, -1, 1};
		
		while(!st.isEmpty()) {
			int[] cur = st.pop();
			visited[cur[0]][cur[1]] = true;
			
			for(int d=0; d<4; d++) {
				int nr = cur[0] + dr[d];
				int nc = cur[1] + dc[d];
				
				if(nr>=0 && nr<N && nc>=0 && nc<N && !visited[nr][nc] && map[nr][nc]>h) {
					st.push(new int[] {nr, nc});
				}
			}
		}
	}
}