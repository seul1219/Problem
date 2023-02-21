import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Queue<Integer> que = new LinkedList<>();
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			que.offer(i);
		}
		
		int cnt = 0;
		
		System.out.print("<");
		while(que.size() > 1) {
			++cnt;
			if(cnt==K) {
				System.out.print(que.poll() + ", ");
				cnt=0;
			} else {
				que.offer(que.poll());
			}
		}
		System.out.print(que.poll());
		System.out.println(">");
	}
}