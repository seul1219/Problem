import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int len = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int result = 0;
		for(int i=0; i<len; i++) {
			result += (int)(str.charAt(i))-64;
		}
		
		System.out.println(result);
	}
}