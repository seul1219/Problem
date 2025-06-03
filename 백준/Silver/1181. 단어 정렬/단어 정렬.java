import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        Set<String> set = new HashSet<>();
        for (int i=0; i<N; i++) {
            set.add(br.readLine());
        }
        
        List<String> list = new ArrayList<>(set);
        list.sort((s1, s2) -> {
            if(s1.length()!=s2.length()) {
                return s1.length() - s2.length();
            } else {
                return s1.compareTo(s2);
            }
        });
        
        for (String s : list) {
            sb.append(s).append("\n");
        }

        System.out.print(sb.toString());
    }
}