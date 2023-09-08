import java.util.*;

import java.io.*;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int T = Integer.parseInt(br.readLine());

     int[] cnt = new int[T];

     

     for(int t=0; t<T; t++) {

       StringTokenizer st = new StringTokenizer(br.readLine());

       

       int P = Integer.parseInt(st.nextToken());

       int M = Integer.parseInt(st.nextToken());

       boolean[] visited = new boolean[M+1];

       

       for(int i=0; i<P; i++) {

         int tmp = Integer.parseInt(br.readLine());

         

         if(!visited[tmp]) {

           visited[tmp] = true;

         } else {

           cnt[t]++;

         }

       }

      }//T

      

      StringBuilder sb = new StringBuilder();

      for(int t=0; t<T; t++) {

        sb.append(cnt[t]).append("\n");

      }

      

      System.out.println(sb.toString());

    }

 }

