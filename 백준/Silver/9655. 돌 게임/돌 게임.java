import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static int win = 0;
	public static boolean find = false;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		winner(N, 0);
		
		if(win%2==0) {
			System.out.print("CY");
		} else {
			System.out.println("SK");
		}
		
	}
	
	public static void winner(int stone, int person) {
		if(find) {
			return;
		}
		
		if(stone==0) {
			win = person;
			find = true;
		} else {
			if(stone>=3) {
				int nStone3 = stone-3;
				int nPerson3 = person+1;
				winner(nStone3, nPerson3);	
			}
			
			if(stone>=1) {
				int nStone1 = stone-1;
				int nPerson1 = person+1;
				winner(nStone1, nPerson1);
			}
		}
	}
}