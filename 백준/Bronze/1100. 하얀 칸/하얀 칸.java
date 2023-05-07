import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[][] cArr = new char[8][8];
		int cnt = 0;
		for(int r=0; r<8; r++) {
			String str = br.readLine();
			
			for(int c=0; c<8; c++) {
				cArr[r][c] = str.charAt(c);
				
				if(r%2==0 && (c==0 || c==2 || c==4 || c==6)) {
					if(cArr[r][c]=='F') {
						cnt++;
					}
				} else if(r%2==1 && (c==1 || c==3 || c==5 || c==7)) {
					if(cArr[r][c]=='F') {
						cnt++;
					}
				}
			}
		}
		
		System.out.println(cnt);
	}
}