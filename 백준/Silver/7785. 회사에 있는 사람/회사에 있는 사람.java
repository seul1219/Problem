import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Map<String, String> map = new HashMap<>();
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String state = st.nextToken();
			if(state.equals("enter")) {
				map.put(name, state);
			}
			if(map.containsKey(name) && state.equals("leave")) {
				map.remove(name);
			}
		}
		
		PriorityQueue<String> que = new PriorityQueue<>();
		for(String str : map.keySet()) {
			que.offer(str);
		}
		
		List<String> list = new ArrayList<>();
		while(!que.isEmpty()) {
			list.add(que.poll());
		}

		StringBuilder sb = new StringBuilder();
		for(int i=list.size()-1; i>=0; i--) {
			System.out.println(list.get(i));
		}
		
		System.out.println(sb.toString());
	}
}