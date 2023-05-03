import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		char[][] arr = new char[5][15];
		PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1]!=o2[1]? o1[1]-o2[1] : o1[0]-o2[0];
			}
		});
		
		for(int i=0; i<5; i++) {
			String str = br.readLine();
			
			for(int j=0; j<str.length(); j++) {
				arr[i][j] = str.charAt(j);
				pq.add(new int[] {i, j});
			}
		}
		
		while(!pq.isEmpty()) {
			int[] cur = pq.poll();
			sb.append(arr[cur[0]][cur[1]]);
		}
		
		System.out.println(sb.toString());
	}
}