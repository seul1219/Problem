import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<Integer, String> map = new HashMap<>();
		HashMap<String, Integer> map2 = new HashMap<>();
		for(int i=1; i<=N; i++) {
			String str = br.readLine();
			map.put(i, str);
			map2.put(str, i);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<M; i++) {
			String str = br.readLine();
			
			if(isInteger(str)) {
				sb.append(map.get(Integer.parseInt(str))).append("\n");
			} else {
				sb.append(map2.get(str)).append("\n");
			}
		}
		
		System.out.println(sb.toString());
	}//main
	
	public static boolean isInteger(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e){
			return false;
		}
	}
}