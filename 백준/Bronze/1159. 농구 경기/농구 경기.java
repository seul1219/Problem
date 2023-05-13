import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		
		int[] arr = new int[26];
		for(int i=0; i<cnt; i++) {
			String str = br.readLine();
			arr[(int) (str.charAt(0)-97)]++;
		}
		
		boolean flag = false;
		for(int i=0; i<26; i++) {
			if(arr[i]>=5) {
				flag = true;
				break;
			} else {
				flag = false;
			}
		}

		StringBuilder sb = new StringBuilder();
		if(flag) {
			for(int i=0; i<26; i++) {
				if(arr[i]>=5) {
					sb.append((char) (i+97));
				}
			}
			System.out.println(sb.toString());
		} else {
			System.out.println("PREDAJA");
		}
	}
}