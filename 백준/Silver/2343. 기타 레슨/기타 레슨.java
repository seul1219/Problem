import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		
		int max = 0;
		int sum = 0;
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
			
			sum += arr[i];
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		
		int res = 0;
		while(max<=sum) {
			int mid = (max+sum)/2;
			
			int sum2 = 0;
			int cnt = 1;
			for(int i=0; i<N; i++) {
				if(sum2 + arr[i]>mid) {
					cnt++;
					sum2=0;
				}
				sum2+=arr[i];
			}
			
			if(cnt<=M) {
				res = mid;
				sum = mid-1;
			} else if(cnt>=M) {
				max = mid+1;
			}
		}
		
		System.out.println(res);
	}
}