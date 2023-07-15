import java.util.*;

import java.io.*;

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     StringBuilder sb = new StringBuilder();

     

     while(true) {

       String tmp = br.readLine();

       

       if(tmp.equals("0")) {

         break;

       } else {

         int res = tmp.length()-1+2;

         int[] arr = new int[tmp.length()];

         for(int i=0; i<tmp.length(); i++) {

           arr[i] = tmp.charAt(i)-'0';

           

           if(arr[i]==1) {

             res += 2;

           } else if(arr[i]==0) {

             res += 4;

           } else {
 
             res += 3;

           }

         }

         

         sb.append(res).append("\n");

       }

     } 

     

     System.out.println(sb.toString());

   }

 }

