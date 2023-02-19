import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K= sc.nextInt();
		
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}

		int cnt = 0;
		
		for(int i=0; i<A.length-1; i++) {
			for(int j=0; j<A.length-1-i; j++) {

				if(A[j] > A[j+1]) {
					int tmp = A[j];
					A[j] = A[j+1];
					A[j+1] = tmp;
					cnt++;
					
					if(cnt==K) {
						for(int k=0; k<A.length; k++) {
							System.out.print(A[k] + " ");
						}
					}
				}
			}
		}
		
		if(cnt < K) {
			System.out.println(-1);
		}
	}
}