import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[5][5];
		
		for(int r=0; r<5; r++) {
			for(int c=0; c<5; c++) {
				arr[r][c] = sc.nextInt();
			}
		}
		
		int res = 0;
		int cnt = 0;
		int bingo = 0;
		int[] rCnt = new int[5];
		int[] cCnt = new int[5];
		int[] dCnt = new int[2];
		
		while(cnt<25) {
			int tmp = sc.nextInt();
		
			for(int r=0; r<5; r++) {
				L: for(int c=0; c<5; c++) {
					
					if(arr[r][c]!=tmp) { 
						continue L;
					} else if(arr[r][c]==tmp) { 
						arr[r][c] = 0;
					}
					
					if(arr[r][c] == 0) {
						cCnt[c]++;
						rCnt[r]++;
						
						if(r==c) {
							dCnt[0]++;
						}
						if(r+c==4) {
							dCnt[1]++;
						}
					}
					
					if(cCnt[0]==5) {
						bingo++;
						cCnt[0]=10;
					} else if(cCnt[1]==5) {
						bingo++;
						cCnt[1]=10;
					} else if(cCnt[2]==5) {
						bingo++;
						cCnt[2]=10;
					} else if(cCnt[3]==5) {
						bingo++;
						cCnt[3]=10;
					} else if(cCnt[4]==5) {
						bingo++;
						cCnt[4]=10;
					}
					
					if(rCnt[0]==5) {
						bingo++;
						rCnt[0]=10;
					} else if(rCnt[1]==5) {
						bingo++;
						rCnt[1]=10;
					} else if(rCnt[2]==5) {
						bingo++;
						rCnt[2]=10;
					} else if(rCnt[3]==5) {
						bingo++;
						rCnt[3]=10;
					} else if(rCnt[4]==5) {
						bingo++;
						rCnt[4]=10;
					}
					
					if(dCnt[0]==5) {
						bingo++;
						dCnt[0]=10;
					}
					
					if(dCnt[1]==5) {
						bingo++;
						dCnt[1]=10;
					}
					
				}
			}
			
			cnt++;
			
			if(bingo>=3) {
				res = cnt;
				break;
			}
		}
		System.out.println(res);
	}
}