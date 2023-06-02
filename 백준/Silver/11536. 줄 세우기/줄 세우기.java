import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		//알파벳 순서대로 정렬
		PriorityQueue<String> pq = new PriorityQueue<>();
		for(int i=0; i<N; i++) {
			arr[i] = br.readLine();
			pq.offer(arr[i]);
		}
		
		String[] arr2 = new String[N];
		int i=0;
		while(!pq.isEmpty()) {
			String str = pq.poll();
			arr2[i] = str;
			i++;
		}
		
		//오름차순
		boolean flag = true;
		for(int j=0; j<N; j++) {
			//이 아닌 경우
			if(!arr2[j].equals(arr[j])) {
				flag = false;
			}
		}
		
		//내림차순
		boolean flag2 = true;
		for(int j=N-1; j>=0; j--) {
			//이 아닌 경우
			if(!arr2[j].equals(arr[N-1-j])) {
				flag2 = false;
			}
		}
		
		if(!flag && flag2) {
			System.out.println("DECREASING");
		} else if(!flag2 && flag) {
			System.out.println("INCREASING");
		} else if(!flag && !flag2){
			System.out.println("NEITHER");
		}
	}
}