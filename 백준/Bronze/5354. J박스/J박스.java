import java.util.*;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     int T = Integer.parseInt(br.readLine());

     

     StringBuilder sb = new StringBuilder();

     for(int i=0; i<T; i++) {

       int N = Integer.parseInt(br.readLine());

       

       for(int j=0; j<N; j++) {

         sb.append("#");

       }

       sb.append("\n");

       if(N>1) {

         

       if(N>2) {

       for(int j=1; j<N-1; j++) {

         sb.append("#");

         for(int k=1; k<N-1; k++) {

           sb.append("J");

         }

         sb.append("#");

         sb.append("\n");

       }

       }

       for(int j=0; j<N; j++) {

         sb.append("#");

       }

       sb.append("\n");

       }

       sb.append("\n");

     }

      

     System.out.println(sb.toString());

    }

 }

