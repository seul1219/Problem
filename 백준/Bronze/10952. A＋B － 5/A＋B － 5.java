import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		
		while(true) {
			String str = br.readLine();
			if(str.equals("0 0")) {
				break;
			} else {
				StringTokenizer st = new StringTokenizer(str);
				
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				
				int res = A+B;
				System.out.println(res);
			}
		}
	}
}