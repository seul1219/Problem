import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String sA = st.nextToken();
		String sB = st.nextToken();
		
		String sA2 = "";
		String sB2 = "";
		
		for(int i=sA.length()-1; i>=0; i--) {
			sA2 += sA.charAt(i);
		}
		for(int i=sB.length()-1; i>=0; i--) {
			sB2 += sB.charAt(i);
		}
		
		int A = Integer.parseInt(sA2);
		int B = Integer.parseInt(sB2);

		int max = A>B? A : B;
		
		System.out.println(max);
	}
}