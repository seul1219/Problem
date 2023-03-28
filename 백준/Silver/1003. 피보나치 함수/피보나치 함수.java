import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		int[] zero = new int[41];
		zero[0] = 1;
		zero[1] = 0;
		
		int[] one = new int[41];
		one[0] = 0;
		one[1] = 1;
		
		for(int i=2; i<41; i++) {
			zero[i] = zero[i-1] + zero[i-2];
			one[i] = one[i-1] + one[i-2];
		}
		
		for(int i=0; i<T; i++) {
			StringBuilder sb = new StringBuilder();
			
			int N = Integer.parseInt(br.readLine());
			
			sb.append(zero[N] + " " + one[N]);
			
			System.out.println(sb.toString());
		}
	}
}