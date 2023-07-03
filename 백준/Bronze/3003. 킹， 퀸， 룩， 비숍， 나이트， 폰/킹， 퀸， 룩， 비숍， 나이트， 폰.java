import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String[] args) throws IOException {
		
		int[] arr = new int[6];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 2;
		arr[4] = 2;
		arr[5] = 8;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] chess = new int[6];
		for(int i=0; i<6; i++) {
			chess[i] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<6; i++) {
			sb.append(arr[i]-chess[i]).append(" ");
		}
		
		System.out.println(sb.toString());
	}
}