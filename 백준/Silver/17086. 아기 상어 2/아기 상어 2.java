import java.util.*;
import java.io.*;

public class Main
 {
   public static void main(String args[]) throws IOException
   { 
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
     StringTokenizer st = new StringTokenizer(br.readLine());
     int n = Integer.parseInt(st.nextToken());
     int m = Integer.parseInt(st.nextToken());
     
     int[][] map = new int[n][m];
     List<int[]> locList = new ArrayList<>();
     for(int r=0; r<n; r++) {
       StringTokenizer st2 = new StringTokenizer(br.readLine());
       for(int c=0; c<m; c++) {
         map[r][c] = Integer.parseInt(st2.nextToken());
         if(map[r][c]==1) {
           locList.add(new int[] {r, c});
         }
       }
     }
     
     int[] dr = new int[] {-1, -1, -1, 0, 0, 1, 1, 1};
     int[] dc = new int[] {-1, 0, 1, -1, 1, -1, 0, 1};
     
     int max = 0;
     for(int r=0; r<n; r++) {
    	 for(int c=0; c<m; c++) {
    		 if(map[r][c]==0) {
    			 Queue<int[]> que = new LinkedList<>();
    			 boolean[][] visited = new boolean[n][m];
    			 visited[r][c] = true;
    			 que.offer(new int[] {r, c, 0});
    			 
    			 while(!que.isEmpty()) {
    				 int[] cur = que.poll();
    				 
    				 if(map[cur[0]][cur[1]]==1) {
    					 max = Math.max(cur[2], max);
    					 break;
    				 }
    				 
    				 for(int d=0; d<8; d++) {
    					 int nr = dr[d] + cur[0];
    					 int nc = dc[d] + cur[1];
    					 
    					 if(nr>=0 && nr<n && nc>=0 && nc<m) {
    						 if(!visited[nr][nc]) {
    							 visited[nr][nc] = true;
    							 que.offer(new int[] {nr, nc, cur[2]+1});
    						 }
    					 }
    				 }
    			 }
    		 }
    	 }
     }
     
     System.out.println(max);
   }
 }