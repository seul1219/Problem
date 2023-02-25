import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		
		int sum = 0;
		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		int d1 = 0;
		int d2 = 0;
		L: for(int i=0; i<9; i++) {
			for(int j=i+1; j<9; j++) {
				int tmp = sum - arr[i] - arr[j];
			
				if(tmp == 100) {
					d1 = i;
					d2 = j;
					
					break L;
				}
			}
		}
		
		for(int i=0; i<9; i++) {
			if(i!=d1 && i!=d2) {
				System.out.println(arr[i]);
			}
		}
	}
}