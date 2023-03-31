import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	public static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		List<int[]>[] list = new ArrayList[D+1];
		
		for(int i=0; i<D+1; i++) {
			list[i] = new ArrayList<>();
			
			if(i!=D)
			list[i].add(new int[] {i+1, 1});
		}
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			if(e>D) continue;
			list[s].add(new int[] {e, w});
		}
		
		int[] distance = new int[D+1];
		Arrays.fill(distance, Integer.MAX_VALUE);
		
		int start = 0;
		distance[start] = 0;
		
		PriorityQueue<int[]> que = new PriorityQueue<>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1] - o2[1];
			}
		});
		
		que.offer(new int[] {start, 0});
		
		while(!que.isEmpty()) {
			int[] cur = que.poll();
			
			for(int[] next : list[cur[0]]) {
				if(distance[next[0]] > distance[cur[0]] + next[1]) {
					distance[next[0]] = distance[cur[0]] + next[1];
				}
				que.offer(new int[] {next[0], distance[next[0]]});
			}
		}
		
		System.out.println(distance[D]);
	}
}