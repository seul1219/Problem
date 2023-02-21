import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			Stack<Character> st = new Stack<>();

			String str = sc.nextLine();
			
			boolean flag = true;
			
			if(str.equals(".")) {
				break;
			}
			
			for(int i=0; i<str.length(); i++) {
				char c = str.charAt(i);
				
				//여는 괄호면 스택에 넣기
				if(c=='(') {
					st.push(c);
				} else if(c=='[') {
					st.push(c);
					
				//닫는 괄호면 검사하기
				} else if(c==')') {
					if(st.isEmpty() || st.peek()=='[') {
						flag = false;
						break;
					} else if (st.peek()=='(') {
						st.pop();
					}
				} else if(c==']') {
					if(st.isEmpty() || st.peek()=='(') {
						flag = false;
						break;
					} else if (st.peek()=='[') {
						st.pop();
					}
				}
			}
			
			if(!st.isEmpty() || flag == false) {
				System.out.println("no");
			} else if(st.isEmpty()) {
				System.out.println("yes");
			}
		}
	}
}