import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[N+1][N+1];
		
		boolean[] visited = new boolean[N+1];
		
		int cnt = 0;
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			arr[num1][num2] = 1;
			arr[num2][num1] = 1;
		}

		Stack<Integer> st = new Stack<>();
		
		for(int i=1; i<N+1; i++) {
			
			if(!visited[i]) {
				st.push(i);
				cnt++;
			}
			
			while(!st.isEmpty()) {
				int num = st.pop();
				
				if(!visited[num]) {
					visited[num] = true;
					
					for(int j=1; j<N+1; j++) {
						if(arr[num][j]==1 && !visited[j]) {
							st.push(j);
						}
					}
				}
			}
		}
		
		System.out.println(cnt);
	}
}