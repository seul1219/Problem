import java.util.*;

import java.io.*;

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int winA = 0;

     int winB = 0;

     

     int T = Integer.parseInt(br.readLine());

     for(int t=0; t<T; t++) {

       StringTokenizer st = new StringTokenizer(br.readLine());

       

       int A = Integer.parseInt(st.nextToken());

       int B = Integer.parseInt(st.nextToken());

       

       if(A<B) {

         winB++;

       } else if(A>B) {

         winA++;

       }

     }//T

     

     System.out.println(winA + " " + winB);

   }

 }

