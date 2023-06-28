import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> que = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int abs1 = Math.abs(o1);
                int abs2 = Math.abs(o2);

                if (abs1==abs2) {
                    return Integer.compare(o1, o2);
                } else {
                    return Integer.compare(abs1, abs2);
                }
            }
        });
        
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<N; i++) {
            int tmp = Integer.parseInt(br.readLine());
            
            if (tmp==0 && que.isEmpty()) {
                sb.append("0\n");
                
            } else if (tmp==0 && !que.isEmpty()) {
                sb.append(que.poll()).append("\n");
                
            } else {
                que.offer(tmp);
            }
        }

        System.out.println(sb.toString());
    }
}