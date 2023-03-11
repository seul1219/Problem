import java.util.Scanner;

public class Main {
	
	public static long[] arr = new long[101];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			
			int N = sc.nextInt();
			
			for(int j=1; j<101; j++) {
				if(j>3) {
					arr[j] = arr[j-3] + arr[j-2];
				} else {
					arr[j] = 1;
				}
			}
			
			System.out.println(arr[N]);
		}
	}
}