import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N  = Integer.parseInt(st.nextToken());
		int M  = Integer.parseInt(st.nextToken());

		int[] arr = new int[N+1];
		for(int i=0; i<N+1; i++) {
			arr[i] = i;
		}
		
		for(int i=0; i<M; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st2.nextToken());
			int B = Integer.parseInt(st2.nextToken());
		
			int left = A;
			int right = B;
			int cnt = 0;
			int mid = (int) Math.floor(A+B/2);
			while(cnt!=mid && left<right) {
				int tmp = arr[left];
				arr[left] = arr[right];
				arr[right] = tmp;
				left++;
				right--;
				cnt++;
			}
		}
		
		for(int j=1; j<N+1; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
	}
}