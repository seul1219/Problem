import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		char[] cArr = str.toCharArray();
		
		int N = str.length();
		
		int[] arr = new int[N];
		for(int i=N; i>0; i--) {
			arr[N-i] = N/i;
		}
//		System.out.println(Arrays.toString(arr));
		
		int R = 0;
		int C = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(arr[i]<=arr[j] && arr[i]*arr[j]==N) {
					C = arr[i];
					R = arr[j];
				}
			}
		}
//		System.out.println(R);
//		System.out.println(C);
		
		char[][] string = new char[R][C];
		int idx=0;
		while(idx<cArr.length) {
			for(int r=0; r<R; r++) {
				for(int c=0; c<C; c++) {
					string[r][c] = cArr[idx++];
				}
			}
		}
//		System.out.println(Arrays.deepToString(string));
		
		StringBuilder sb = new StringBuilder();
		for(int c=0; c<C; c++) {
			for(int r=0; r<R; r++) {
				sb.append(string[r][c]);
			}
		}
		
		System.out.println(sb.toString());
	}
}