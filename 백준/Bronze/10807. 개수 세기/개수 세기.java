import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[202];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			
			if(tmp<0) {
				arr[Math.abs(tmp)+100]++;
			} else {
				arr[tmp]++;
			}
		}
		
		int v = Integer.parseInt(br.readLine());
		if(v<0) {
			System.out.println(arr[Math.abs(v)+100]);
		} else {
			System.out.println(arr[v]);
		}
	}
}