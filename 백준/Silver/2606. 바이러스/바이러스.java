import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static int N;
	public static int M;
	public static int[][] arr;
	public static boolean[] visited;
	public static int cnt;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N+1][N+1];
		visited = new boolean[N+1];
		
		M = Integer.parseInt(br.readLine());
		
		for(int i=0; i<M; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			int num =  Integer.parseInt(st.nextToken());
			int num2 =  Integer.parseInt(st.nextToken());
			
			arr[num][num2] = 1;
			arr[num2][num] = 1;
		}
		
		dfs();
		
		System.out.println(cnt);
	}
	
	public static void dfs() {
		Stack<Integer> st = new Stack<>();
		st.push(1);
		
		while(!st.isEmpty()) {
			int num = st.pop();
			
			if(visited[num]==false) {
				visited[num]=true;
				
				if(num!=1) {
					cnt++;
				}
			}
			
			for(int i=1; i<=N; i++) {
				if(arr[num][i]==1&&visited[i]==false) {
					st.push(i);
				}
			}
		}
	}
}