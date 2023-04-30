import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[9][9];
		int max = 0;
		int rIdx = 0;
		int cIdx = 0;
		for(int r=0; r<9; r++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int c=0; c<9; c++) {
				arr[r][c] = Integer.parseInt(st.nextToken());
				if(max < arr[r][c]) {
					max = arr[r][c];
					rIdx = r;
					cIdx = c;
				}
			}
		}
		
		System.out.println(max);
		System.out.println((rIdx+1) + " " + (cIdx+1));
	}
}