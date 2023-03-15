import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		int max = 0;
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
			
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		
		int left = 0;
		int right = max;
		int mid = 0;
		while(left<=right) {
			mid = (left+right)/2;
			
			long sum = 0;
			for(int i=0; i<N; i++) {
				//자르는 높이보다 작은 나무는 가져가지 않는다
				if(arr[i]-mid>0) {
					sum += arr[i]-mid;
				}
			}
			
//			System.out.print(left +":"+ right);
//			System.out.println(" -> " + sum);
			
			//나무 높이의 합이 M보다 작은 경우
			//자르는 높이를 낮춰서 합을 늘려야 함
			if(sum<M) {
				right = mid-1;
			//sum==M를 만족하는 최댓값을 찾기 때문
			} else {
				left = mid+1;
			}
		}
		
		System.out.println(left-1);
	}
}