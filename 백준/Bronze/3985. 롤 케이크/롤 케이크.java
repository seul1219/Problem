import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int N = sc.nextInt();
		int[] cake = new int[L+1];
		
		int max = Integer.MIN_VALUE;
		int idx = 0;
		int[][] arr = new int[N][2];
		for(int r=0; r<N; r++) {
			arr[r][0] = sc.nextInt();
			arr[r][1] = sc.nextInt();
		}
		
		for(int r=N-1; r>=0; r--) {
			max = Math.max(max,arr[r][1]-arr[r][0]+1);
			if(max==arr[r][1]-arr[r][0]+1) {
				idx = r+1;
			}
		}
		System.out.println(idx);
		
		for(int r=0; r<N; r++) {
			for(int c=arr[r][0]; c<=arr[r][1]; c++) {
				if(cake[c]==0) {
					cake[c] = r+1;
				}
			}
		}
		
		int[] cnt = new int[N+1];
		for(int i=1; i<cake.length; i++) {
			if(cake[i]>0) {
				cnt[cake[i]]++;
			}
		}
		
		int max2 = Integer.MIN_VALUE;
		int idx2 = 0;
		for(int i=cnt.length-1; i>0; i--) {
			max2 = Math.max(max2, cnt[i]);
			if(max2 == cnt[i]) {
				idx2 = i;
			}
		}
		System.out.println(idx2);
	}
}