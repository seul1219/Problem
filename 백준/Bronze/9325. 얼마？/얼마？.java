import java.util.*;

import java.io.*;

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int T = Integer.parseInt(br.readLine());

     for(int t=0; t<T; t++) {

       int s = Integer.parseInt(br.readLine());

       int res = s;

       int n = Integer.parseInt(br.readLine());

       for(int i=0; i<n; i++) {

         StringTokenizer st = new StringTokenizer(br.readLine());

         int q = Integer.parseInt(st.nextToken());

         int p = Integer.parseInt(st.nextToken());

         

         res = res + (q*p);

       }

       System.out.println(res);

     }

   }

 }

