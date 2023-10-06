import java.io.*;

import java.util.*;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int N = Integer.parseInt(br.readLine());

     char[][] cArr = new char[N][N];

     for(int r=0; r<N; r++) {

       String str = br.readLine();

       for(int c=0; c<N; c++) {

         cArr[r][c] = str.charAt(c);

       }

     }

     int K = Integer.parseInt(br.readLine());

     

     StringBuilder sb = new StringBuilder();

     if(K==1) {

       for(int r=0; r<N; r++) {

         for(int c=0; c<N; c++) {

           sb.append(cArr[r][c]);

         }

         sb.append("\n");

       }

     } else if(K==2) {

       for(int r=0; r<N; r++) {

         for(int c=N-1; c>=0; c--) {

           sb.append(cArr[r][c]);

         }

         sb.append("\n");

       }

     } else if(K==3) {    

       for(int r=N-1; r>=0; r--) {

         for(int c=0; c<N; c++) {

           sb.append(cArr[r][c]);

         }

         sb.append("\n");

       }

     }

     

     System.out.println(sb.toString()); 

   }

}