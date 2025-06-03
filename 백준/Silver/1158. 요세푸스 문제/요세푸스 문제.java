import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		Queue<Integer> que = new LinkedList<>();
		
		for(int i=1; i<=N; i++) {
			que.offer(i);
		}
//		System.out.println(que.toString());
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("<");
		int res = 0;
		int cnt = 0;
		while(que.size()>1) {
			if(cnt==K-1) {
				res = que.poll();
				cnt=0;
				sb.append(res).append(", ");
			} else {
				que.offer(que.poll());
				cnt++;
			}
		}
		
		while(!que.isEmpty()) {
			sb.append(que.poll());
		}
		
		sb.append(">");
		
		System.out.println(sb.toString());
	}
}