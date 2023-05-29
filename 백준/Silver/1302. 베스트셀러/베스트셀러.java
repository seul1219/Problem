import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		//일단 알파벳 순서대로 정렬
		PriorityQueue<String> pq = new PriorityQueue<>();
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			pq.offer(str);
		}

		//중복 제거하면서 개수 세기
		int max = 0;
		String s = "";
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		while(!pq.isEmpty()) {
			String str = pq.poll();
			
			//이미 있으면 갱신
			if(hashMap.containsKey(str)) {
				hashMap.put(str, hashMap.get(str)+1);
			//없으면 추가
			} else {
				hashMap.put(str, 1);
			}
			
			//최댓값 찾기
			if(max<hashMap.get(str)) {
				max = hashMap.get(str);
				s = str;
			}
		}
		
		System.out.println(s);
	}
}