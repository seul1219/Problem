import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = 1;
		
		while(true) {
			
			String str = br.readLine();
			if(str.equals("0 0 0")) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(str);
			
			int L = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			
			int tmp = V%P;
			int sum = 0;
			if(tmp <= L) {
				sum += L * (V/P) + V%P;
			} else if(tmp > L) {
				sum += L * (V/P) + L;
			}
			
			System.out.println("Case " + T +": " + sum);

			T++;
		}
	}
}