import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++) {
            Long num = Long.parseLong(br.readLine());

            boolean flag = false;
            for(int j=2; j<=1000000; j++) {
                if(num%j==0) {
                    flag = true;
                    break;
                }
            }

            if(flag) {
                sb.append("NO").append("\n");
            } else {
                sb.append("YES").append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}