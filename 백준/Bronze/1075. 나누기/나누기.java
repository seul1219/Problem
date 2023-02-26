import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String N = sc.next();
		int[] arr = new int[N.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = N.charAt(i)-'0';
		}
//		System.out.println(Arrays.toString(arr));
		
		int F = sc.nextInt();
		
		String newN = "";
		for(int i=0; i<arr.length-2; i++) {
			newN += String.valueOf(arr[i]);
		}
		for(int i=arr.length-2; i<arr.length; i++) {
			newN += "0";
		}
//		System.out.println(newN);
		
		int res = Integer.parseInt(newN);
		while(true) {
			if(res % F == 0) {
				break;
			}
			res++;
		}
//		System.out.println(res);
		
		StringBuilder sb = new StringBuilder();
		String result = String.valueOf(res);
		for(int i=result.length()-2; i<result.length(); i++) {
			char c = result.charAt(i);
			sb.append(c);
		}
		System.out.println(sb.toString());
	}
}