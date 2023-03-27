import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		boolean[] flag = new boolean[100001];
		
		PriorityQueue<int[]> que = new PriorityQueue<int[]>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1] - o2[1];
			}
		});
		que.offer(new int[] {N, 0});
		
		while(!que.isEmpty()) {
			int[] cur = que.poll();
			
			if(cur[0]==K) {
				System.out.println(cur[1]);
				break;
			}
			
			if(flag[cur[0]]==false) {
				flag[cur[0]] = true;
				if(cur[0]+1>=0 && cur[0]+1<=100000) {
					que.offer(new int[] {cur[0]+1, cur[1]+1});
				}
				if(cur[0]-1>=0 && cur[0]-1<=100000) {
					que.offer(new int[] {cur[0]-1, cur[1]+1});
				}
				if(cur[0]*2>=0 && cur[0]*2<=100000) {
					que.offer(new int[] {cur[0]*2, cur[1]});
				}
			}
		}
	}
}