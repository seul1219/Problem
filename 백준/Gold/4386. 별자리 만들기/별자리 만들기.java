import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

//처음에 각 별의 정보를 double, double로 저장
//별들을 이은 선의 정보를 int, int, double로 저장
public class Main {
	
	public static int[] p;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//별의 개수
		int n = Integer.parseInt(br.readLine());
		
		//별 정보 저장
		StringTokenizer st;
		List<double[]>[] star = new ArrayList[n+1];
		for(int i=0; i<n+1; i++) {
			star[i] = new ArrayList<>();
		}
		
		for(int i=1; i<n+1; i++) {
			st = new StringTokenizer(br.readLine());
			double x = Double.parseDouble(st.nextToken());
			double y = Double.parseDouble(st.nextToken());
			
			star[i].add(new double[] {x, y});
		}
		
		//별 2개를 뽑아서 두 별 사이의 거리 저장
		List<Universe> universe = new ArrayList<>();
		for(int i=1; i<n; i++) {
			double[] cur = star[i].get(0);
			for(int j=2; j<n+1; j++) {
				double[] next = star[j].get(0);
				
				double dis = Math.sqrt( Math.pow(cur[0]-next[0], 2)+ Math.pow(cur[1]-next[1], 2) );
			
				universe.add(new Universe(i, j, dis));
			}
		}
		
		//각 별들의 부모
		p = new int[n+1];
		for(int i=0; i<n+1; i++) {
			p[i] = i;
		}
		
		Collections.sort(universe);
		
		double res = 0;
		int cnt = 0;
		while(true) {
			if(cnt==n-1) {
				break;
			}
			
			for(Universe uni : universe) {
				if(union(uni.s, uni.e)) {
					res += uni.dis;
					cnt++;
				}
			}
		}
		
		System.out.printf("%.2f", res);
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
	
	public static class Universe implements Comparable<Universe>{
		int s;
		int e;
		double dis;
		
		public Universe(int s, int e, double dis) {
			super();
			this.s = s;
			this.e = e;
			this.dis = dis;
		}
		
		@Override
		public int compareTo(Universe o) {
			return this.dis>o.dis?1:-1;
		}
	}
}