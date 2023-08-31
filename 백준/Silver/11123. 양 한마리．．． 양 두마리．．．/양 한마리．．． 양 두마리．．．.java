import java.util.*;

import java.io.*;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int T = Integer.parseInt(br.readLine());

     for(int t=0; t<T; t++) {

       StringTokenizer st = new StringTokenizer(br.readLine());

       

       int H = Integer.parseInt(st.nextToken());

       int W = Integer.parseInt(st.nextToken());

       

       char[][] map = new char[H][W];

       for(int r=0; r<H; r++) {

         String str = br.readLine();

         for(int c=0; c<W; c++) {

           map[r][c] = str.charAt(c);         

         }

       }

       

       int[] dr = {0, 0, -1, 1};

       int[] dc = {-1, 1, 0, 0};

       

       boolean[][] visited = new boolean[H][W];

       Queue<int[]> que = new LinkedList<>();

       

       int cnt = 0;

       for(int r=0; r<H; r++) {

         for(int c=0; c<W; c++) {

           if(map[r][c]=='#' && !visited[r][c]) {

             visited[r][c] = true;

             que.offer(new int[] {r, c});

             

             while(!que.isEmpty()) {

               int[] cur = que.poll();

               

               for(int d=0; d<4; d++) {

                 int nr = dr[d] + cur[0];

                 int nc = dc[d] + cur[1];

                 

                 if(nr>=0 && nr<H && nc>=0 && nc<W) {

                   if(!visited[nr][nc] && map[nr][nc]=='#') {

                     visited[nr][nc] = true;

                     que.offer(new int[] {nr, nc});

                   }

                 }

               }

             }//que

             

             cnt++;

           }

         }

       }

       

       System.out.println(cnt);

     }//T  

    }

 }

