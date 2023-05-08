import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			int cnt = st.countTokens();
			StringBuilder sb = new StringBuilder();
			String[] sArr = new String[cnt];
			for(int j=0; j<cnt; j++) {
				sArr[j] = st.nextToken();
			}
			
			for(int j=0; j<cnt; j++) {
				for(int k=sArr[j].length()-1; k>=0; k--) {
					sb.append(sArr[j].charAt(k));
				}
				sb.append(" ");
			}
			
			System.out.println(sb.toString());
		}
	}
}