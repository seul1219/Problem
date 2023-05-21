import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<3; i++) {
			String str = br.readLine();
			boolean flag = false;
			
			int[] arr = new int[10];
			int cnt = 1;
			int result = 1;
			for(int j=1; j<8; j++) {
				//연속된 숫자인지 확인
				if((str.charAt(j-1))==(str.charAt(j))) {
					flag = true;
				} else {
					flag = false;
				}
				
				//연속된 숫자면 cnt증가
				if(flag) {
					cnt++;
					arr[str.charAt(j)-48] = Integer.max(arr[str.charAt(j)-48], cnt);
					//아니면 cnt 다시 초기화
				} else {
					cnt = 1;
				}
				
			}
			
			for(int k=0; k<10; k++) {
				result = Integer.max(arr[k], result);
			}
			System.out.println(result);
		}
	}
}