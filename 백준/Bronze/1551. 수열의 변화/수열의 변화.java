import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		if(K==0) {
			sb.append(br.readLine());
		} else {
			st = new StringTokenizer(br.readLine(), ",");
			int[] A = new int[N];
			for(int i=0; i<N; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}
			int cnt = 0;
			while(cnt!=K) {
				int tmp = N-1-cnt;
				for(int i=0; i<tmp; i++) {
					A[i] = A[i+1]-A[i];
				}
				
				if(cnt==K-1) {
					for(int i=0; i<tmp; i++) {
						if(i==tmp-1) {
							sb.append(A[i]);
						} else {
							sb.append(A[i]).append(",");
						}
					}
				}
				
				cnt++;
			}
		}
		
		System.out.print(sb.toString());
	}
}