import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int M = sc.nextInt();
		
		for(int i=0; i<M; i++) {
			
			int num = sc.nextInt();
			
			boolean res = binarySearch(arr, num);
			
			if(res) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
	}
	
	public static boolean binarySearch(int[] A, int key) {
		int start = 0;
		int end = A.length-1;
		
		while(start<=end) {
			int middle = (start+end)/2;

			if(A[middle] == key) {
				return true;
			}
				
			else if(A[middle] > key) {
				end = middle - 1;
			}
			
			else {
				start = middle + 1;
			}
			
		}
		
		return false;
	}
}