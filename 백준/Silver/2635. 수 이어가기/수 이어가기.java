import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int max = 0;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=N; i>0; i--) {
			int num = N;
			int tmp = i;
			
			ArrayList<Integer> tmpList = new ArrayList<>();
			tmpList.add(N);
			tmpList.add(i);
			
			while(true) {
				int tmp2 = num-tmp;
				
				if(tmp2>=0) {
					tmpList.add(tmp2);
				} else {
					break;
				}
				
				num = tmp;
				tmp = tmp2;
			}
			
			if(max<tmpList.size()) {
				max = tmpList.size();
				list = tmpList;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(max).append("\n");
		
		for(int i=0; i <list.size(); i++) {
			sb.append(list.get(i)).append(" ");
		}
		
		System.out.println(sb.toString());
	}
}