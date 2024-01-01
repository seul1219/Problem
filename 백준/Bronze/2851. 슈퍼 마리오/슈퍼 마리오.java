import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        int sum = 0;
        int[] sumArr = new int[10];
        for(int i=0; i<10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            sumArr[i] = sum;
        }

        int[] adjArr = new int[10];
        for(int i=0; i<10; i++) {
            adjArr[i] = sumArr[i]-100;
            if(adjArr[i]<0) {
                adjArr[i] = adjArr[i] * -1;
            }
        }

        int ans = Integer.MAX_VALUE;
        int num = 0;
        for(int i=0; i<10; i++) {
            if(adjArr[i]<=ans) {
                ans = adjArr[i];
                num = i;
            }
        }

        System.out.println(sumArr[num]);
    }
}