import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
			Queue<Integer> que2 = new LinkedList<>();
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[] arr = new int[N];
			
			for(int j=0; j<N; j++) {
				int num = sc.nextInt();
				arr[j] = num;
				que.offer(num);
				que2.offer(j);
			}
			
			int cnt = 1;
			int[] result = new int[N];
			while(!que.isEmpty()) {
				if(que.peek() == arr[que2.peek()]) {
					result[que2.peek()]=cnt++;
					que.poll();
					que2.poll();
					
				} else {
					que2.offer(que2.poll());
				}
			}
			
			System.out.println(result[M]);
		}
	}
}