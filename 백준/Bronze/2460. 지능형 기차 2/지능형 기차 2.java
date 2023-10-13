import java.io.*;

import java.util.*;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int[] A = new int[10];

     int[] B = new int[10];

     for(int i=0; i<10; i++) {

       StringTokenizer st = new StringTokenizer(br.readLine());

       

       A[i] = Integer.parseInt(st.nextToken());

       B[i] = Integer.parseInt(st.nextToken());

     }

     

     int ans = 0;

     int res = 0;

     for(int i=0; i<10; i++) {

       res -= A[i];

       res += B[i];

       

       ans = Math.max(res, ans);

     }

     

     System.out.println(ans);

   }

}