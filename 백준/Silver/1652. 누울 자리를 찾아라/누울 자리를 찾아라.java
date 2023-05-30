import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		char[][] cArr = new char[N][N];
		//일단 입력 저장하기
		for(int r=0; r<N; r++) {
			String str = br.readLine();
			for(int c=0; c<N; c++) {
				cArr[r][c] = str.charAt(c);
			}
		}
		
		//가로 검증
		int cnt = 0;
		for(int r=0; r<N; r++) {
			boolean flag = false;
			for(int c=0; c<N; c++) {
				if(c>0 && cArr[r][c-1]=='.' && cArr[r][c]=='.') {
					flag = true;
				}
				
				if(cArr[r][c]=='X' && flag == true) {
					cnt++;
					flag = false;
				}
				
				if(c==N-1 && flag == true) {
					cnt++;
				}
				
			}
		}
		
		//세로 검증
		int cnt2 = 0;
		for(int c=0; c<N; c++) {
			boolean flag = false;
			for(int r=0; r<N; r++) {
				if(r>0 && cArr[r-1][c]=='.' && cArr[r][c]=='.') {
					flag = true;
				}
				
				if(cArr[r][c]=='X' && flag == true) {
					cnt2++;
					flag = false;
				}
				
				if(r==N-1 && flag == true) {
					cnt2++;
				}
			}
		}
		
		System.out.println(cnt + " " + cnt2);
	}
}