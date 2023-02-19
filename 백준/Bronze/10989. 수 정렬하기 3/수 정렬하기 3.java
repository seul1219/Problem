import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		int max = 0;
		for(int i=0; i<N; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		int[] arr2 = new int[max+1];
		for(int i=0; i<arr.length; i++) {
			arr2[arr[i]]++;
		}
		
		for(int i=1; i<arr2.length; i++) {
			arr2[i] += arr2[i-1];
		}
		
		int[] res = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			res[arr2[arr[i]]-1] = arr[i];
			arr2[arr[i]]--;
		}
		
		for(int i=0; i<res.length; i++) {
			
			if(i==res.length-1) {
				bw.write(Integer.toString(res[i]));
			} else {
				bw.write(Integer.toString(res[i]) + "\n");
			}
		}
		bw.flush();
		bw.close();
	} 
}