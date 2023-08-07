import java.util.*;

import java.io.*;

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     StringBuilder sb = new StringBuilder();

     

     int K = Integer.parseInt(br.readLine());

     for(int t=1; t<=K; t++) {

       int N = Integer.parseInt(br.readLine());

       sb.append("Data Set ").append(t).append(":").append("\n");

       

       String str = br.readLine();      

       for(int i=0; i<str.length(); i++) {

         if(str.charAt(i)=='c') {

           N = N+1;

         } else if(str.charAt(i)=='b') {

           N = N-1;

         }

       } 

       

       sb.append(N).append("\n").append("\n");

     }

     

     System.out.println(sb.toString());

   }

 }

