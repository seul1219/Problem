import java.util.*;

import java.io.*;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     StringBuilder sb = new StringBuilder();

     

     int T = Integer.parseInt(br.readLine());

     for(int t=0; t<T; t++) {

       StringTokenizer st = new StringTokenizer(br.readLine());

       

       int R = Integer.parseInt(st.nextToken());

       int C = Integer.parseInt(st.nextToken());

       

       char[][] map = new char[R][C];

       int sr = 0;

       int sc = 0;

       for(int r=0; r<R; r++) {

         String str = br.readLine();

         for(int c=0; c<C; c++) {

           map[r][c] = str.charAt(c);

           

           if(map[r][c]=='S') {

             sr = r;

             sc = c;

           }            

         }

       }//for   

       

       int[] dr = new int[] {-1, 1, 0, 0};

       int[] dc = new int[] {0, 0, -1, 1};

       

       Queue<int[]> que = new LinkedList<>();

       boolean[][] visited = new boolean[R][C];

       visited[sr][sc] = true;

       que.offer(new int[] {sr, sc, 0});

       

       int res = 0;

       boolean flag = false;

       while(!que.isEmpty()) {

         int[] cur = que.poll();

         

         if(map[cur[0]][cur[1]]=='G') {

           res = cur[2];

           flag = true;

           break;

         }

         

         for(int d=0; d<4; d++) {

           int nr = dr[d] + cur[0];

           int nc = dc[d] + cur[1];

           

           if(nr>=0 && nr<R && nc>=0 && nc<C) {

             if(map[nr][nc]!='X' && !visited[nr][nc]) {

               visited[nr][nc] = true;

               que.offer(new int[] {nr, nc, cur[2]+1});

             }

           }

         }

       }

       

       if(flag) {

         sb.append("Shortest Path: ").append(res).append("\n");

       } else {

         sb.append("No Exit").append("\n");

       }      

     }//T

     

     System.out.println(sb.toString());

    }

 }

