import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int t=0; t<N; t++) {
			String str = br.readLine();
			
			//65~90
			int[] arr = new int[26];
			
			boolean flag = false;
			for(int i=0; i<str.length(); i++) {
				arr[str.charAt(i)-65]++;
				
				//각 문자가 세 번째 등장할 때
				if(arr[str.charAt(i)-65]==3) {
					//만약 다음 문자가 없거나
					if(i==str.length()-1) {
						flag = true;
						break;
					}
					
					if (i<str.length()-1 && str.charAt(i+1)==str.charAt(i)) {
						arr[str.charAt(i)-65]=0;
						i++;
					//다음 문자와 같지 않은 게 하나라도 있으면
					} else {
						flag = true;
						break;
					}
				}
			}
			
			if(flag) {
				sb.append("FAKE").append("\n");
			} else {
				sb.append("OK").append("\n");
			}
		}
		
		System.out.println(sb.toString());
	}
}