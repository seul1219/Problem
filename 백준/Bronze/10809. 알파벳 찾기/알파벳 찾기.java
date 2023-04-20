import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		
		int[] arr = new int[26];
		Arrays.fill(arr, -1);
		
		for(int i=0; i<S.length(); i++) {
			int num = S.charAt(i)-97;
			if(arr[num]==-1) {
				arr[num] = i;
			}
		}
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
}