import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		int result = A*B*C;
		String str = String.valueOf(result);
		
		int[] arr = new int[10];
		char[] cArr = new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			cArr[i] = str.charAt(i);
//			System.out.println(cArr[i]);
//			System.out.println((int)cArr[i]-48);
			int idx = (int)cArr[i]-48;
			arr[idx]++;
		}
		
		for(int i=0; i<10; i++) {
			System.out.println(arr[i]);
		}
	}
}