import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		//커지는 경우
		int i = 0;
		int cnt = 0;
		int res = 0;
		while(i<=arr.length-2) {
			if(arr[i]<=arr[i+1]) {
				cnt++;
				res = Math.max(res, cnt);
			} else if(arr[i]>arr[i+1]) {
				cnt = 0;
			}
			i++;
		}
		
		//작아지는 경우
		int j = 0;
		int cnt2 = 0;
		int res2 = 0;
		while(j<=arr.length-2) {
			if(arr[j]>=arr[j+1]) {
				cnt2++;
				res2 = Math.max(res2, cnt2);
			} else if(arr[j]<arr[j+1]) {
				cnt2 = 0;
			}
			j++;
		}
		
		int max = 0;
		max = Math.max(res, res2);
		System.out.println(max+1);
	}
}