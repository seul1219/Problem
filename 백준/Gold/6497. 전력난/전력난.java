import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static int[] p;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st;
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			
			if(m==0 && n==0) {
				break;
			}
			
			Road[] road = new Road[n];
			int all = 0;
			for(int i=0; i<n; i++) {
				st = new StringTokenizer(br.readLine());
				
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				int z = Integer.parseInt(st.nextToken());
				
				all += z;
				
				road[i] = new Road(x, y, z);
			}
			
			p = new int[m+1];
			for(int i=0; i<m+1; i++) {
				p[i] = i;
			}
			
			Arrays.sort(road);
			
			int cnt = 0;
			int res = 0;
			
			for(int i=0; i<n; i++) {
				if(union(road[i].s, road[i].e)) {
					res += road[i].w;
					cnt++;
				}
				
				if(cnt==m-1) {
					break;
				}
			}
			
			System.out.println(all-res);
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
	
	public static class Road implements Comparable<Road> {
		int s;
		int e;
		int w;
		
		public Road(int s, int e, int w) {
			super();
			this.s = s;
			this.e = e;
			this.w = w;
		}
		
		@Override
		public int compareTo(Road o) {
			return this.w - o.w;
		}
	}
}