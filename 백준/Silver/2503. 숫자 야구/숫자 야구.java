import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][3];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = st.nextToken();
        }

        int ans = 0;
        for(int i=1; i<10; i++) {
            for(int j=1; j<10; j++) {
                for(int k=1; k<10; k++) {

                    if(i==j || j==k || k==i)
                        continue;

                    int cnt = 0;
                    for(int n=0; n<N; n++) {
                        int strike = 0;
                        int ball = 0;

                        int[] num = new int[3];
                        num[0] = Integer.parseInt(String.valueOf(arr[n][0].charAt(0)));
                        num[1] = Integer.parseInt(String.valueOf(arr[n][0].charAt(1)));
                        num[2] = Integer.parseInt(String.valueOf(arr[n][0].charAt(2)));

                        if(i==num[0]) {
                            strike++;
                        }
                        if(j==num[1]) {
                            strike++;
                        }
                        if(k==num[2]) {
                            strike++;
                        }

                        if(i==num[1] || i==num[2]) {
                            ball++;
                        }
                        if(j==num[0] || j==num[2]) {
                            ball++;
                        }
                        if(k==num[0] || k==num[1]) {
                            ball++;
                        }

                        if(strike==Integer.parseInt(arr[n][1])
                                && ball==Integer.parseInt(arr[n][2])) {
                            cnt++;
                        }
                    }

                    if(cnt==N) {
                        ans++;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}