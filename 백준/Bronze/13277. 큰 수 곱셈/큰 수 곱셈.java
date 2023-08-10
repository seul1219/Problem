import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();
		
		BigInteger num1 = new BigInteger(A);
		BigInteger num2 = new BigInteger(B);
		
		System.out.println(num1.multiply(num2));
	}
}