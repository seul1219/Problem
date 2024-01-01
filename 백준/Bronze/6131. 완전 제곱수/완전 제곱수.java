import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int num = 0;
        for(int i=1; i<501; i++) {
            double ans1 = Math.pow(i, 2);

            for(int j=1; j<501; j++) {
                if(ans1 == Math.pow(j, 2) + N) {
                    num++;
                }
            }
        }

        System.out.println(num);
    }
}