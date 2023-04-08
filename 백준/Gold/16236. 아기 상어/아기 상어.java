import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static int N;
	public static int[][] sea;
	public static int[] dr = {-1, 1, 0, 0};
	public static int[] dc = {0, 0, -1, 1};
	public static int[] cur;
	public static int res;
	public static int cnt;
	public static boolean flag;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//공간의 크기
		N = Integer.parseInt(br.readLine());
		
		//공간의 상태
		sea = new int[N][N];
	
		//상어의 시작 위치
		cur = new int[2];
		//상어의 크기
		int size = 2;
		//상어의 시간
		res = 0;
		//상어가 먹은 물고기 수
		cnt = 0;
		
		StringTokenizer st;
		for(int r=0; r<N; r++) {
			st = new StringTokenizer(br.readLine());
			for(int c=0; c<N; c++) {
				sea[r][c] = Integer.parseInt(st.nextToken());
				
				if(sea[r][c]==9) {
					cur[0] = r;
					cur[1] = c;
					sea[cur[0]][cur[1]] = 0;
				}
			}
		}
		
		while(true) {
			
			flag = false;
			
			go(cur, size);
			
			//먹은 물고기 개수가 현재 상어 크기와 같으면
			if(cnt==size) {
				cnt = 0;
				size++;
			}
			
			if(!flag) {
				break;
			}
		}
		
		System.out.println(res);
	}
	
	public static void go(int[] arr, int num) {
		PriorityQueue<int[]> que = new PriorityQueue<>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[2]!=o2[2] ? o1[2]-o2[2]
						: ( o1[0]!=o2[0] ? o1[0]-o2[0]
								: o1[1]-o2[1] );
			}
		});
		boolean[][] visited = new boolean[N][N];
		
		visited[arr[0]][arr[1]] = true;
		que.offer(new int[] {arr[0], arr[1], 0});
		
		while(!que.isEmpty()) {
			int[] cur2 = que.poll();
			
			//물고기면
			if(sea[cur2[0]][cur2[1]]!=0 && sea[cur2[0]][cur2[1]]<num) {
				//먹은 후에는 빈칸이 된다
				sea[cur2[0]][cur2[1]] = 0;
				//그곳으로 이동하기
				cur[0] = cur2[0];
				cur[1] = cur2[1];
				//먹기까지 걸린 시간
				res += cur2[2];
				//먹은 물고기 개수 추가
				cnt++;
				flag = true;
				break;
			}
			
			for(int d=0; d<4; d++) {
				int nr = cur2[0] + dr[d];
				int nc = cur2[1] + dc[d];
				
				if(nr>=0 && nr<N && nc>=0 && nc<N) {
					if(!visited[nr][nc] && sea[nr][nc]<=num) {
						visited[nr][nc] = true;
						que.offer(new int[] {nr, nc, cur2[2]+1});
					}
				}
			}
		}
	}
}