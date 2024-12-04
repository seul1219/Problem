import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = 0;
        for(int i=1; i<N; i++) {
            for(int j=3; j<N; j++) {
                for(int k=1; k<N; k++) {
                    if (N - (i+j+k)==0 && j>=i+2 && k%2==0) {
                        num++;
                    }
                }
            }
        }

        System.out.println(num);
    }
}