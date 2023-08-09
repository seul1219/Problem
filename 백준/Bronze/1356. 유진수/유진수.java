import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		
		List<String> numArr1 = new ArrayList<>();
		String tmp1 = "";
		for(int i=0; i<num.length()-1; i++) {
			tmp1 += num.charAt(i);
			numArr1.add(tmp1);
		}
		
		List<String> numArr2 = new ArrayList<>();
		String tmp2 = "";
		for(int i=num.length()-1; i>0; i--) {
			tmp2 += num.charAt(i);
			numArr2.add(tmp2);
		}
		
		boolean flag = false;
		for(int i=0; i<numArr1.size(); i++) {
			String num1 = numArr1.get(i);
			String num2 = numArr2.get(numArr2.size()-1-i);
			
			int res1 = 1;
			for(int j=0; j<num1.length(); j++) {
				res1 *= num1.charAt(j)-'0';
			}
			
			int res2 = 1;
			for(int j=0; j<num2.length(); j++) {
				res2 *= num2.charAt(j)-'0';
			}
			
			if(res1==res2) {
				flag = true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}