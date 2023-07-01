import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		Map<Integer, Boolean> map = new HashMap<>();
		StringTokenizer stA = new StringTokenizer(br.readLine());
		for(int i=0; i<A; i++) {
			int tmp = Integer.parseInt(stA.nextToken());
			map.put(tmp, false);
		}
		
		int cnt = 0;
		StringTokenizer stB = new StringTokenizer(br.readLine());
		for(int i=0; i<B; i++) {
			int tmp = Integer.parseInt(stB.nextToken());
			if(map.containsKey(tmp) && !map.get(tmp)) {
				map.put(tmp, true);
			}
		}
		
		PriorityQueue<Integer> que = new PriorityQueue<>();
		for(int tmp : map.keySet()) {
			if(!map.get(tmp)) {
				cnt++;
				que.offer(tmp);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		if(cnt>0) {
			sb.append(cnt).append("\n");
			while(!que.isEmpty()) {
				sb.append(que.poll()).append(" ");
			}
		} else if(cnt==0) {
			sb.append("0");
		}
		
		System.out.println(sb.toString());
	}
}