import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		String[] sArr = new String[M];
		for(int i=0; i<M; i++) {
			sArr[i] = br.readLine();
		}
		
		Map<String, Integer> map = new HashMap<>();
		int idx = 0;
		while(idx!=M) {
			//이미 있으면 더 나중의 idx로 바꾸기
			if(map.containsKey(sArr[idx])) {
				map.put(sArr[idx], idx);
				idx++;
			} else {
				map.put(sArr[idx], idx);
				idx++;
			}
		}
		
		//map에 저장된 idx 체크
		boolean[] check = new boolean[M];
		for(String tmp2 : map.keySet()) {
			check[map.get(tmp2)] = true;
		}
		
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		for(int i=0; i<M; i++) {
			//N등까지만
			if(cnt==N) {
				break;
			}
			
			if(check[i]) {
				sb.append(sArr[i]).append("\n");
				cnt++;
			}
			
		}
		
		System.out.println(sb.toString());
	}
}