import java.util.*;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     int T = Integer.parseInt(br.readLine());

     StringBuilder sb = new StringBuilder();

     for(int t=0; t<T; t++) {

       String str = br.readLine();

       sb.append(str.charAt(0));

       for(int i=1; i<str.length(); i++) {

         if(str.charAt(i-1)!=str.charAt(i)) {

           sb.append(str.charAt(i));

         }

       }

       sb.append("\n");

     }

     System.out.println(sb.toString());

    }

 }

