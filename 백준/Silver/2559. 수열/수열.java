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
		
		int left = 0;
		int right = left+K;
		int max = Integer.MIN_VALUE;

		while(left<=arr.length-K && right<=arr.length) {
			int sum = 0;
			
			for(int i=left; i<right; i++) {
				sum += arr[i];
			}

			max = Math.max(sum, max);
			
			left++;
			right++;
		}
		System.out.println(max);
	}
}