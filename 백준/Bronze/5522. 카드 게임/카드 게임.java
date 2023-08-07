import java.util.*;

import java.io.*;

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int res = 0;

     for(int i=0; i<5; i++) {

       int tmp = Integer.parseInt(br.readLine());

       res += tmp;

     }

     

     System.out.println(res);

   }

 }

