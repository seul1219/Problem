import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			//각 테스트 케이스마다 초기화
			cnt = 0;
			
			String str = br.readLine();
			
			System.out.println(isPalindrome(str) + " " + cnt);
		}
	}

	public static int cnt = 0;
	
	public static int recursion(String str, int l, int r) {
		//함수 호출될 때마다 증가
		cnt++;
		
		if(l>=r) {
			return 1;
		} else if(str.charAt(l) != str.charAt(r)) {
			return 0;
		} else {
			return recursion(str, l+1, r-1);
		}
	}
	
	public static int isPalindrome(String str) {
		return recursion(str, 0, str.length()-1);
	}
}