import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		
		int K = sc.nextInt();
		
		for(int i=0; i<K; i++) {
			int num = sc.nextInt();
			
			if(num == 0) {
				st.pop();
			} else {
				st.push(num);
			}
		}
		
		int sum = 0;
		while(!st.isEmpty()) {
			sum += st.pop();
		}
		
		System.out.println(sum);
	}
}