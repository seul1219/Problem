import java.util.*;

import java.io.*;

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     StringBuilder sb = new StringBuilder();

     

     for(int t=0; t<3; t++) {

         StringTokenizer st = new StringTokenizer(br.readLine());

         

         int cnt0 = 0;

         int cnt1 = 0;

         int[] play = new int[4];

         for(int i=0; i<4; i++) {

           play[i] = Integer.parseInt(st.nextToken());

           if(play[i]==0) {

             cnt0++;

           } else if(play[i]==1) {

             cnt1++;

           }

         }

         

         if(cnt0==1 && cnt1==3) {    

           sb.append("A").append("\n");

         } else if(cnt0==2 && cnt1==2) {

           sb.append("B").append("\n");

         } else if(cnt0==3 && cnt1==1) {

           sb.append("C").append("\n");

         } else if(cnt0==4) {

           sb.append("D").append("\n");

         } else if(cnt1==4) {

           sb.append("E").append("\n");

         }

     }//T

     

     System.out.println(sb.toString());

   }

 }

