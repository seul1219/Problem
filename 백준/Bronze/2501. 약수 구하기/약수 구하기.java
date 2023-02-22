import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int cnt = 0;
		
		for(int i=1; i<=N; i++) {
			if(N%i == 0) {
				cnt++;
			}
		}
		
		int[] arr = new int[cnt];
		for(int i=1, idx=0; i<=N; i++) {
			if(N%i == 0) {
				arr[idx++] = i;
			}
		}
		
		if(cnt<K) {
			System.out.println("0");
		} else {
			System.out.println(arr[K-1]);
		}
	}
}