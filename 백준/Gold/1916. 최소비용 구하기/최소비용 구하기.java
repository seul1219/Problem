import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	public static StringTokenizer st;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		List<int[]>[] list = new ArrayList[N+1];
		for(int i=0; i<N+1; i++) {
			list[i] = new ArrayList<int[]>();
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			list[s].add(new int[] {e, w});
		}
		
		st = new StringTokenizer(br.readLine());
		//출발점
		int start = Integer.parseInt(st.nextToken());
		//도착점
		int end = Integer.parseInt(st.nextToken());
		
		int[] cost = new int[N+1];
		for(int i=1; i<N+1; i++) {
			cost[i] = Integer.MAX_VALUE;
		}
		cost[start] = 0;
		
		boolean[] visited = new boolean[N+1];
		
		PriorityQueue<int[]> que = new PriorityQueue<>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1] - o2[1];
			}
		});
		
		//시작점, 비용
		que.offer(new int[] {start, 0});
		
		while(!que.isEmpty()) {
			int[] cur = que.poll();
			
			if(!visited[cur[0]]) {
				visited[cur[0]] = true;
				
				for(int[] next : list[cur[0]]) {
					if(cost[next[0]] > cost[cur[0]] + next[1]) {
						cost[next[0]] = cost[cur[0]] + next[1];
					}
					que.offer(new int[] {next[0], cost[next[0]]});
				}
			}
		}
		
		System.out.println(cost[end]);
	}
}