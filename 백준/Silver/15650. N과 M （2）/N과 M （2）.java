import java.util.Scanner;

public class Main {
	
	public static int N;
	public static int M;
	public static String[] arr;
	public static String[] sel;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new String[N];
		for(int i=0; i<N; i++) {
			arr[i] = String.valueOf(i+1);
		}
		
		sel = new String[M];
		
		NM(0, 0);
		
		System.out.println(sb.toString());
		
	}
	
	public static void NM(int idx, int selidx) {
	
		if(selidx==M) {
			for(int i=0; i<M; i++) {
				sb.append(sel[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=idx; i<=N-M+selidx; i++) {
			sel[selidx] = arr[i];
			NM(i+1, selidx+1);
		}
	}
}