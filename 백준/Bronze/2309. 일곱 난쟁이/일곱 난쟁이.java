import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int sum = 0;
        for(int i=0; i<9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        int ans = sum-100;
        Arrays.sort(arr);

        int ans1 = 0;
        int ans2 = 0;
       R: for(int i=0; i<8; i++) {
            for(int j=i+1; j<9; j++) {

                if(arr[i] + arr[j] == ans) {
                    ans1 = i;
                    ans2 = j;
                    break R;
                }
            }
        }

        for(int i=0; i<9; i++) {
            if(i!=ans1 && i!=ans2) {
                System.out.println(arr[i]);
            }
        }
    }
}