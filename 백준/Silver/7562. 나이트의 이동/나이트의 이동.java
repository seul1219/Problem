import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static int res;
	public static int l;
	public static int[][] arr;
	public static int X;
	public static int Y;
	public static int X2;
	public static int Y2;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			res = Integer.MAX_VALUE;
			l = Integer.parseInt(br.readLine());
			arr = new int[l][l];

			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			X = Integer.parseInt(st.nextToken());
			Y = Integer.parseInt(st.nextToken());
			
			String str2 = br.readLine();
			StringTokenizer st2 = new StringTokenizer(str2, " ");
			X2 = Integer.parseInt(st2.nextToken());
			Y2 = Integer.parseInt(st2.nextToken());
			
			bfs();
			
			System.out.println(res);
		}
	}
	
	public static void bfs() {
		
		Queue<int[]> que = new LinkedList<>();
		boolean[][] visited = new boolean[l][l];
		que.offer(new int[] {X, Y, 0});
		
		int[] dr = {-2, -1, 1, 2, -2, -1, 1, 2};
		int[] dc = {1, 2, 2, 1, -1, -2, -2, -1};

		while(!que.isEmpty()) {
			int[] rc = que.poll();
			
			if(rc[0]==X2 && rc[1]==Y2) {
				res = rc[2];
				break;
			}
			
			for(int d=0; d<8; d++) {
				int nr = rc[0] + dr[d];
				int nc = rc[1] + dc[d];
				
				if(nr>=0 && nr<l && nc>=0 && nc<l && visited[nr][nc]==false) {
					que.offer(new int[] {nr, nc, rc[2]+1});
					visited[nr][nc]=true;
				}
			}
		}
	}
}