import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] arr2 = new int[(N*(N-1)*(N-2))/6];
		int idx=0;
		while(idx<arr2.length) {
			for(int i=0; i<arr.length-2; i++) {
				for(int j=i+1; j<arr.length-1; j++) {
					for(int k=j+1; k<arr.length; k++) {
						if(arr[i]+arr[j]+arr[k]<=M) {
							arr2[idx] = arr[i]+arr[j]+arr[k];
						} else {
							arr2[idx] = 0; 
						}
						idx++;
					}
				}
			}
		}
//		System.out.println(Arrays.toString(arr2));
		
		Arrays.sort(arr2);
		
		System.out.println(arr2[arr2.length-1]);
	}
}