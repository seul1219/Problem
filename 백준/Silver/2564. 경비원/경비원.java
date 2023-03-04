import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		int R = sc.nextInt();
		int N = sc.nextInt();
		
		int[][] arr = new int[N+1][3];
		int idx = 0;
		for(int i=0; i<N+1; i++) {
			int tmp = sc.nextInt();
			
			//북
			if(tmp==1) {
				arr[idx][0] = 1;
				arr[idx][1] = 0;
				arr[idx][2] = sc.nextInt();
				
			//남
			} else if(tmp==2) {
				arr[idx][0] = 2;
				arr[idx][1] = R;
				arr[idx][2] = sc.nextInt();
				
			//서
			} else if(tmp==3) {
				arr[idx][0] = 3;
				arr[idx][1] = sc.nextInt();
				arr[idx][2] = 0;
				
			//동
			} else if(tmp==4) {
				arr[idx][0] = 4;
				arr[idx][1] = sc.nextInt();
				arr[idx][2] = C;
			}
			idx++;
		}
		
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			int sum1 = 0;
			int sum2 = 0;
			
			if(arr[N][0] == 1) {
				if(arr[i][0] == 1) {
					sum += Math.abs(arr[N][2]-arr[i][2]);
				} else if(arr[i][0] == 2) {
					sum1 = arr[N][2] + arr[i][2] + R;
					sum2 = (C-arr[N][2]) + (C-arr[i][2]) + R;
					sum += sum1<=sum2 ? sum1 : sum2;
				} else if(arr[i][0] == 3) {
					sum1 = arr[N][2] + arr[i][1];
					sum2 = (C-arr[N][2]) + C + R + (R-arr[i][1]);
					sum += sum1<=sum2 ? sum1 : sum2;
				} else if(arr[i][0] == 4) {
					sum1 = (C-arr[N][2]) + arr[i][1];
					sum2 = arr[N][2] + C + R + (R-arr[i][1]);
					sum += sum1<=sum2 ? sum1 : sum2;
				}
				
			} else if(arr[N][0] == 2) {
				if(arr[i][0] == 2) {
					sum += Math.abs(arr[N][2]-arr[i][2]);
				} else if(arr[i][0] == 1) {
					sum1 = arr[N][2] + arr[i][2] + R;
					sum2 = (C-arr[N][2]) + (C-arr[i][2]) + R;
					sum += sum1<=sum2 ? sum1 : sum2;
				} else if(arr[i][0] == 3) {
					sum1 = arr[N][2] + (R-arr[i][1]);
					sum2 = (C-arr[N][2]) + C + R + arr[i][1];
					sum += sum1<=sum2 ? sum1 : sum2;
				} else if(arr[i][0] == 4) {
					sum1 = (C-arr[N][2]) + (R-arr[i][1]);
					sum2 = arr[N][2] + C + R + arr[i][1];
					sum += sum1<=sum2 ? sum1 : sum2;
				}
			} else if(arr[N][0] == 3) {
				if(arr[i][0] == 3) {
					sum += Math.abs(arr[N][1]-arr[i][1]);
				} else if(arr[i][0] == 1) {
					sum1 = arr[N][1] + arr[i][2];
					sum2 = (R-arr[N][1]) + C + R + (C-arr[i][2]);
					sum += sum1<=sum2 ? sum1 : sum2;
				} else if(arr[i][0] == 2) {
					sum1 = (R-arr[N][1]) + arr[i][2];
					sum2 = arr[N][1] + C + R + (C-arr[i][2]);
					sum += sum1<=sum2 ? sum1 : sum2;
				} else if(arr[i][0] == 4) {
					sum1 = arr[N][1] + C + arr[i][1];
					sum2 = (R-arr[N][1]) + C + (R-arr[i][1]);
					sum += sum1<=sum2 ? sum1 : sum2;
				}
				
			} else if(arr[N][0] == 4) {
				if(arr[i][0] == 4) {
					sum += Math.abs(arr[N][1]-arr[i][1]);
				} else if(arr[i][0] == 1) {
					sum1 = arr[N][1] + (C-arr[i][2]);
					sum2 = (R-arr[N][1]) + C + R + arr[i][2];
					sum += sum1<=sum2 ? sum1 : sum2;
				} else if(arr[i][0] == 2) {
					sum1 = (R-arr[N][1]) + (C-arr[i][2]);
					sum2 = arr[N][1] + C + R + arr[i][2];
					sum += sum1<=sum2 ? sum1 : sum2;
				} else if(arr[i][0] == 3) {
					sum1 = arr[N][1] + C + arr[i][1];
					sum2 = (R-arr[N][1]) + C + (R-arr[i][1]);
					sum += sum1<=sum2 ? sum1 : sum2;
				}
			}
		}
		
		System.out.println(sum);
	}
}