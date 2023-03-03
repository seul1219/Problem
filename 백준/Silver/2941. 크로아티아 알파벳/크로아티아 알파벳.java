import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] arr = str.toCharArray();

        int cnt = 0;
        int idx = 0;
        while (idx < arr.length) {

            if (arr[idx] == 'c') {
                cnt++;
                idx++;
                if (idx < arr.length && (arr[idx] == '=' || arr[idx] == '-')) {
                    idx++;
                }
            } else if (arr[idx] == 'd') {
                cnt++;
                idx++;
                if (idx < arr.length - 1 && arr[idx] == 'z' && arr[idx + 1] == '=') {
                    idx += 2;
                } else if (idx < arr.length && arr[idx] == '-') {
                    idx++;
                }
            } else if (arr[idx] == 'l' || arr[idx] == 'n') {
                cnt++;
                idx++;
                if (idx < arr.length && arr[idx] == 'j') {
                    idx++;
                }
            } else if (arr[idx] == 's' || arr[idx] == 'z') {
                cnt++;
                idx++;
                if (idx < arr.length && arr[idx] == '=') {
                    idx++;
                }
            } else {
                cnt++;
                idx++;
            }
        }
        System.out.println(cnt);
    }
}