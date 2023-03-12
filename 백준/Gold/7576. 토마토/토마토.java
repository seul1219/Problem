import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static int M;
	public static int N;
	public static Queue<int[]> que = new LinkedList<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		M  = sc.nextInt();
		N = sc.nextInt();
		
		int[][] arr = new int[N][M];
		
		//익지 않은 토마토가 있는지 확인
		boolean flag = false;

		for(int r=0; r<N; r++) {
			for(int c=0; c<M; c++) {
				arr[r][c] = sc.nextInt();
				
				//익은 토마토 위치 큐에 넣기
				if(arr[r][c] == 1) {
					que.offer(new int[] {r, c});
				}
				
				//익지 않은 토마토가 있으면 true로 변경
				if(arr[r][c] == 0) {
					flag = true;
				}
			}
		}
		
		//익을 토마토가 없다면 0 출력
		if(flag == false) {
			System.out.println("0");
			return;
		} else if(flag) {
			tomato(arr);
			
			//확인
//			for(int r=0; r<N; r++) {
//				for(int c=0; c<M; c++) {
//					System.out.print(arr[r][c]+" ");
//				}
//				System.out.println();
//			}
			
			int max = 0;
			for(int r=0; r<N; r++) {
				for(int c=0; c<M; c++) {
					if(arr[r][c]==0) {
						//아직 익지 않은 토마토가 있다면 -1 출력
						System.out.println("-1");
						return;
					} else {
						if(max<=arr[r][c]) {
							max=arr[r][c];
						}
					}
				}
			}
			System.out.println(max-1);
		}
	}

	public static void tomato(int[][] arr) {
		int[] dr = {-1, 1, 0, 0};
		int[] dc = {0, 0, -1, 1};
		
		while(!que.isEmpty()) {
			int[] first = que.poll();
			
			for(int d=0; d<4; d++) {
				int nr = first[0] + dr[d];
				int nc = first[1] + dc[d];
				
				if(nr>=0 && nr<N && nc>=0 && nc<M && arr[nr][nc]==0) {
					arr[nr][nc] = arr[first[0]][first[1]]+1;
					que.offer(new int[] {nr, nc});
				}
			}
		}
	}
}