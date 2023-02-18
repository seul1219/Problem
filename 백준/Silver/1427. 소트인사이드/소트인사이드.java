import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String N = br.readLine();
		char[] arr = N.toCharArray();
		
		for(int i=0; i<arr.length-1; i++) {
			int maxIdx = i;
			
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]-'0' > arr[maxIdx]-'0') {
					maxIdx = j;
				}
			}
			
			char tmp = arr[maxIdx];
			arr[maxIdx] = arr[i];
			arr[i] = tmp;
		}

		for(int i=0; i<arr.length; i++) {
			bw.write(arr[i]);
		}
		
		bw.flush();
		bw.close();
	}
}