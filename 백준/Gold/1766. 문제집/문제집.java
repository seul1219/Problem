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
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		List<Integer>[] list = new ArrayList[N+1];
		for(int i=0; i<N+1; i++) {
			list[i] = new ArrayList<>();
		}

		int[] arr = new int[N+1];
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			list[A].add(B);
			
			arr[B]++;
		}
		
		boolean[] visited = new boolean[N+1];
		
		PriorityQueue<Integer> que = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});

		for(int i=1; i<N+1; i++) {
			if(!visited[i] && arr[i]==0) {
				que.offer(i);
				
				while(!que.isEmpty()) {
					int cur = que.poll();
					visited[cur] = true;
					System.out.print(cur + " ");
					
					for(int next : list[cur]) {
						arr[next]--;
						if(arr[next]==0) {
							que.offer(next);
						}
					}
				}
			}
		}
	}
}