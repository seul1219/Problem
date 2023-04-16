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
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=0; tc<T; tc++) {
			st = new StringTokenizer(br.readLine());
			
			//컴퓨터의 개수
			int N = Integer.parseInt(st.nextToken());
			//의존성 개수
			int D = Integer.parseInt(st.nextToken());
			//처음 해킹당한 컴퓨터 번호
			int C = Integer.parseInt(st.nextToken());
			
			List<int[]>[] list = new ArrayList[N+1];
			for(int i=0; i<N+1; i++) {
				list[i] = new ArrayList<>();
			}
			
			for(int i=0; i<D; i++) {
				st = new StringTokenizer(br.readLine());
				
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				int S = Integer.parseInt(st.nextToken());
				
				//B가 감염되면 A가 s초 후에 감염됨
				list[B].add(new int[] {A, S});
			}
			
			boolean[] visited = new boolean[N+1];
			
			//감염되는 컴퓨터의 수
			int cnt = 0;
			
			//마지막 컴퓨터까지 감염되기까지 걸리는 시간
			int max = 0;
			
			int[] distance = new int[N+1];
			Arrays.fill(distance, Integer.MAX_VALUE);
		
			distance[C] = 0;
			
			PriorityQueue<int[]> que = new PriorityQueue<>(new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[1]-o2[1];
				}
			});
			
			que.offer(new int[] {C, 0});
			
			int idx = 0;
			while(!que.isEmpty()) {
				int[] cur = que.poll();
				
				if(!visited[cur[0]]) {
					visited[cur[0]] = true;
					cnt++;
					idx = cur[0];
					
					for(int[] next :  list[cur[0]]) {
						if(distance[next[0]] > distance[cur[0]]+next[1]) {
							distance[next[0]] = distance[cur[0]]+next[1];
						}
						que.offer(new int[] {next[0], distance[next[0]]});
					}
				}
			}
			System.out.println(cnt + " " + distance[idx]);
		}//T
	}
}