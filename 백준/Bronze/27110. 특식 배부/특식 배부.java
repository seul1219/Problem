import java.util.*;

import java.io.*;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int N = Integer.parseInt(br.readLine());

     

     int[] arr = new int[3];

     StringTokenizer st = new StringTokenizer(br.readLine());

     for(int i=0; i<3; i++) {

       arr[i] = Integer.parseInt(st.nextToken());

     }

     

     int cnt = 0;

     for(int i=0; i<3; i++) {

       if(arr[i]<N) {

         cnt += arr[i];

       } else {

         cnt += N;

       }

     }

     

     System.out.println(cnt);   

   }

}