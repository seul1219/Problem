import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
   
public class Main {
	
	public static StringTokenizer st;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=0; tc<T; tc++) {
			st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			
			int[][] arr = new int[H+1][W+1];
			
			int idx = 1;
			for(int c=1; c<W+1; c++) {
				for(int r=H; r>=1; r--) {
					arr[r][c] = idx++;
				}
			}
			
			int N = Integer.parseInt(st.nextToken());
			
			for(int r=1; r<H+1; r++) {
				for(int c=1; c<W+1; c++) {
					if(N==arr[r][c]) {
						if(c<10) {
							System.out.println((H-r+1) + "0" + c);
						} else {
							System.out.println((H-r+1) + "" + c);
						}
					}
//					System.out.print(r+","+c + " "+ arr[r][c] + " ");	
				}
//				System.out.println();
			}
		}
	}
}
