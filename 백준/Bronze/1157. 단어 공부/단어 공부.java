import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//대문자 65-90/소문자 97-122 (26)
//		char a = 'a';
//		int a2 = a;
//		System.out.println(a2-97);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		char[] cArr = new char[s.length()];
		
		int[] arr = new int[26];
		for(int i=0; i<s.length(); i++) {
			cArr[i] = s.charAt(i);
			//만약 대문자라면
			if(cArr[i]-97<0 && cArr[i]-65>=0 && cArr[i]-65<=25) {
				arr[cArr[i]-65]++;
				//만약 소문자라면
			} else if(cArr[i]-97>=0 && cArr[i]-97<=25) {
				arr[cArr[i]-97]++;
			}
		}

		int max = 0;
		for(int i=0; i<26; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		
		int idx = 0;
		int cnt = 0;
		for(int i=0; i<26; i++) {
			if(max == arr[i]) {
				cnt++;
				idx = i;
			}
		}
		
		if(cnt==1) {
			char c = (char) (idx + 65);
			System.out.println(c);
		} else if(cnt>1) {
			System.out.println("?");
		}
	}
}