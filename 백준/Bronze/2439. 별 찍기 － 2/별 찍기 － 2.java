import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int right = N-1;
		
		StringBuilder sb = new StringBuilder();
		for(int r=0; r<N; r++) {
			for(int i=0; i<right; i++) {
				sb.append(" ");
			}
			for(int i=right; i<N; i++) {
				sb.append("*");
			}
			right--;
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
}