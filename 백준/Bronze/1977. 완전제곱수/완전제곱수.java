import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[] arr = new int[101];
		int i=1;
		while(i*i<=10000) {
			arr[i] = i*i;
			i++;
		}
//		System.out.println(Arrays.toString(arr));
		
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(int j=0; j<arr.length; j++) {
			if(arr[j]>=M && arr[j]<=N) {
				sum += arr[j];
				min = Math.min(min, arr[j]);
			}
		}
		
		if(sum>0) {
			System.out.println(sum);
			System.out.println(min);
		} else if(sum==0) {
			System.out.println(-1);
		}
	}
}