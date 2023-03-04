import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int sum = 1;
		int res = 0;
		int cnt = 0;
		
		if(N==1) {
			System.out.println(1);
		} else {
			while(true) {
				int tmp = sum + (cnt*6);
				
				if(N>sum && N<=tmp) {
					res=cnt;
					break;
				}
				
				sum = tmp;
				cnt++;
			}
			System.out.println(res+1);
		}
	}
}