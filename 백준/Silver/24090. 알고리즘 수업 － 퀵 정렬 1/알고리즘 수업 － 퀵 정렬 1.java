import java.util.Scanner;

public class Main {

	public static int K;
	public static int cnt;
	public static int res1;
	public static int res2;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		K = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}

		cnt = 0;
		res1 = 0;
		res2 = 0;
		
		quickSort(arr, 0, arr.length-1);
		
		if(cnt<K) {
			System.out.println("-1");
		} else {
			System.out.println(res1 + " " + res2);
		}
	}
	
	public static void quickSort(int[] arr, int left, int right) {
		if(left<right) {
			int pivot = partition(arr, left, right);
			quickSort(arr, left, pivot-1);
			quickSort(arr, pivot+1, right);
		}
	}

	private static int partition(int[] arr, int left, int right) {
		int pivot = arr[right];
		
		int i = left-1;
		
		for(int j=left; j<right; j++) {
			if(arr[j]<=pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		if(i+1 != right) {
			swap(arr, i+1, right);
		}
		
		return i+1;
	}

	public static void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
		
		cnt++;
		if(cnt==K) {
			res1 = Math.min(arr[a], arr[b]);
			res2 = Math.max(arr[a], arr[b]);
		}
	}
}