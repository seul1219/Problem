import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] dice = new int[7];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<3; i++) {
			int idx = Integer.parseInt(st.nextToken());
			dice[idx]++;
		}
		
		boolean flag = false;
		boolean flag2 = false;
		boolean flag3 = true;
		
		int same1 = 0;
		int same2 = 0;
		int max = 0;
		for(int i=1; i<7; i++) {
			if(dice[i]==3) {
				flag = true;
				flag3 = false;
				same1 = i;
				break;
			} else if(dice[i]==2) {
				flag2 = true;
				flag3 = false;
				same2 = i;
				break;
			} else if(dice[i]==1) {
				max = Math.max(max, i);
			}
		}
		
		if(flag3) {
			System.out.println(max*100);
		} else if(flag2) {
			System.out.println(1000+same2*100);
		} else if(flag) {
			System.out.println(10000+same1*1000);
		}
	}
}