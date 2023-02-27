import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();
		
		int[] arr = new int[N];

		arr[0] = 1;
		int idx = 0;
		
		int cnt = 0;
		while(arr[idx]!=M && idx>=0 && idx<N) {
			
			if(arr[idx]%2!=0) {
				idx = idx + L;
				
				if(idx>=N) {
					idx = idx%N;
				}
			} else {
				idx = idx - L;
				
				if(idx<0) {
					idx = N + idx;
				}
			}
			
			arr[idx]++;
			cnt++;
		}
		
		System.out.println(cnt);
	}
}