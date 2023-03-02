import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] F = new int[7];
		int[] M = new int[7];
		
		for(int i=0; i<N; i++) {
			int S = sc.nextInt();
			
			if(S==0) {
				F[sc.nextInt()]++;
			} else if(S==1) {
				M[sc.nextInt()]++;
			}
		}
//		System.out.println(Arrays.toString(F));
//		System.out.println(Arrays.toString(M));
	
		int cnt = 0;
		for(int i=1; i<7; i++) {
			if(F[i]>K) {
				while(F[i]>0) {
					cnt++;
					F[i] = F[i]-K;
				}
			} else if(F[i]==K) {
				cnt++;
			} else if(F[i]<K && F[i]>0){
				cnt++;
			} else if(F[i]==0) {
				continue;
			}
		}
//		System.out.println(cnt);
		
		for(int j=1; j<7; j++) {
			if(M[j]>K) {
				while(M[j]>0) {
					cnt++;
					M[j] = M[j]-K;
				}
			} else
				if(M[j]==K) {
				cnt++;
			} else if(M[j]<K && M[j]>0){
				cnt++;
			} else if(M[j]==0) {
				continue;
			}
		}
		System.out.println(cnt);
	}
}