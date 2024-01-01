import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());

        double D = Math.pow(A, 2)-B;
        int ans1 = (int) (A*-1 + Math.sqrt(D));
        int ans2 = (int) (A*-1 - Math.sqrt(D));

        if(ans1==ans2) {
            System.out.println(ans1);
        } else {
            int num1 = ans1<ans2 ? ans1 : ans2;
            int num2 = ans1<ans2 ? ans2 : ans1;

            System.out.println(num1 + " " + num2);
        }
    }
}