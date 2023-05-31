import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] sArr = new String[N];
		int[] arr = new int[N];

		for(int i=0; i<N; i++) {
			String tmp = br.readLine();
			StringTokenizer st = new StringTokenizer(tmp);
			
			String name = st.nextToken();
			String day = st.nextToken();
			if(Integer.parseInt(day)<10) {
				day = "0" + day;
			}
			String mon = st.nextToken();
			if(Integer.parseInt(mon)<10) {
				mon = "0" + mon;
			}
			String year = st.nextToken();
			
			//이름을 저장
			sArr[i] = name;
			
			//생일을 저장
			String birth = year + mon + day;
			arr[i] = Integer.parseInt(birth);
		}
		
		//각 인덱스를 활용해 가장 나이가 많은 사람, 적은 사람 추려내기
		int max = 0;
		int maxIdx = 0;
		for(int i=0; i<N; i++) {
			if(max<arr[i]) {
				max = arr[i];
				maxIdx = i;
			}
		}
		
		int min = Integer.MAX_VALUE;
		int minIdx = 0;
		for(int i=0; i<N; i++) {
			if(min>arr[i]) {
				min = arr[i];
				minIdx = i;
			}
		}
		
		System.out.println(sArr[maxIdx]);
		System.out.println(sArr[minIdx]);
	}
}