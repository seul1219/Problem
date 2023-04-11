import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = 9;
		int[] arr = new int[N];
		int max = 0;
		int idx = 0;
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		
			if(max<arr[i]) {
				max = arr[i];
				idx = i;
			}
		}
		
		System.out.println(max);
		System.out.println(idx+1);
	}
}