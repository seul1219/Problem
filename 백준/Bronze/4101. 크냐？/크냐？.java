import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String str = br.readLine();
			
			if(str.equals("0 0")) {
				break;
			} else {
				StringTokenizer st = new StringTokenizer(str);
				int n1 = Integer.parseInt(st.nextToken());
				int n2 = Integer.parseInt(st.nextToken());
				
				if(n1>n2) {
					sb.append("Yes").append("\n");
				} else {
					sb.append("No").append("\n");
				}
			}
		}
		
		System.out.println(sb.toString());
	}
}