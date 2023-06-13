import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N+1][N+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int p1 = Integer.parseInt(st.nextToken());
		int p2 = Integer.parseInt(st.nextToken());
		
		int C = Integer.parseInt(br.readLine());
		for(int i=0; i<C; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int t1 = Integer.parseInt(st2.nextToken());
			int t2 = Integer.parseInt(st2.nextToken());
			
			arr[t1][t2] = 1;
			arr[t2][t1] = 1;
		}
		
		boolean[] visited = new boolean[N+1];
		Queue<int[]> que = new LinkedList<>();
		visited[p1] = true;
		que.offer(new int[] {p1, 0});
	
		boolean flag = false;
		int res = 0;
		while(!que.isEmpty()) {
			int[] cur = que.poll();

			if(cur[0]==p2) {
				flag = true;
				res = cur[1];
				break;
			} else {
				
				for(int i=0; i<=N; i++) {
					if(!visited[i] && arr[cur[0]][i]==1 && arr[i][cur[0]]==1) {
						visited[i] = true;
						que.offer(new int[] {i, cur[1]+1});
					}
				}
			}
		}
		
		if(flag) {
			System.out.println(res);
		} else {
			System.out.println("-1");
		}
	}
}