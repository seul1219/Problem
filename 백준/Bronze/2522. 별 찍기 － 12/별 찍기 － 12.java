import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		int left = N-1;
		for(int i=0; i<2*N-1; i++) {
			for(int j=0; j<left; j++) {
				sb.append(" ");
			}
			for(int j=left; j<N; j++) {
				sb.append("*");
			}
			sb.append("\n");
			if(i>=N-1) {
				left++;
			} else {
				left--;
			}
		}
		
		System.out.println(sb.toString());
	}
}