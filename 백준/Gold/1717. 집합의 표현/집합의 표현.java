import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static int[] p;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		p = new int[n+1];
		for(int i=0; i<n+1; i++) {
			p[i] = i;
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());

			int s = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(s==0) {
				union(a, b);
			} else if(s==1) {
				int x = findset(a);
				int y = findset(b);
				if(x!=y) {
					System.out.println("NO");
				} else {
					System.out.println("YES");
				}
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
}