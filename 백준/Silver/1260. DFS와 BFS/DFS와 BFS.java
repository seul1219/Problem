import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static StringBuilder sb = new StringBuilder();
	public static StringBuilder sb2 = new StringBuilder();
	public static int N;
	public static int M;
	public static int V;
	public static int[][] arr;
	public static boolean[] visited;
	public static boolean[] visited2;
	public static int idx;
	public static int idx2;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		arr = new int[N+1][N+1];
		for(int i=0; i<M; i++) {
			String str2 = br.readLine();
			StringTokenizer st2 = new StringTokenizer(str2, " ");
			
			int num = Integer.parseInt(st2.nextToken());
			int num2 = Integer.parseInt(st2.nextToken());
			
			arr[num][num2] = 1;
			arr[num2][num] = 1;
		}
		
		visited = new boolean[N+1];
		idx = V;
		dfs();
		
		System.out.println(sb.toString());
		
		visited2 = new boolean[N+1];
		idx2 = V;
		bfs();
		
		System.out.println(sb2.toString());
	}
	
	public static void dfs() {
		Stack<Integer> stk = new Stack<>();
		stk.push(idx);
		
		while(!stk.isEmpty()) {
			int num = stk.pop();
			if(visited[num]==false) {
				visited[num] = true;
				sb.append(num).append(" ");
			}
			
			for(int r=N; r>=0; r--) {
				if(arr[num][r]==1 && visited[r]==false) {
					stk.push(r);
				}
			}
		}
	}
	
	public static void bfs() {
		Queue<Integer> que = new LinkedList<>();
		que.offer(idx2);
		
		while(!que.isEmpty()) {
			int num = que.poll();
			visited2[num]=true;
			sb2.append(num).append(" ");
			
			for(int r=1; r<=N; r++) {
				if(arr[num][r]==1 && visited2[r]==false) {
					visited2[r] = true;
					que.offer(r);
				}
			}
		}
	}
}