import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=0; tc<T; tc++) {
			StringBuilder sb = new StringBuilder();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int repeat = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			
			for(int j=0; j<s.length(); j++) {
				char c = s.charAt(j);
				
				for(int i=0; i<repeat; i++) {
					sb.append(c);
				}
			}
			System.out.println(sb.toString());
		}
	}
}