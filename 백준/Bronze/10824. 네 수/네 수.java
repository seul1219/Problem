import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String result = "";
		String A = st.nextToken();
		result += A;
		String B = st.nextToken();
		result += B;
		
		String result2 = "";
		String C = st.nextToken();
		result2 += C;
		String D = st.nextToken();
		result2 += D;
		
		BigInteger b = new BigInteger(result);
		BigInteger b2 = new BigInteger(result2);
		System.out.println(b.add(b2));
	}
}