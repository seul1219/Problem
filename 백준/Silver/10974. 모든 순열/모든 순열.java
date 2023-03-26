import java.util.Scanner;

public class Main {
	
	public static int N;
	public static int[] arr;
	public static int[] arr2;
	public static boolean[] visited;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		arr = new int[N];
		arr2 = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = i+1;
		}
		visited = new boolean[N];
		
		p(0);
		
		System.out.println(sb.toString());
	}
	
	public static void p(int idx) {
		
		if(idx==N) {
			for(int i=0; i<N; i++) {
				sb.append(arr2[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=0; i<N; i++) {
			if(visited[i]==false) {
				visited[i] = true;
				arr2[idx] = arr[i];
				p(idx+1);
				visited[i] = false;
			}
		}
	}
}