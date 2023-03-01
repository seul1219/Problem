import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		char[] arr = new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		int cnt=1;
		int idx=0;
		while(idx<=arr.length-1) {
			if(arr[idx]=='S') {
				cnt++;
			} else if(arr[idx]=='L') {
				cnt++;
				idx++;
			}
			idx++;
		}
		
		if(cnt>N) {
			System.out.println(N);
		} else if(cnt<=N) {
			System.out.println(cnt);
		}
	}
}