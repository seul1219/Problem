import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static StringTokenizer st;
	public static int N;
	public static int M;
	public static int G;
	public static int[][] map;
	public static int sr;
	public static int sc;
	public static int[][] start;
	public static int[][] end;
	public static int[] dr = {-1, 1, 0, 0};
	public static int[] dc = {0, 0, -1, 1};
	public static int idx;	
	public static int[] gas;
	public static int res;
	public static boolean[] visit;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		st = new StringTokenizer(br.readLine());
		//백준의 활동 영역
		N = Integer.parseInt(st.nextToken());
		//M명의 승객
		M = Integer.parseInt(st.nextToken());
		//초기 연료의 양
		G = Integer.parseInt(st.nextToken());

		//0은 빈칸, 1은 벽
		map = new int[N+1][N+1];
		for(int r=1; r<N+1; r++) {
			st = new StringTokenizer(br.readLine());
			for(int c=1; c<N+1; c++) {
				map[r][c] = Integer.parseInt(st.nextToken());			
			}
		}
		
		//운전을 시작하는 칸의 행, 열 번호
		st = new StringTokenizer(br.readLine());
		sr = Integer.parseInt(st.nextToken());
		sc = Integer.parseInt(st.nextToken());
		
		//각 승객의 출발지의 행, 열
		start = new int[M][2];
		//각 승객의 도착지의 행, 열
		end = new int[M][2];
		visit = new boolean[M];
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			start[i][0] = Integer.parseInt(st.nextToken());
			start[i][1] = Integer.parseInt(st.nextToken());

			end[i][0] = Integer.parseInt(st.nextToken());
			end[i][1] = Integer.parseInt(st.nextToken());
		}
		
		//각 승객마다 목적지로 이동하고 난 후 연료 양 저장
		gas = new int[M];
		
		int cnt = 0;
		while(true) {
			
			//모든 승객 이동 마치면
			if(cnt==M) {
				break;
			}
			
			idx = 0;
			
			//승객 선택
			select();
			
			//택시가 승객 출발지에 도착했는데 연료가 있는 경우
			if(!(gas[idx]==Integer.MIN_VALUE)) {
				//목적지로 이동
				go();
			}
			
			cnt++;
		}
		
		boolean flag = false;
		for(int i=0; i<M; i++) {
			if(gas[i]==Integer.MIN_VALUE) {
				flag = true;
			}
		}
		
		//하나의 승객이라도 이동 못 시킨 경우
		if(flag) {
			System.out.println(-1);
		} else {
			System.out.println(gas[idx]);
		}
	}
	
	//일단 먼저 승객 선택해야 함
	//현재 위치에서 가장 가까운 승객 고르기
	//여러 명이면 그중에서 행, 열이 가장 작은 승객
	public static void select() {
		//행, 열, 이동거리
		PriorityQueue<int[]> que = new PriorityQueue<>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[2]!=o2[2] ? o1[2]-o2[2] 
						: (o1[0]!=o2[0] ? o1[0]-o2[0] 
								: o1[1]-o2[1]);
			}
		});
		
		boolean[][] visited = new boolean[N+1][N+1];
		
		visited[sr][sc] = true;
		que.offer(new int[] {sr, sc, 0});
		boolean flag2 = false;
		
		outer: while(!que.isEmpty()) {
			int[] cur = que.poll();
			
			//가장 가까운 승객의 위치에 도달한 경우
			for(int i=0; i<M; i++) {
				if(cur[0]==start[i][0] && cur[1]==start[i][1] && !visit[i]) {
					flag2 = true;
					//택시의 위치를 출발지로 바꾸고
					sr = start[i][0];
					sc = start[i][1];
					//몇 번 승객인지 저장해야 해당 승객의 목적지 정보를 알 수 있다
					idx = i;
					visit[idx] = true;
					//이동 거리만큼 연료 소모됨
					G = G-cur[2];
					
					//만약 출발지에 도착했는데 연료가 바닥나면 
					if(G<=0) {
						gas[idx] = Integer.MIN_VALUE;
					}
						
					break outer;
				}
			}
			
			for(int d=0; d<4; d++) {
				int nr = cur[0] + dr[d];
				int nc = cur[1] + dc[d];
			
				if(nr<1 || nr>N || nc<1 || nc>N || visited[nr][nc] || map[nr][nc]==1)
					continue;
				
				visited[nr][nc] = true;
				que.offer(new int[] {nr, nc, cur[2]+1});
			}
		}
		
		//승객을 태우러 갈 수 없는 경우
		if(!flag2) {
			gas[idx] = Integer.MIN_VALUE;
		}
	}//select
	
	//승객의 목적지로 이동
	public static void go() {
		//행, 열, 이동거리
		Queue<int[]> que = new LinkedList<int[]>();
		
		boolean[][] visited = new boolean[N+1][N+1];
		
		visited[sr][sc] = true;
		que.offer(new int[] {sr, sc, 0});
		boolean flag2 = false;
		
		while(!que.isEmpty()) {
			int[] cur = que.poll();
			
			//목적지에 도착한 경우
			if(cur[0]==end[idx][0] && cur[1]==end[idx][1]) {
				flag2 = true;
				//택시의 위치를 목적지로 바꾸고
				sr = end[idx][0];
				sc = end[idx][1];
				//이동 거리만큼 연료 소모됨
				G = G-cur[2];
				
				//만약 목적지에 도착했는데 연료가 0이상으로 있으면
				//도착과 동시에 연료가 바닥나는 건 괜찮
				if(G>=0) {
					//목적지에 도착하면 승객을 이동하면서 소모한 양*2 충전
					G = G + cur[2]*2;
					gas[idx] = G;
				//이동 중 연료가 바닥나면 실패
				} else {
					G = Integer.MIN_VALUE;
					gas[idx] = G;
				}
				
				break;
			}
			
			for(int d=0; d<4; d++) {
				int nr = cur[0] + dr[d];
				int nc = cur[1] + dc[d];
			
				if(nr<1 || nr>N || nc<1 || nc>N || visited[nr][nc] || map[nr][nc]==1)
					continue;
				
				visited[nr][nc] = true;
				que.offer(new int[] {nr, nc, cur[2]+1});
			}
		}
		
		//더 이상 이동할 수 없는 경우
		if(!flag2) {
			gas[idx] = Integer.MIN_VALUE;
		}
	}//go
}