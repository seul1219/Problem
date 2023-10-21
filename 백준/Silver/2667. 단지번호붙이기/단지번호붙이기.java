import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Main {

	public static int N;
	public static int[][] map;
	public static int[] dr = {-1, 0, 1, 0};
	public static int[] dc = {0, -1, 0, 1};
	public static int res = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		map = new int[N][N];
		for(int r=0; r<N; r++) {
			String str = br.readLine();
			for(int c=0; c<N; c++) {
				map[r][c] = (int) str.charAt(c)-'0';
			}
		}
		
		boolean[][] visited = new boolean[N][N];
		List<Integer> list = new ArrayList<>();
		for(int r=0; r<N; r++) {
			for(int c=0; c<N; c++) {
				if(map[r][c]==1 && !visited[r][c]) {
					visited[r][c] = true;
					list.add(dfs(r, c, 1, visited));
					res++;
				}
			}
		}
		
		Collections.sort(list);
		
		System.out.println(res);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	
	public static int dfs(int r, int c, int cnt, boolean[][] visited) {
		for(int d=0; d<4; d++) {
			int nr = r + dr[d];
			int nc = c + dc[d];
			
			if(nr>=0 && nc>=0 && nr<N && nc<N && !visited[nr][nc] && map[nr][nc]==1) {
				visited[nr][nc] = true;
				cnt = dfs(nr, nc, cnt+1, visited);
			}
		}
		return cnt;
	}
}