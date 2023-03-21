import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static int N;
	public static int K;
	public static int res;
	
	public static void main(String[] args) {
		res = 0;
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		K = sc.nextInt();
		
		bfs();
		
		System.out.println(res);
	}

	public static void bfs() {
		
		boolean[] flag = new boolean[100001];
		
		Queue<int[]> que = new LinkedList<>();
		que.offer(new int[] {N, 0});
		
		while(!que.isEmpty()) {
			int[] arr = que.poll();
		
			if(arr[0] == K) {
				res = arr[1];
				break;
			}
			
			int num2 = arr[0]-1;
			int num3 = arr[0]+1;
			int num4 = 2*arr[0];
			
			if(num2>=0 && num2<=100000 && flag[num2]==false) {
				que.offer(new int[] {num2, arr[1]+1});
				flag[num2] = true;
			}
			if(num3>=0 && num3<=100000 && flag[num3]==false) {
				que.offer(new int[] {num3, arr[1]+1});
				flag[num3] = true;
			}
			if(num4>=0 && num4<=100000 && flag[num4]==false) {
				que.offer(new int[] {num4, arr[1]+1});
				flag[num4] = true;
			}
		}
	}
}