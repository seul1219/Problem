import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		int idx = 0;
		while(idx<arr.length && sum<=100) {
			sum+=arr[idx];
			idx++;
		}
		
		int sum2 = 0;
		for (int i=0; i<idx-1; i++) {
		    sum2 += arr[i];
		}
		
		int res = 0;
		if(Math.abs(100-sum) == Math.abs(100-sum2)) {
			res = sum;
		} else {
			res = Math.abs(100-sum) > Math.abs(100-sum2) ? sum2 : sum;
		}
		
		System.out.println(res);
	}
}