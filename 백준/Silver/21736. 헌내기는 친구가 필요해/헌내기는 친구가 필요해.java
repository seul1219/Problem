import java.util.*;

import java.io.*;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     StringTokenizer st = new StringTokenizer(br.readLine());

     

     int N = Integer.parseInt(st.nextToken());

     int M = Integer.parseInt(st.nextToken());

     

     int sr = 0;

     int sc = 0;

     char[][] map = new char[N][M];

     for(int r=0; r<N; r++) {

       String str = br.readLine();

       for(int c=0; c<M; c++) {

         map[r][c] = str.charAt(c);

         if(map[r][c]=='I') {

           sr = r;

           sc = c;

         }

       }

     }

     

     int[] dr = new int[] {1, 0, -1, 0};

     int[] dc = new int[] {0, 1, 0, -1};

     Queue<int[]> que = new LinkedList<>();

     boolean[][] visited = new boolean[N][M];

     visited[sr][sc] = true;

     que.offer(new int[] {sr, sc});

     

     int cnt = 0;

     while(!que.isEmpty()) {

       int[] cur = que.poll();

 

       if(map[cur[0]][cur[1]]=='P') {

         cnt++;

       }

       

       for(int d=0; d<4; d++) {

         int nr = dr[d] + cur[0];

         int nc = dc[d] + cur[1];

         

         if(nr>=0 && nr<N && nc>=0 && nc<M) {

           if(map[nr][nc]!='X'

             && !visited[nr][nc]) {

               visited[nr][nc] = true;

               que.offer(new int[] {nr, nc});

             }

         }

       }

     }

     

     if(cnt==0) {

       System.out.println("TT");

     } else {

       System.out.println(cnt);

     }

    }

 }

