import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static int N;
	public static int M;
	public static int[][] arr;
	public static int res = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[N][M];
		
		for(int r=0; r<N; r++) {
			for(int c=0; c<M; c++) {
				arr[r][c] = sc.nextInt();
			}
		}
		
		dfs(0);
		
		System.out.println(res);
	}
	
	//벽 세우기
	public static void dfs(int cnt) {
		
		//세 곳에 벽 세우기
		if(cnt==3) {
			//바이러스 퍼뜨리기
			bfs();
			
			//전단계로 돌아가기
			return;
		} else {
			for(int r=0; r<N; r++) {
				for(int c=0; c<M; c++) {
					if(arr[r][c]==0) {
						arr[r][c] = 1;
						dfs(cnt+1);
						arr[r][c] = 0;
					}
				}
			}
		}
	}
	
	//바이러스
	public static void bfs() {
		Queue<int[]> que = new LinkedList<>();
		
		//원래 배열 복사
		int[][] arr2 = new int[N][M];
		for(int r=0; r<N; r++) {
			for(int c=0; c<M; c++) {
				arr2[r][c] = arr[r][c];
				
				//바이러스 위치 큐에 넣기
				if(arr[r][c]==2) {
					que.offer(new int[] {r, c});
				}
			}
		}
		
		//상하좌우
		int[] dr = {-1, 1, 0, 0};
		int[] dc = {0, 0, -1, 1};
		
		while(!que.isEmpty()) {
			
			//바이러스 위치 큐에서 빼내기
			int[] rc = que.poll();
			
			//상하좌우 탐색
			for(int d=0; d<4; d++) {
				int nr = rc[0] + dr[d];
				int nc = rc[1] + dc[d];
				
				//바이러스 퍼뜨리기
				if(nr>=0 && nr<N && nc>=0 && nc<M && arr2[nr][nc]==0) {
					que.offer(new int[] {nr, nc});
					arr2[nr][nc] = 2;
				}
			}
		}
		
		//바이러스 퍼뜨린 후 안전영역의 최댓값 찾기
		safe(arr2);
	}
	
	//안전영역 수
	public static void safe(int[][] arr2) {
		int max = 0;
		
		for(int r=0; r<N; r++) {
			for(int c=0; c<M; c++) {
				if(arr2[r][c]==0) {
					max++;
				}
			}
		}
		
		res = Math.max(res, max);
	}
}