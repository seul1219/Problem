import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			
			String result = "";
			if(str.charAt(0)>=97) {
				char c = (char) (str.charAt(0)-32);
				result += c;
				
				for(int j=1; j<str.length(); j++) {
					result += str.charAt(j);
				}
			} else {
				result = str;
			}
			
			System.out.println(result);
		}
	}
}
