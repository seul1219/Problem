import java.util.*;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int N = Integer.parseInt(br.readLine());

     char[][][] arr = new char[N][5][7];

     for(int t=0; t<N; t++) {

       for(int r=0; r<5; r++) {

         String line = br.readLine();

         for(int c=0; c<7; c++) {

           arr[t][r][c] = line.charAt(c);

         }

       }

     }

     

     int min = Integer.MAX_VALUE;

     int idx = 0;

     int idx2 = 0;

     for(int n=0; n<N-1; n++) {

       for(int t=1; t<N; t++) {

         int cnt = 0;

         for(int r=0; r<5; r++) {

           for(int c=0; c<7; c++) {

             if(n==t) {

               t++;

               continue;

             }

             

             if(arr[n][r][c]!=arr[t][r][c]) {

                cnt++;

             }

           }

         }

         

         if(min>cnt) {

           min = cnt;

           idx = n+1;

           idx2 = t+1;

         }

       }

     }

     

     System.out.println(idx + " " + idx2);

    }

 }

