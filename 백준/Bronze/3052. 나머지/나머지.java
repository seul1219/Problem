import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[42];
		
		for(int i=0; i<10; i++) {
			int tmp = sc.nextInt();
			arr[tmp%42]++;
		}
		
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}