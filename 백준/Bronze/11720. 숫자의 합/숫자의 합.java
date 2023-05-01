import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int result = 0;
		int[] arr = new int[N];
		String str = br.readLine();
		for(int i=0; i<N; i++) {
			arr[i] = (int) (str.charAt(i)-48);
			result += arr[i];
		}
		
		System.out.println(result);
	}
}