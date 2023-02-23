import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Stack<Character> st = new Stack<>();
		
		String str = sc.next();
		int rod = 0;
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			if(c == '(') {
				//'(' 넣기
				st.push(c);
			}
			else if(c == ')') {
				//'(' 빼기
				st.pop();
				//레이저인 경우
				if(str.charAt(i-1) == '(') {
					rod += st.size();
				//레이저가 아닌 경우
				} else if(str.charAt(i-1) == ')') {
					rod++;
				}
			}
		}
		System.out.println(rod);
	}
}