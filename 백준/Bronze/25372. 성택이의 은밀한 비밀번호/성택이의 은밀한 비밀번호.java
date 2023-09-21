import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			boolean flag = false;
			String str = br.readLine();
			if(str.length()>=6 && str.length()<=9) {
				flag = true;
			}
			
			if(flag) {
				sb.append("yes").append("\n");
			} else {
				sb.append("no").append("\n");
			}
		}
		
		System.out.println(sb.toString());
	}
}