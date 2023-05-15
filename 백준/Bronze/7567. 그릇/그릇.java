import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int result = 10;
		for(int i=1; i<str.length(); i++) {
			char c = str.charAt(i-1);
			if(str.charAt(i)==c) {
				result+=5;
			} else {
				result+=10;
			}
		}
		System.out.println(result);
	}
}