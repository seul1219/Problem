import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static int[] p;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		Computer[] com = new Computer[M];
		
		StringTokenizer st;
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			com[i] = new Computer(s, e, w);
		}
		
		p = new int[N+1];
		for(int i=0; i<N+1; i++) {
			p[i] = i;
		}
		
		Arrays.sort(com);
		
		int res = 0;
		int cnt = 0;
		for(Computer computer : com) {
			if(union(computer.s, computer.e)) {
				res += computer.w;
				cnt++;
			}
			
			if(cnt==N-1) {
				break;
			}
		}

		System.out.println(res);
	}
	
	public static int findset(int x) {
		if(x==p[x]) {
			return x;
		} else {
			int y = findset(p[x]);
			p[x] = y;
			return y;
		}
	}
	
	public static boolean union(int x, int y) {
		x = findset(x);
		y = findset(y);
		
		if(x!=y) {
			p[y] = x;
			return true;
		} else {
			return false;
		}
	}
	
	public static class Computer implements Comparable<Computer>{
		int s;
		int e;
		int w;
		
		public Computer(int s, int e, int w) {
			super();
			this.s = s;
			this.e = e;
			this.w = w;
		}
		
		@Override
		public int compareTo(Computer o) {
			return this.w - o.w;
		}
	}
}