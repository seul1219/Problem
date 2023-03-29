import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static StringTokenizer st;
	public static int M;
	public static int N;
	public static int H;
	public static int[][][] tomato;
	public static int day;
	public static Queue<int[]> que = new LinkedList<>();
//	public static boolean[][][] visited;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		
		int all = M*N*H;
		int cnt = 0;

		day = 0;
		tomato = new int[H][N][M];
		for(int k=0; k<H; k++) {
			for(int i=0; i<N; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int j=0; j<M; j++) {
					tomato[k][i][j] = Integer.parseInt(st.nextToken());
					
					//익은 토마토 개수 체크
					if(tomato[k][i][j] == 1) {
						cnt++;
					}
				}
			}
		}
		
//		for(int k=0; k<H; k++) {
//			for(int i=0; i<N; i++) {
//				for(int j=0; j<M; j++) {
//					System.out.print(tomato[k][i][j] + " ");
//				}
//				System.out.println();
//			}
//		}
		
		StringBuilder sb = new StringBuilder();
//		visited  = new boolean[H][N][M];
		boolean flag = false;
		
		//모든 토마토가 익어있는 상태
		if(cnt==all) {
			sb.append("0");
	
		//아니면
		} else {
			
			for(int k=0; k<H; k++) {
				for(int i=0; i<N; i++) {
					for(int j=0; j<M; j++) {
						//익은 토마토 찾아서
						if(tomato[k][i][j]==1) {
							que.offer(new int[] {k, i, j});
						}
					}
				}
			}
			
			//bfs 퍼뜨리기
			bfs();
			
			for(int k=0; k<H; k++) {
				for(int i=0; i<N; i++) {
					for(int j=0; j<M; j++) {
						//퍼뜨렸는데 모두 익지 못하면
						if(tomato[k][i][j]==0) {
							flag = true;
						
						//아니면 날짜수 체크
						} else {
							day = Math.max(day, tomato[k][i][j]);
						}
//						System.out.print(tomato[k][i][j] + " ");
					}
//					System.out.println();
				}
			}
			
			if(flag) {
				sb.append("-1");
			} else {
				sb.append(day-1);
			}
		}
		
		System.out.println(sb.toString());
	}
	
	public static void bfs() {
		int[] dr = {-1, 1, 0, 0, 0, 0};
		int[] dc = {0, 0, -1, 1, 0, 0};
		int[] dh = {0, 0, 0, 0, 1, -1};
		
		while(!que.isEmpty()) {
			int[] cur = que.poll();
			
//			if(!visited[cur[0]][cur[1]][cur[2]]) {
//				visited[cur[0]][cur[1]][cur[2]]=true;
				
			 for(int i=0; i<6; i++) {
				 int nr = cur[1] + dr[i]; 
				 int nc = cur[2] + dc[i]; 
				 int nh = cur[0] + dh[i];
				 
				 if(nr>=0 && nr<N && nc>=0 && nc<M && nh>=0 && nh<H) {
					 if(tomato[nh][nr][nc]==0) {
						 tomato[nh][nr][nc] = tomato[cur[0]][cur[1]][cur[2]]+1;
						 que.offer(new int[] {nh, nr, nc});
					 }
				 }
			 }
		}
	}
}