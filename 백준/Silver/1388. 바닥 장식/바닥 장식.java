import java.io.*;
import java.util.*;

public class Main {
  
   public static int R;
   public static int C;
   public static char[][] map;
   public static boolean[][] visited;
   public static int cnt = 0;
   
   public static void main(String args[]) throws IOException { 
     
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
     StringTokenizer st = new StringTokenizer(br.readLine());
     
     R = Integer.parseInt(st.nextToken());
     C = Integer.parseInt(st.nextToken());
     
     map = new char[R][C];
     visited = new boolean[R][C];
     for(int r=0; r<R; r++) {
       String str = br.readLine();
       for(int c=0; c<C; c++) {
         map[r][c] = str.charAt(c);
       }
     }
     
     for(int r=0; r<R; r++) {
       for(int c=0; c<C; c++) {
         if(map[r][c]=='-' && !visited[r][c]) {
           visited[r][c] = true;
           dfs1(r, c, map[r][c]);
         } else if(map[r][c]=='|' && !visited[r][c]) {
           visited[r][c] = true;
           dfs2(r, c, map[r][c]);
         }
       }
     }
     
     System.out.println(cnt);
   }
   
   public static void dfs2(int r, int c, char ch) {
       int nr = r+1;
         
       if(nr>=0 && nr<R &&
        !visited[nr][c] && map[nr][c]==ch) {
         visited[nr][c] = true;
         dfs2(nr, c, ch);       
       } else {
         cnt++;
         return;
       }
   }
   
   public static void dfs1(int r, int c, char ch) {
       int nc = c+1;
         
       if(nc>=0 && nc<C && 
         !visited[r][nc] && map[r][nc]==ch) {
         visited[r][nc] = true;         
         dfs1(r, nc, ch);
       } else {
         cnt++;
         return;
       }
   }
}