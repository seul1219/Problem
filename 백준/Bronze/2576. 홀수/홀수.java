import java.util.*;

import java.io.*;

import java.math.*;

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     List<Integer> list = new ArrayList<Integer>();

     int sum = 0;

     int min = Integer.MAX_VALUE;

     for(int i=0; i<7; i++) {

       int tmp = Integer.parseInt(br.readLine());

       if(tmp%2!=0) {

         list.add(tmp);

         sum += tmp;

         min = Math.min(min, tmp);

       }

     }

     

     if(list.size()==0) {

       System.out.println("-1");

     } else {

       System.out.println(sum);

       System.out.println(min);

     }

   }

 }

