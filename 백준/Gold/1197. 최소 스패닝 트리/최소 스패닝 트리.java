import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static StringTokenizer st;
	public static int V;
	public static int E;
	public static Node[] list;
	public static int[] p;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		st = new StringTokenizer(br.readLine());
		
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		
		//노드 정보 저장
		list = new Node[E];
		for(int i=0; i<E; i++) {
			st = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			list[i] = new Node(A, B, C);
		}
		
		//오름차순 정렬
		Arrays.sort(list);

		//makeset
		p = new int[V+1];
		for(int i=0; i<V+1; i++) {
			p[i] = i;
		}
		
		int res = 0;
		int cnt = 0;
		
		for(Node node : list) {
			if(union(node.s, node.e)) {
				res += node.w;
				cnt++;
			}
			
			if(cnt==V-1) {
				System.out.println(res);
				return;
			}
		}
	}
	
	public static int findset(int x) {
		//본인이 루트노드면 바로 반환
		if(x==p[x]) {
			return x;
		} else {
			//아니면 재귀로 루트노드 찾아서 저장 및 반환
			int y = findset(p[x]);
			p[x] = y;
			return y;
		}
	}
	
	public static boolean union(int x, int y) {
		x = findset(x);
		y = findset(y);
		
		//둘이 다른 집합이면
		if(x!=y) {
			//x집합에 y집합 합치기
			//y의 부모를 x로 설정
			p[y] =x;
			return true;
		} else {
			return false;
		}
	}
	
	public static class Node implements Comparable<Node> {
		int s;
		int e;
		int w;
		
		public Node(int s, int e, int w) {
			super();
			this.s = s;
			this.e = e;
			this.w = w;
		}
		
		@Override
		public int compareTo(Node o) {
			return this.w - o.w;
		}
	}
}