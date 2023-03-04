import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		int R = sc.nextInt();
		int N = sc.nextInt();
		
		int[] nC = new int[C];
		int[] nR = new int[R+1];
		
		nR[0]=0;
		nR[nR.length-1] = R;
		nC[0]=0;
		nC[nC.length-1] = C;
		
		int tmp = 0;
		
		for(int i=0; i<N; i++) {
			int type = sc.nextInt();
			if(type==0) {
				tmp = sc.nextInt();
				nR[tmp] = tmp;
			} else if(type==1) {
				tmp = sc.nextInt();
				nC[tmp] = tmp;
			}
		}
		
		Arrays.sort(nR);
		Arrays.sort(nC);
		
		int nR2 = 0;
		for(int i=nR.length-1; i>0; i--) {
			if(nR[i] != 0) {
				nR2 = Math.max(nR2, nR[i] - nR[i-1]);
			}
		}
		
		int nC2 = 0;
		for(int i=nC.length-1; i>0; i--) {
			if(nC[i] != 0) {
				nC2 = Math.max(nC2, nC[i] - nC[i-1]);
			}
		}
		System.out.println(nR2 * nC2);
	}
}