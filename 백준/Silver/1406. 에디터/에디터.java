import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> stack = new Stack<>();
		String str = br.readLine();
		for(int i=0; i<str.length(); i++) {
			stack.push(str.charAt(i));
		}
		
		Stack<Character> stack2 = new Stack<>();
		int M = Integer.parseInt(br.readLine());
		for(int i=0; i<M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int cnt = st.countTokens();
			if(cnt==1) {
				String tmp = st.nextToken();
				if(tmp.equals("L")) {
					if(!stack.isEmpty()) {
						char c = stack.pop();
						stack2.push(c);
					}
				} else if(tmp.equals("D")) {
					if(!stack2.isEmpty()) {
						char c = stack2.pop();
						stack.push(c);
					}
				} else if(tmp.equals("B")) {
					if(!stack.isEmpty()) {
						stack.pop();
					}
				}
			} else if(cnt>1) {
				String tmp = st.nextToken();
				char c = st.nextToken().charAt(0);
					stack.push(c);
			}
		}//명령어
		
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()) {
			char c = stack.pop();
			stack2.push(c);
		}
		while(!stack2.isEmpty()) {
			char c = stack2.pop();
			sb.append(c);
		}
		
		System.out.print(sb.toString());
	}
}