import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] JOI = {500, 100, 50, 10, 5, 1};
		
		int N = sc.nextInt();
		
		int res = 1000-N;
		int cnt = 0;
		for(int i=0; i<JOI.length; i++) {
			
			if(JOI[i] <= res) {
				cnt += res/JOI[i];
				res = res%JOI[i];
			}
		}
		
		System.out.println(cnt);
	}
}