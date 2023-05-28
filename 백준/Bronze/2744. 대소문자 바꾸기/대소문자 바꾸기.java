import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String res = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				res += (char) (str.charAt(i)+32);
			} else if(str.charAt(i)>=97 && str.charAt(i)<=122) {
				res += (char) (str.charAt(i)-32);
			}
		}
		
		System.out.println(res);
	}
}