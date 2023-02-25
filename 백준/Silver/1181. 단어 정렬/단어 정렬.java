import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        String[] arr = new String[N];
        for(int i=0; i<N; i++) {
            arr[i] = br.readLine();
        }
        
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
            	//길이가 같으면
                if(s1.length() == s2.length()) {
                    for (int i = 0; i < s1.length(); i++) {
                        char c1 = s1.charAt(i);
                        char c2 = s2.charAt(i);
                        if (c1 != c2) {
                        	//사전 순
                            return c1 - c2;
                        }
                    }
                    //동일하면
                    return 0;
                }
                //길이 짧은 순
                return s1.length() - s2.length();
            }
        });
        
        for (int i = 0; i < N; i++) {
            if (i == 0 || !arr[i].equals(arr[i - 1])) {
                sb.append(arr[i]).append("\n");
            }
        }
        
        System.out.print(sb.toString());
    }
}