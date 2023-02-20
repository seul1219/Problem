import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		L: for(int i=0; i<T; i++) {
			String str = sc.next();
			
			Stack<Character> stack = new Stack<>();
			
			for(int j=0; j<str.length(); j++) {
				char ch = str.charAt(j);
				
				//여는 괄호는 넣고
				if(ch == '(') {
					stack.push(ch);
				}
				//닫는 괄호면 여는 괄호 빼기
				else if (ch == ')'){
					try {
						stack.pop();
						
					//빼낼 여는 괄호가 없는 경우
					} catch(EmptyStackException e) {
						System.out.println("NO");
						continue L;
					} catch(Exception e) {
						System.out.println("NO");
						continue L;
					}
				}
			}
			
			//여는 괄호 == 닫는 괄호
			if(stack.empty()) {
				System.out.println("YES");
				continue L;
			}
			
			//여는 괄호가 남아 있는 경우
			else {
				System.out.println("NO");
				continue L;
			}
		}
	}
}