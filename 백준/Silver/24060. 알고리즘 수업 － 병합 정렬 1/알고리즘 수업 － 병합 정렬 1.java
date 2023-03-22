import java.util.Scanner;

public class Main {
	
	public static int K;
	public static int cnt;
	public static int res;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		K = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		MergeSort(arr, 0, arr.length-1);
		
		if(cnt<K) {
			System.out.println("-1");
		} else {
			System.out.println(res);
		}
		
	}

	public static void MergeSort(int[] arr, int left, int right) {
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
		
		while(i<n1&&j<n2) {
			if(A[i]<B[j]) {
				arr[k] = A[i];
				
				cnt++;
				if(cnt==K) {
					res=A[i];
				}
				
				k++; i++;
			} else {
				arr[k] = B[j];
				
				cnt++;
				if(cnt==K) {
					res=B[j];
				}
				
				k++; j++;
			}
		}
		
		for(; i<n1; i++) {
			arr[k++] = A[i];
			cnt++;
			if(cnt==K) {
				res=A[i];
			}
		}
		
		for(; j<n2; j++) {
			arr[k++] = B[j];
			cnt++;
			if(cnt==K) {
				res=B[j];
			}
		}
	}
}