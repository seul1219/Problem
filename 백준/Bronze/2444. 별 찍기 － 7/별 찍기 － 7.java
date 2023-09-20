import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     int N = Integer.parseInt(br.readLine());

     

     StringBuilder sb = new StringBuilder();

     int left = (2*N-1)/2;

     int right = left;

     int mid = left;

     int end = 2*N-1;

     for(int i=0; i<end; i++) {

       for(int j=0; j<left; j++) {

         sb.append(" ");

       }

       for(int j=left; j<right+1; j++) {

         sb.append("*");

       }

       sb.append("\n");

       if(i<mid) {

         left--;

         right++;

       } else {

         left++;

         right--;

       }

       

     }

     

     System.out.println(sb.toString());

    }

 }

