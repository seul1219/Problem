import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int res1 = 0;
		int res2 = 0;
		
		for(int i=0; i<str.length()/2; i++) {
			res1 += (int)(str.charAt(i)-'0');
		}
		
		for(int i=str.length()/2; i<str.length(); i++) {
			res2 += (int)(str.charAt(i)-'0');
		}
		
		if(res1==res2) {
			System.out.println("LUCKY");
		} else {
			System.out.println("READY");
		}
	}
}