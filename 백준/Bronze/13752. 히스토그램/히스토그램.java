import java.util.*;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     StringBuilder sb = new StringBuilder();

     

     int N = Integer.parseInt(br.readLine());

     for(int i=0; i<N; i++) {

       int k = Integer.parseInt(br.readLine());

       for(int j=0; j<k; j++) {

         sb.append("=");

       }

       sb.append("\n");

     }

     

     System.out.println(sb.toString());

    }

 }

