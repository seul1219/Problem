import java.util.*;
import java.io.*;

 class Main
 {
   public static void main(String args[]) throws IOException
   { 
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
     int T = Integer.parseInt(br.readLine());
     for(int t=0; t<T; t++) {
       StringTokenizer st = new StringTokenizer(br.readLine());
       String tmp1 = st.nextToken();
       String tmp2 = st.nextToken();
       
       int size = tmp1.length();
       int[] arr1 = new int[size];
       int[] arr2 = new int[size];
       for(int i=0; i<size; i++) {
         arr1[i] = tmp1.charAt(i)-'0'-64;
         arr2[i] = tmp2.charAt(i)-'0'-64;
       }
       
       StringBuilder sb = new StringBuilder();
       sb.append("Distances: ");
       for(int i=0; i<size; i++) {
         if(arr1[i]>arr2[i]) {
           int num = arr2[i]+26-arr1[i];
           sb.append(num).append(" ");
         } else {
           int num = arr2[i]-arr1[i];
           sb.append(num).append(" ");
         }
       }
       
       System.out.println(sb.toString());
     }//T
   }
 }
