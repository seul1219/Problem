import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    public static StringTokenizer st;
    public static int N;
    public static int M;
    public static List<Integer>[] list;
    public static boolean[] visited;
    public static int[] cntArr;
    public static int res;
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        list = new ArrayList[N+1];
        for(int i=0; i<N+1; i++) {
            list[i] = new ArrayList<>();
        }
    
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            //B를 해킹하면 A도 해킹 가능
            list[A].add(B);
        }

        visited = new boolean[N+1];
        cntArr = new int[N+1];
        res = 0;
        
        for(int i=1; i<N+1; i++) {
        	visited = new boolean[N+1];
            hacking(i);
        }
        
        for(int i=1; i<N+1; i++) {
        	res = Math.max(res, cntArr[i]);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<N+1; i++) {
            if(cntArr[i]==res) {
                sb.append(i).append(" ");
            }
        }

        System.out.println(sb.toString());
     }

    public static void hacking(int i) {
        Queue<Integer> que = new LinkedList<>();
        que.offer(i);
        visited[i] = true;
        
        while(!que.isEmpty()) {
        	int cur = que.poll();
        	
        	for(int next : list[cur]) {
        		if(!visited[next]) {
        			que.offer(next);
        			visited[next] = true;
        			cntArr[next]++;
        		}
        	}
        }
    }
}