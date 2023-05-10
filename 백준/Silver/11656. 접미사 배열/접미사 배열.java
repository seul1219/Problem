import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		
		String[] sArr = new String[S.length()];
		String token = "";
		
		for(int i=S.length()-1; i>=0; i--) {
			token += S.charAt(i);
			sArr[i] = token;
		}
		
		String[] sArr2 = new String[S.length()];
		PriorityQueue<String> pq = new PriorityQueue<>();
		for(int i=0; i<sArr2.length; i++) {
			sArr2[i] = "";
			for(int j=sArr[i].length()-1; j>=0; j--) {
				sArr2[i] += sArr[i].charAt(j);
			}
//			System.out.println(sArr2[i]);
			pq.offer(sArr2[i]);
		}
		
		StringBuilder sb = new StringBuilder();
		while(!pq.isEmpty()) {
			String str = pq.poll();
			sb.append(str).append("\n");
		}
		
		System.out.println(sb.toString());
	}
}