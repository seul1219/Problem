import java.util.*;

import java.io.*;

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     StringTokenizer st = new StringTokenizer(br.readLine());

     int[] arr = new int[3];

     for(int i=0; i<3; i++) {

       arr[i] = Integer.parseInt(st.nextToken());       

     }

     Arrays.sort(arr);

     

     int A = arr[0];

     int B = arr[1];

     int C = arr[2];    

     

     String str = br.readLine();

     StringBuilder sb = new StringBuilder();

     for(int i=0; i<3; i++) {

       if(str.charAt(i)=='A') {

         sb.append(A).append(" ");

       } else if(str.charAt(i)=='B') {

         sb.append(B).append(" ");

       } else if(str.charAt(i)=='C') {

         sb.append(C).append(" ");

       }

     }

     

     System.out.println(sb.toString());

   }

 }

