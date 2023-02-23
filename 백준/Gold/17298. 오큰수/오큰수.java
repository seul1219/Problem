import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		int[] arr = new int[A];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Stack<Integer> st = new Stack<>();
		int[] result = new int[A];
		
		for(int i=0; i<arr.length; i++) {
			
			while(!st.isEmpty() && arr[st.peek()] < arr[i]) {
				int tmp = st.pop();
				result[tmp] = arr[i];
			}
				
			st.push(i);
		}
		
		while(!st.isEmpty()) {
			int tmp = st.pop();
			result[tmp] = -1;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int num : result) {
			sb.append(num).append(" ");
		}
		
		System.out.println(sb);
	}
}