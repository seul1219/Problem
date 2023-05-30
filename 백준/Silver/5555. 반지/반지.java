import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int N = Integer.parseInt(br.readLine());
		int res = 0;
		L: for(int i=0; i<N; i++) {
			String tmp = br.readLine();

			//일단 현재 포함하고 있는지부터 검증
			boolean flag = false;
			if(tmp.contains(str)) {
				flag = true;
			}
			
			if(flag) {
				res++;
				continue L;
			} else {
				Queue<Character> que = new LinkedList<>();
				for(int j=0; j<tmp.length(); j++) {
					que.offer(tmp.charAt(j));
				}
				
				//하나씩 뒤로 보내면서 다시 검증하기
				L2: for(int j=0; j<tmp.length(); j++) {
					char c = que.poll();
					que.offer(c);
					
					String s = "";
					int cnt = 0;
					while(cnt!=tmp.length()) {
						char cTmp = que.poll();
						cnt++;
						s += cTmp;
						que.offer(cTmp);
					}
					
					if(s.contains(str)) {
						res++;
						continue L;
					} else {
						continue L2;
					}
				}
			}
		}
		
		System.out.println(res);
	}
}