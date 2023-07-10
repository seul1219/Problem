import java.util.*;

import java.io.*;

import java.math.*;

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 

     StringTokenizer st = new StringTokenizer(br.readLine());

     int cnt = st.countTokens();

     int[] arr = new int[cnt];

     int res = 0;

     for(int i=0; i<cnt; i++) {

       arr[i] = Integer.parseInt(st.nextToken());

       res += Math.pow(arr[i], 2);

     }

     

     System.out.println(res%10);

   }

 }

