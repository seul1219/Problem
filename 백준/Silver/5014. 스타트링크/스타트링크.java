import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int F = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int G = Integer.parseInt(st.nextToken());
		int U = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		boolean[] visited = new boolean[1000001];
		int cnt = 0;
		int res = 0;
		
		Queue<int[]> que = new LinkedList<int[]>();
		que.offer(new int[] {S, cnt});
		visited[S] = true;
		boolean flag = false;
		
		while(!que.isEmpty()) {
			int[] cur = que.poll();
			
			if(cur[0]==G) {
				flag = true;
				res = cur[1];
				break;
//				res = Math.min(res, cur[1]);
			}
			
			if(cur[0]+U>=1 && cur[0]+U<=F && !visited[cur[0]+U]) {
				visited[cur[0]+U] = true;
				que.offer(new int[] {cur[0]+U, cur[1]+1});
			}
			if(cur[0]-D>=1 && cur[0]-D<=F && !visited[cur[0]-D]) {
				visited[cur[0]-D] = true;
				que.offer(new int[] {cur[0]-D, cur[1]+1});
			}
		}
		
//		if(res == Integer.MAX_VALUE) {
//			System.out.println("use the stairs");
//		} else {
//			System.out.println(res);
//		}
		
		if(flag) {
			System.out.println(res);
		} else {
			System.out.println("use the stairs");
		}
	}
}