import java.util.*;

import java.io.*;

import java.math.*;

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 

     StringTokenizer st = new StringTokenizer(br.readLine());

     long age = Long.parseLong(st.nextToken());

     long weight = Long.parseLong(st.nextToken());

     

     long res = Math.abs(age-weight);

     

     System.out.println(res);

   }

 }

