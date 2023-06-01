import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

		//그룹 단어 개수
		int res = 0;

		for(int i=0; i<N; i++) {
			String str = br.readLine();
		
			//그룹 단어 맞는지 체크
			boolean flag = false;
			
			//97~122
			boolean[] check = new boolean[26];
			
			int j=0;
			while(j != str.length()) {
				
				//해당 글자가 처음 나왔으면
				if(!check[str.charAt(j)-97]) {
					//방문 체크
					check[str.charAt(j)-97] = true;
					j++;
					continue;
				//앞에 나왔던 문자인데 또 나온 경우(연속인 경우)
				} else if(j>0 && check[str.charAt(j)-97] && (str.charAt(j)==str.charAt(j-1))) {
					j++;
					continue;
				//앞에 나왔던 문자인데 또 나온 경우(연속이 아닌 경우)
				} else if(j>0 && check[str.charAt(j)-97] && (str.charAt(j)!=str.charAt(j-1))) {
					flag = true;
					break;
				}
				
				//조건에 걸리지 않은 경우 다음으로 넘어가서 검증
				j++;
			}
			
			//그룹 단어면 증가
			if(!flag) {
				res++;
			}
		}
		
		System.out.println(res);
	}
}