import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		int cnt = st.countTokens();
		int[] arr = new int[cnt];
		for(int i=0; i<cnt; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		boolean flag1 = true;
		boolean flag2 = true;
		
		for(int i=1; i<=cnt; i++) {
			if(i!=arr[i-1]) {
				flag1 = false;
			}
			
			if((cnt-(i-1))!=arr[i-1]) {
				flag2 = false;
			}
		}
		
		if(flag1 && !flag2) {
			System.out.println("ascending");
		} else if(!flag1 && flag2) {
			System.out.println("descending");
		} else if(!flag1 && !flag2) {
			System.out.println("mixed");
		}
	}
}