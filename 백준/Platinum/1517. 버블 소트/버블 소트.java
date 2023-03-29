import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static int N;
	public static long cnt;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		MergeSort(arr, 0, arr.length-1);
				
		System.out.println(cnt);
	}

	private static void MergeSort(int[] arr, int left, int right) {
		if(left<right) {
			int mid = (left+right)/2;
			
			MergeSort(arr, left, mid);
			MergeSort(arr, mid+1, right);
			Merge(arr, left, mid, right);
		}
	}

	private static void Merge(int[] arr, int left, int mid, int right) {
		
		int n1 = mid-left+1;
		int n2 = right-mid;
	
		int L = left;
		int R = mid+1;
		
		int[] A = new int[n1];
		int[] B = new int[n2];
		
		for(int i=0; i<n1; i++) {
			A[i] = arr[L+i];
		}
		
		for(int i=0; i<n2; i++) {
			B[i] = arr[R+i];
		}
		
		int i=0;
		int j=0;
		int k=L;
		
		while(i<n1 && j<n2) {
			if(A[i]<=B[j]) {
				arr[k] = A[i];
				k++; i++;
			} else {
				arr[k] = B[j];
				k++; j++;
				cnt+=(n1-i);
			}
		}
		
		for(; j<n2; j++) {
			arr[k] = B[j];
			k++;
		}
	
		for(; i<n1; i++) {
			arr[k] = A[i];
			k++;
		}
	}
}