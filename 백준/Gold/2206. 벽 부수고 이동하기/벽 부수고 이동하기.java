import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static StringTokenizer st;
	public static int N;
	public static int M;
	public static int[][] map;
	public static int res;
	public static boolean[][][] visited;
	
	public static void main(String[] args) throws IOException {
		
		//0은 이동 가능
		//이동은 상하좌우
		//시작+끝 포함해서 경로 세기
		//벽을 1개까지 부수고 이동 가능
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		for(int r=0; r<N; r++) {
			String str = br.readLine();
			for(int c=0; c<M; c++) {
				map[r][c] = str.charAt(c) - 48;
			}
		}
		
		visited = new boolean[N][M][2];
		res = Integer.MAX_VALUE;
		
		//0, 0 -> N-1, M-1
		move(0, 0);
		
		if(res != Integer.MAX_VALUE) {
			System.out.println(res);
		} else {
			System.out.println("-1");
		}
	}

	public static void move(int r, int c) {
		Queue<int[]> que = new LinkedList<>();
		//이동좌표/이동거리/벽부순횟수
		visited[r][c][0] = true;
		que.offer(new int[] {r, c, 1, 0});
		
		while(!que.isEmpty()) {
			int[] cur = que.poll();
			int cnt = cur[2];
			int bw = cur[3];
			
			if(cur[0]==N-1 && cur[1]==M-1) {
				res = Math.min(res, cnt);
			}
			
			int[] dr = {-1, 1, 0, 0};
			int[] dc = {0, 0, -1, 1};
			
			for(int d=0; d<4; d++) {
				int nr = cur[0] + dr[d];
				int nc = cur[1] + dc[d];
				
				if(nr>=0 && nr<N && nc>=0 && nc<M) {
					
					//벽이 아닌 경우
					if(map[nr][nc]==0 && !visited[nr][nc][bw]) {
						visited[nr][nc][bw] = true;
						que.offer(new int[] {nr, nc, cnt+1, bw});
					}
					
					//벽을 부수고 이동한 경우
					if(map[nr][nc]==1 && bw==0 && !visited[nr][nc][bw+1]) {
						visited[nr][nc][bw+1] = true;
						que.offer(new int[] {nr, nc, cnt+1, bw+1});
					}
				}
			}
		}
	}
}