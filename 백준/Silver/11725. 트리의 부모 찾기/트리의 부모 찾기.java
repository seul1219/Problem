import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class Main {
    
   public static void main(String args[]) throws IOException { 
     
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
     int N = Integer.parseInt(br.readLine());
     List<Integer>[] adjList = new ArrayList[N+1];
     for(int i=0; i<=N; i++) {
    	 adjList[i] = new ArrayList<>();
     }
     for(int i=0; i<N-1; i++) {
       StringTokenizer st = new StringTokenizer(br.readLine());
       
       int A = Integer.parseInt(st.nextToken());
       int B = Integer.parseInt(st.nextToken());
       
       adjList[A].add(B);
       adjList[B].add(A);
     }
     
     int[] parent = new int[N+1];
     boolean[] visited = new boolean[N+1];
     Queue<Integer> que = new LinkedList<>();
     que.offer(1);
     visited[1] = true ;
     while(!que.isEmpty()) {
       int num = que.poll();     
       
       for(int c:adjList[num]) {
    	   if(!visited[c]) {
    		   visited[c] = true;
    		   parent[c] = num;
    		   que.offer(c);
    	   }
       }
     }
     
     StringBuilder sb = new StringBuilder();
     for(int i=2; i<=N; i++) {
       sb.append(parent[i]).append("\n");
     }
     
     System.out.println(sb.toString());
    }
 }
