import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String X = st.nextToken();
		String Y = st.nextToken();
		
		String rX = "";
		String rY = "";
		for(int i=X.length()-1; i>=0; i--) {
			rX += X.charAt(i);
		}
		for(int i=Y.length()-1; i>=0; i--) {
			rY += Y.charAt(i);
		}
		
		String rXY = Integer.toString(Integer.parseInt(rX)+Integer.parseInt(rY));
		
		String result = "";
		for(int i=rXY.length()-1; i>=0; i--) {
			result += rXY.charAt(i);
		}
		
		int result2 = Integer.parseInt(result);
		System.out.println(result2);
	}
}