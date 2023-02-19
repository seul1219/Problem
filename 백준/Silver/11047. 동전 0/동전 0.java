import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int res = 0;

		for(int i=arr.length-1; i>=0; i--) {
			if(K>=arr[i]) {
				int cnt = K/arr[i];
				K -= cnt * arr[i];
				
				res += cnt;
			}
		}
		
		System.out.println(res);
	}
}