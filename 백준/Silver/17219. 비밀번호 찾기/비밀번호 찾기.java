import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String, String> map = new HashMap<>();
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			map.put(st.nextToken(), st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<M; i++) {
			String str = br.readLine();
			
			if(map.get(str) != null) {
				sb.append(map.get(str)).append("\n");
			}
		}
		
		System.out.println(sb.toString());
	}
}