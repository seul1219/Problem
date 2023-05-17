import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			BigInteger num = new BigInteger(str);
			BigInteger num2 = new BigInteger("2");
			BigInteger num0 = new BigInteger("0");
			
			if(num.remainder(num2).equals(num0)) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}
	}
}