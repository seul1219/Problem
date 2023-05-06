import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String str = br.readLine();
			if(str.equals("0")) {
				return;
				
			} else {
				String result = "";
				for(int i=str.length()-1; i>=0; i--) {
					result += str.charAt(i);
				}
				
				if(result.equals(str)) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
	}
}