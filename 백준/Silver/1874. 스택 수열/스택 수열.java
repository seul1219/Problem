import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Stack<Integer> st = new Stack<>();
		
		int idx = 0;
		boolean flag = true;
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=n; i++) {
			st.push(i);
			sb.append('+').append('\n');
			
			while(!st.isEmpty() && st.peek() == arr[idx]) {
				st.pop();
				sb.append('-').append('\n');
				idx++;
			}
			
			if(!st.isEmpty()) {
				flag = false;
			}
		}
		
		if(!st.isEmpty() && flag == false) {
			System.out.println("NO");
		} else {
			System.out.print(sb);
		}
	}
}