import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] arr2 = new int[N];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr2[i] = Integer.parseInt(st2.nextToken());
		}
		
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		int res = 0;
		for(int i=0; i<N; i++) {
			res += (arr[i] * arr2[N-i-1]);
		}
		
		System.out.println(res);
	}
}