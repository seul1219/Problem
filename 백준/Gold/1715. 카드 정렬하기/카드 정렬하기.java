import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i=0; i<N; i++) {
			pq.offer(sc.nextInt());
		}
		
		int sum = 0;
		for(int i=0; i<N-1; i++) {
			int tmp = pq.poll();
			int tmp2 = pq.poll();
			pq.offer(tmp+tmp2);
			
			sum += tmp+tmp2;
		}
		System.out.println(sum);
	}
}