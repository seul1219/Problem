import java.util.*;

import java.io.*;

import java.math.*;

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int T = Integer.parseInt(br.readLine());

     

     int res = 0;

     for(int t=0; t<T; t++) {

         StringTokenizer st = new StringTokenizer(br.readLine());

         

         int[] cnt = new int[7];

         int[] arr = new int[3];

         for(int i=0; i<3; i++) {

           arr[i] = Integer.parseInt(st.nextToken());

           cnt[arr[i]]++;

         }

         

         int max = 0;

         int idx = 0;

         for(int i=1; i<=6; i++) {

           if(max<=cnt[i]) {

             max = cnt[i];

             idx = i;

           }

         }

         

         if(max==3) {    

           res = Math.max(res, idx*1000+10000);

         } else if(max==2) {

           res = Math.max(res, idx*100+1000);

         } else if(max==1) {

           res = Math.max(res, idx*100);

         }

     }//T

     

     System.out.println(res);

   }

 }

