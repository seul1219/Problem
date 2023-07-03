import java.util.*;

import java.io.*;

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     StringTokenizer st = new StringTokenizer(br.readLine());

     

     int N = Integer.parseInt(st.nextToken());

     int M = Integer.parseInt(st.nextToken());

     

     int[] ball = new int[N+1];

     for(int i=1; i<N+1; i++) {

       ball[i] = i;

     }

     

     for(int i=0; i<M; i++) {

       StringTokenizer st2 = new StringTokenizer(br.readLine());

  

       int A = Integer.parseInt(st2.nextToken());

       int B = Integer.parseInt(st2.nextToken());

       

       int tmp = ball[A];

       ball[A] = ball[B];

       ball[B] = tmp;

     }

     

     StringBuilder sb = new StringBuilder();

     for(int i=1; i<N+1; i++) {

       sb.append(ball[i]).append(" ");

     }

     

     System.out.println(sb.toString());

   }

 }

