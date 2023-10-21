import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static int N;
	public static int M;
	public static int R;
	public static ArrayList<Integer>[] list;
	public static int[] res;
	public static int cnt;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[N+1];
		for(int i=0; i<N+1; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<M; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st2.nextToken());
			int B = Integer.parseInt(st2.nextToken());
			
			list[A].add(B);
			list[B].add(A);
		}
		
		for(int i=0; i<N+1; i++) {
			Collections.sort(list[i]);
		}
		
		boolean[] visited = new boolean[N+1];
		res = new int[N+1];
		visited[R] = true;
		cnt = 1;
		dfs(R, visited);

		StringBuilder sb = new StringBuilder();
		for(int i=1; i<N+1; i++) {
			sb.append(res[i]).append("\n");
		}
		
		System.out.println(sb.toString());
	}

	private static void dfs(int r, boolean[] visited) {
		res[r] = cnt;
		
		for(int i=0; i<list[r].size(); i++) {
			int next = list[r].get(i);
			if(!visited[next]) {
				visited[next] = true;
				cnt++;
				dfs(next, visited);
			}
		}
	}
}