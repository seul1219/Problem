import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
	
		List<Integer>[] list = new ArrayList[N+1];
		for(int i=0; i<N+1; i++) {
			list[i] = new ArrayList<>();
		}

		//단방향
		for(int i=0; i<M; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st2.nextToken());
			int B = Integer.parseInt(st2.nextToken());
			list[A].add(B);
		}

		boolean[] visited = new boolean[N+1];
		Queue<int[]> que = new LinkedList<>();
		List<Integer> res = new ArrayList<>();
		//출발도시
		visited[X] = true;
		que.offer(new int[] {X, 0});
		boolean flag = false;
		while(!que.isEmpty()) {
			int[] cur = que.poll();
			
			if(cur[1]==K) {
				//하나라도 있으면
				flag = true;
				res.add(cur[0]);
			}
			
			for(int next : list[cur[0]]) {
				if(!visited[next]) {
					visited[next] = true;
					que.offer(new int[] {next, cur[1]+1});
				}
			}
		}
		
		if(flag) {
			//오름차순으로 정렬
			Collections.sort(res);
			for(int r : res) {
				System.out.println(r);
			}
		} else {
			System.out.println("-1");
		}
	}
}
