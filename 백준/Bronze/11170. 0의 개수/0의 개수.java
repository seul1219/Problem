import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int cnt = 0;
			
			for(int j=N; j<=M; j++) {
				String tmp = Integer.toString(j);
				char[] cArr = tmp.toCharArray();
				for(int k=0; k<cArr.length; k++) {
					if((cArr[k]-'0')==0) {
						cnt++;
					}
				}
			}
			
			System.out.println(cnt);
		}
	}
}