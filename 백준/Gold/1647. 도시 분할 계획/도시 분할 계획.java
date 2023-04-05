import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static StringTokenizer st;
	public static int N;
	public static int M;
	public static House[] house;
	public static int[] p;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		house = new House[M];
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			house[i] = new House(A, B, C);
		}
		
		p = new int[N+1];
		for(int i=1; i<N+1; i++) {
			p[i] = i;
		}
		
		Arrays.sort(house);
		
		int res = 0;
		int cnt = 0;
		for(int i=0; i<M; i++) {
			if(union(house[i].houseA, house[i].houseB)) {
				res += house[i].cost;
				cnt++;
			}
			
			if(cnt==N-2) {
				System.out.println(res);
				return;
			}
		}
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
	
	public static class House implements Comparable<House>{
		int houseA;
		int houseB;
		int cost;
		
		public House(int houseA, int houseB, int cost) {
			super();
			this.houseA = houseA;
			this.houseB = houseB;
			this.cost = cost;
		}
		
		@Override
		public int compareTo(House o) {
			return this.cost - o.cost;
		}
	}
}