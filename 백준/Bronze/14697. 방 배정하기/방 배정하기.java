import java.io.*;

import java.util.*;

public class Main {

  

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));     

     StringTokenizer st = new StringTokenizer(br.readLine());

     

     int A = Integer.parseInt(st.nextToken());

     int B = Integer.parseInt(st.nextToken());

     int C = Integer.parseInt(st.nextToken());

     int N = Integer.parseInt(st.nextToken());

     

     boolean flag = false;

     R: for(int i=0; i<=300; i++) {

       for(int j=0; j<=300; j++) {

         for(int k=0; k<=300; k++) {

           if(A*i + B*j + C*k == N) {

             flag = true;

             break R;

           }

         }

       }

     }

     

     if(flag) {

       System.out.println(1);

     } else {

       System.out.println(0);

     }    

    }

 }

