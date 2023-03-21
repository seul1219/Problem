import java.util.Scanner;

public class Main {
	
	public static int N;
	public static int[] arr;
	public static int M;
	public static int[] res;
	public static boolean[] flag;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		arr = new int[N];
		for(int i=1; i<=N; i++) {
			arr[i-1] = i;
		}
		flag = new boolean[N];
		
		M = sc.nextInt();
		res = new int[M];
		
		dfs(0);
		
		System.out.println(sb.toString());
	}
	
	public static void dfs(int cnt) {
		
		if(cnt==M) {
			for(int i=0; i<M; i++) {
				sb.append(res[i]).append(" ");
			}
			sb.append("\n");
			
			return;
		}
		else {
			for(int i=0; i<N; i++) {
				if(flag[i]==false) {
					flag[i] = true;
					res[cnt] = arr[i];
					dfs(cnt+1);
					flag[i] = false;
				}
			}
		}
	}
}