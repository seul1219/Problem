import java.util.*;

import java.io.*;

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int N = Integer.parseInt(br.readLine());

     

     int res = 0;

     for(int i=1; i<=N; i++) {

       res += i;

     }

     

     System.out.println(res);

   }

 }