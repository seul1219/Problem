import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
     
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=N; i>=0; i--) {
			int j = 0;
			while(j!=i) {
				sb.append("*");
				j++;
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
