import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			map.put(st.nextToken(), 1);
		}
		
		int M = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			String tmp = st2.nextToken();
			if(map.containsKey(tmp) && map.get(tmp)==1) {
				sb.append("1").append(" ");
			} else {
				sb.append("0").append(" ");
			}
		}
		
		System.out.println(sb.toString());
	}
}