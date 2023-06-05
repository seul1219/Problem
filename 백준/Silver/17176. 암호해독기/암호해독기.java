import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		//입력 받은 숫자를 저장하고
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		//오름차순 정렬
		Arrays.sort(arr);
		
		//입력 받은 문자를 숫자로 바꿔서 저장하고
		int[] arr2 = new int[N];
		String str = br.readLine();
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c>='A' && c<='Z') {
				arr2[i] = ((int)c) - 64;
			} else if(c>='a' && c<='z') {
				arr2[i] = ((int)c) - 70;
			} else if(c==' ') {
				arr2[i] = 0;
			}
		}
		
		//오름차순 정렬
		Arrays.sort(arr2);
		
		boolean flag = false;
		for(int i=0; i<N; i++) {
			//다른 부분이 있다면
			if(arr[i]!=arr2[i]) {
				flag = true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("n");
		} else {
			System.out.println("y");
		}
	}
}
