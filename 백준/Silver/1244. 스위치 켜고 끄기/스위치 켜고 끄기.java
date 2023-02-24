import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int button = sc.nextInt();
		int[] arr = new int[button];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
//		System.out.println(Arrays.toString(arr));
		
		int student = sc.nextInt();
		for(int r=0; r<student; r++) {
			int type = sc.nextInt();
			int num = sc.nextInt();
			if(type==1) {
				for(int i=num-1; i<button; i+=num) {
                    arr[i] = (arr[i] == 0) ? 1 : 0;
                }
//				System.out.println(Arrays.toString(arr));
			}
			else if(type==2) {
				arr[num-1] = (arr[num-1] == 0) ? 1 : 0;
				
				int left = num-2;
                int right = num;
                while (left>=0 && right<arr.length && arr[left] == arr[right]) {
                    arr[left] = (arr[left] == 0) ? 1 : 0;
                    arr[right] = (arr[right] == 0) ? 1 : 0;
                    left--;
                    right++;
                }
//				System.out.println(Arrays.toString(arr));
			}
		}
//		System.out.println(Arrays.toString(arr));
		
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			cnt++;
			if(cnt==20) {
				System.out.println();
				cnt=0;
			}
		}
		if(cnt!=0) {
			System.out.println();
		}
	}
}