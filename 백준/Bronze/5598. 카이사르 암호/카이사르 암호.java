import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char[] cArr = new char[str.length()];
		String result = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)<'D') {
				cArr[i] = (char) (str.charAt(i)+23);
			} else {
				cArr[i] = (char) (str.charAt(i)-3);
			}
			result += cArr[i];
		}
		System.out.println(result);
	}
}