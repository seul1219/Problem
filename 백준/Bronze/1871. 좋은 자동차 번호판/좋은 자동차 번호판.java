import java.util.*;

import java.io.*;

import java.math.*;

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     StringBuilder sb = new StringBuilder();

     

     int T = Integer.parseInt(br.readLine());

     

     for(int t=0; t<T; t++) {

         String str = br.readLine();

         

         int res = 0;

         

         char[] cArr = new char[3];

         for(int i=0; i<3; i++) {

           cArr[i] = str.charAt(i);

         }

         res += (int)(cArr[0]-65)*676;

         res += (int)(cArr[1]-65)*26;

         res += (int)(cArr[2]-65);

         

         String num = "";

         for(int i=4; i<str.length(); i++) {

           num += str.charAt(i);

         }

         

         int num2 = Integer.parseInt(num);

         

         if(Math.abs(res-num2)<=100) {

           sb.append("nice").append("\n");

         } else {

           sb.append("not nice").append("\n");

         }

     }//T

     

     System.out.println(sb.toString());

   }

 }

