import java.util.*;

import java.io.*;

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     StringBuilder sb = new StringBuilder();

     

     int N = Integer.parseInt(br.readLine());  

     for(int i=1; i<=N; i++) {

       sb.append(i).append("\n");

     }

     

     System.out.println(sb.toString());

   }

 }

