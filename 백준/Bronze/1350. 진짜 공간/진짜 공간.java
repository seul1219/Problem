import java.io.*;

import java.util.*;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int N = Integer.parseInt(br.readLine());

     

     StringTokenizer st = new StringTokenizer(br.readLine());

     int[] arr = new int[N];

     for(int i=0; i<N; i++) {

       arr[i] = Integer.parseInt(st.nextToken());

     }

     

     int clus = Integer.parseInt(br.readLine());

     long res = 0;

     for(int i=0; i<N; i++) {

       

       int ac = arr[i]/clus;

       int ac2 = arr[i]%clus;

       

       if(ac2>0) {

         res += (ac+1)*clus;

       } else {

         res += ac*clus;

       }

      

     }

     

     System.out.println(res);

   }

}