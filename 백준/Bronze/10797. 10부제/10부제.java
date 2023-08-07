import java.util.*;

import java.io.*;

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int day = Integer.parseInt(br.readLine());

     int res = 0;

     StringTokenizer st = new StringTokenizer(br.readLine());

     for(int i=0; i<5; i++) {

       int tmp = Integer.parseInt(st.nextToken());

       if(tmp==day) {

         res++;

       }

     }

     

     System.out.println(res);

   }

 }

