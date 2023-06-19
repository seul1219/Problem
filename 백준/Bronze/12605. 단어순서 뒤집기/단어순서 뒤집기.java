import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t=1; t<=T; t++) {
			sb.append("Case #" + t + ": ");
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int cnt = st.countTokens();
			String[] sArr = new String[cnt];
			for(int i=0; i<cnt; i++) {
				sArr[i] = st.nextToken();
			}
			
			for(int i=sArr.length-1; i>=0; i--) {
				sb.append(sArr[i]).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
}