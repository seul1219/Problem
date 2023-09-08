import java.util.*;

import java.io.*;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     StringBuilder sb = new StringBuilder();

     

     while(true) {

       

       StringTokenizer st = new StringTokenizer(br.readLine());

     

       int W = Integer.parseInt(st.nextToken());

       int H = Integer.parseInt(st.nextToken());

       

       if(W==0 && H==0) {

         break;

         

       } else {

         

         Queue<int[]> que = new LinkedList<>();

         boolean[][] visited = new boolean[H][W];

         char[][] apples = new char[H][W];

         for(int r=0; r<H; r++) {

           String str = br.readLine();

           for(int c=0; c<W; c++) {

             apples[r][c] = str.charAt(c);

           

             if(apples[r][c]=='A') {

               visited[r][c] = true;

               que.offer(new int[] {r, c});

             }

           }

         }

         

         int[] dr = {-1, 1, 0, 0};

         int[] dc = {0, 0, -1, 1};

         

         int cnt = 0;

         while(!que.isEmpty()) {

           int[] cur = que.poll();

           cnt++;

           

           for(int d=0; d<4; d++) {

             int nr = dr[d] + cur[0];

             int nc = dc[d] + cur[1];

             

             if(nr>=0 && nr<H && nc>=0 && nc<W) {

               if(apples[nr][nc]=='.' && !visited[nr][nc]) {

                 visited[nr][nc] = true;

                 que.offer(new int[] {nr, nc});

               }

             }

           }

         }//while

         

         sb.append(cnt).append("\n");

         

       }//else    

     }//true 

     

     System.out.println(sb.toString());

   }

}