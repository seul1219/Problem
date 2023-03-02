import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int M;
	static int[][] arr;
	static boolean[][] visited;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		for(int r=0; r<N; r++) {
			String s = br.readLine();
			for(int c=0; c<M; c++) {
				arr[r][c] = s.charAt(c)-'0';
			}
		}
//		System.out.println(Arrays.deepToString(arr));
		
		//방문 여부 저장할 배열
		visited = new boolean[N][M];
		//처음 시작하는 좌표
		visited[0][0] = true;
		
		//시작 위치 넣고 시작
		search(0, 0);
		
		//도착 위치에 저장된 지금까지 지내온 칸 수
		System.out.println(arr[N-1][M-1]);
	}
	
	public static void search(int r, int c) {
		Queue<int[]> que = new LinkedList<>();
		
		//매개변수 값 넣고 시작
		que.offer(new int[] {r, c});
//		System.out.println(Arrays.toString(que.poll()));
		
		//탐색 위치
		int[] dr = {1, 0, -1, 0};
		int[] dc = {0, 1, 0, -1};
		
		while(!que.isEmpty()) {
			//넣은 값 다시 빼내서 저장
			int[] rc = que.poll();
			
			//새로운 좌표 탐색
			for(int i=0; i<4; i++) {
				int nr = rc[0] + dr[i];
				int nc = rc[1] + dc[i];
				
				//범위에 맞으면
				if(nr>=0 && nr<N && nc>=0 && nc<M && visited[nr][nc]==false && arr[nr][nc]==1) {
					//새로운 좌표 넣고
					que.add(new int[] {nr, nc});
					//방문 여부 표시
					visited[nr][nc] = true;
					
					//현재 좌표를 지나갔으므로 1 추가
					arr[nr][nc] = arr[rc[0]][rc[1]]+1;
				}
			}//for
		}//while
	}
}