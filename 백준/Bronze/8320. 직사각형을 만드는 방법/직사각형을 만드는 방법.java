import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		//1개로 만들 수 있는 직사각형 N개
		int cnt = N;
		
		//2개 이상으로 만들 수 있는 직사각형
		int i = 2;
		while(i<N) {
			int tmp = N;
			while(tmp>=i*i && tmp<=N) {
				tmp = tmp-i;
				cnt++;
			}
			i++;
		}
		System.out.println(cnt);
	}

}