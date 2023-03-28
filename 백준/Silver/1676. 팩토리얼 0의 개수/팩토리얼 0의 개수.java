import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		BigInteger res = new BigInteger("1");
		for(int i=N; i>=1; i--) {
			BigInteger value = BigInteger.valueOf(i);
			res = res.multiply(value);
		}
//		System.out.println(res);
		
		int cnt = 0;
		char[] cArr = String.valueOf(res).toCharArray();
		for(int i=cArr.length-1; i>=0; i--) {
			if(cArr[i]!='0') {
				break;
			} else if(cArr[i]=='0') {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}