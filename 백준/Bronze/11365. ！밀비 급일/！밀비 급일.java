import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String str = br.readLine();
			
			if(str.equals("END")) {
				break;
			} else {
				
				StringTokenizer st = new StringTokenizer(str);
				int cnt = st.countTokens();
				Stack<Character> stack = new Stack<>();
				for(int i=0; i<cnt; i++) {
					String tmp = st.nextToken();
					
					for(int j=0; j<tmp.length(); j++) {
						stack.push(tmp.charAt(j));
					}
					
					if(i!=cnt-1) {
						stack.push(' ');
					}
				}
				
				while(!stack.isEmpty()) {
					char c = stack.pop();
					sb.append(c);
				}
				
				sb.append("\n");
			}
		}
		
		System.out.println(sb.toString());
	}
}