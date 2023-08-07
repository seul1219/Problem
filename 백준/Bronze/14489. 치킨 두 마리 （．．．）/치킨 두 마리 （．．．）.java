import java.util.*;

import java.io.*;

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     StringTokenizer st = new StringTokenizer(br.readLine());

     

     int A = Integer.parseInt(st.nextToken());

     int B = Integer.parseInt(st.nextToken());  

     

     int C = Integer.parseInt(br.readLine());

     

     if(A+B>=2*C) {

       System.out.println((A+B)-(2*C));

     } else {

       System.out.println(A+B);

     }    

   }

 }

