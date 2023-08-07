import java.util.*;

import java.io.*;

import java.math.*;

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int max = 0;

     int num = 0;

     for(int t=0; t<4; t++) {

       StringTokenizer st = new StringTokenizer(br.readLine());

       

       int num1 = Integer.parseInt(st.nextToken());

       int num2 = Integer.parseInt(st.nextToken());

       

       if(t==0) {

         num = num2;

         max = Math.max(max, num);

       } else {

         num = num - num1;

         num = num + num2;

         max = Math.max(max, num);

       }

     }

     

     System.out.println(max);

   }

 }

