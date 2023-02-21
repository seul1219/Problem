import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Queue<Integer> que = new LinkedList<>();
		
		int N = sc.nextInt();
		for(int i=1; i<=N; i++) {
			que.offer(i);
		}
		
		int cnt = 0;
		while(que.size() > 1) {
			++cnt;
			
			if(cnt==1) {
				que.remove();
			} else if(cnt==2) {
				que.offer(que.poll());
				cnt=0;
			}
		}
		
		System.out.println(que.poll());
	}
}