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
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<9; i++) {
			if(i!=d1 && i!=d2) {
				sb.append(arr[i]).append("\n");
			}
		}
		System.out.print(sb.toString());
	}
}