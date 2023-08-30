import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
  
public class Main {  

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		List<Integer>[] adjList = new ArrayList[N+1];
		for(int i=0; i<N+1; i++) {
			adjList[i] = new ArrayList<>();
		}
		
		for(int i=1; i<=N; i++) {
			int num = Integer.parseInt(br.readLine());
			
			adjList[i].add(num);
		}
		
		int[] cArr = new int[N+1];
		for(int i=1; i<=N; i++) {
			Queue<int[]> que = new LinkedList<>();
			boolean[] visited = new boolean[N+1];
			int cnt = 0;
			visited[i] = true;
			que.offer(new int[] {i, cnt});
			
			while(!que.isEmpty()) {
				int[] cur = que.poll();
				cnt = cur[1];
				
				for(int next : adjList[cur[0]]) {
					if(!visited[next]) {
						visited[next] = true;
						que.offer(new int[] {next, cur[1]+1});
					}
				}
			}
			
			cArr[i] = cnt;
		}
		
		int max = 0;
		int idx = 0;
		for(int i=1; i<=N; i++) {
			if(max<cArr[i]) {
				max = cArr[i];
				idx = i;
			}
		}
		
		System.out.println(idx);
	}
}
