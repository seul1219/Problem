import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=N; i>=4; i--) {
			String tmp = Integer.toString(i);
			char[] tArr = tmp.toCharArray();
			
			int cnt = 0;
			for(int j=0; j<tArr.length; j++) {
				int A = tArr[j]-'0';
				if(A==4 || A==7) {
					cnt++;
					continue;
				} else if(A!=4 && A!=7) {
					break;
				}
			}
			
			if(tmp.length()==cnt) {
				System.out.println(tmp);
				break;
			}
		}
	}
}