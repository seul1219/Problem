import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int L = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int participant = L*P;
		
		int[] news = new int[5];
		int[] res = new int[5];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0; i<5; i++) {
			news[i] = Integer.parseInt(st2.nextToken());
			res[i] = news[i] - participant;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<5; i++) {
			sb.append(res[i]).append(" ");
		}
		
		System.out.println(sb.toString());
	}
}