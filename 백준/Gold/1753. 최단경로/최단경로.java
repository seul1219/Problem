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
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		st = new StringTokenizer(br.readLine());
		int V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		
		int start = Integer.parseInt(br.readLine());
		
		List<int[]>[] list = new ArrayList[V+1];
		for(int i=0; i<V+1; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=0; i<E; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			//[시작점] = {도착점, 가중치};
			list[u].add(new int[] {v, w});
		}
		
		PriorityQueue<int[]> que = new PriorityQueue<>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1] - o2[1];
			}
		});
		
		boolean[] visited = new boolean[V+1];
		int[] distance = new int[V+1];
		for(int i=1; i<V+1; i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		
		//{시작점, 거리};
		que.offer(new int[] {start, 0});
		distance[start] = 0;
		
		while(!que.isEmpty()) {
			int[] cur = que.poll();
			
			if(visited[cur[0]]==false) {
				visited[cur[0]]=true;
				
				for(int[] next : list[cur[0]]) {
					if(distance[next[0]] > distance[cur[0]] + next[1]) {
						distance[next[0]] = distance[cur[0]] + next[1];
					}
					que.offer(new int[] {next[0], distance[next[0]]});
				}
			}
		}

		for(int i=1; i<V+1; i++) {
			if(distance[i] == Integer.MAX_VALUE) {
				System.out.println("INF");
			} else {
				System.out.println(distance[i]);
			}
		}
	}
}