import java.util.*;

import java.io.*;

import java.math.*;

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int L = Integer.parseInt(br.readLine());

     int A = Integer.parseInt(br.readLine());

     int B = Integer.parseInt(br.readLine());

     int C = Integer.parseInt(br.readLine());

     int D = Integer.parseInt(br.readLine());

     

     int d1 = 0;

     if(A%C==0) {

       d1 = A/C;

     } else if(A%C!=0) {

       d1 = (A/C) +1;

     }

     

     int d2 = 0;

     if(B%D==0) {

       d2 = B/D;

     } else if(B%D!=0) {

       d2 = (B/D) +1;

     }

     

     int day = Math.max(d1, d2);

     

     System.out.println(L-day);

   }

 }

