import java.io.*;

import java.util.*;

public class Main {

  

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));     

     

     int T = Integer.parseInt(br.readLine());

     StringTokenizer st = new StringTokenizer(br.readLine());

     

     int res = 0;

     for(int i=0; i<T; i++) {

       int N = Integer.parseInt(st.nextToken());

       

       if(N!=1) {

         int cnt = 0;

         for(int j=2; j<N; j++) {

           if(N%j==0) {

             cnt++;

           }

         }

       

         if(cnt==0) {

           res++;

         }

       }      

     }

     

     System.out.println(res);

    }

 }

