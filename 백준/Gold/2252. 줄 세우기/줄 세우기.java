import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		List<Integer>[] list = new ArrayList[N+1];
		for(int i=0; i<N+1; i++) {
			list[i] = new ArrayList<>();
		}
		
		int[] arr = new int[N+1];
		
		for(int i=0; i<M; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			list[A].add(B);
			
			arr[B]++;
		}

		boolean[] visited = new boolean[N+1];
		
		Queue<Integer> que = new LinkedList<>();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<N+1; i++) {
			if(arr[i]==0 && !visited[i]) {
				que.offer(i);
				
				while(!que.isEmpty()) {
					int cur = que.poll();
					visited[cur] = true;
					sb.append(cur).append(" ");
					
					for(int next : list[cur]) {
						arr[next]--;
						if(arr[next]==0) {
							que.offer(next);
						}
					}
				}
			}
		}
		
		System.out.println(sb.toString());
	}
}
