import java.io.*;

import java.util.*;

public class Main {

  

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));     

     StringTokenizer st = new StringTokenizer(br.readLine());

     

     int A = Integer.parseInt(st.nextToken());

     int B = Integer.parseInt(st.nextToken());

     int C = Integer.parseInt(st.nextToken());

     int D = Integer.parseInt(st.nextToken());

     int E = Integer.parseInt(st.nextToken());

     

     int i = 1;

     int ans = 0;

     while(true) {

       int cnt = 0;

       

       if(i%A==0) {

         cnt++;

       }

       if(i%B==0) {

         cnt++;

       }

       if(i%C==0) {

         cnt++;

       }

       if(i%D==0) {

         cnt++;

       }

       if(i%E==0) {

         cnt++;

       }

       

       if(cnt>=3) {

         ans = i;

         break;

       }

       

       i++;

     }

     

     System.out.println(ans);

    }

 }

