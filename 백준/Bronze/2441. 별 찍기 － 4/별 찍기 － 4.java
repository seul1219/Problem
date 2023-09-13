import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		int left = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<left; j++) {
				sb.append(" ");
			}
			for(int j=left; j<N; j++) {
				sb.append("*");
			}
			sb.append("\n");
			left++;
		}
		
		System.out.println(sb.toString());
	}
}