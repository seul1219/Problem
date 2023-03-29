import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> que = new PriorityQueue<>();

		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num!=0) {
				que.offer(num);
			} else {
				if(que.isEmpty()) {
					sb.append("0").append("\n");
				} else {
					sb.append(que.poll()).append("\n");
				}
			}
		}
		
		System.out.println(sb.toString());
	}
}