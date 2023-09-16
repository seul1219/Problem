import java.util.*;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     int N = Integer.parseInt(br.readLine());

     

     int[] arr = new int[N];  

     for(int i=0; i<N; i++) {

       arr[i] = Integer.parseInt(br.readLine());

     }

     

     int lcnt = 1;

     int lheight = arr[0];

     for(int i=1; i<N; i++) {

       if(lheight<arr[i]) {

         lcnt++;

         lheight = arr[i];

       }

     }

     

     int rcnt = 1;

     int rheight = arr[N-1];

     for(int i=N-2; i>=0; i--) {

       if(rheight<arr[i]) {

         rcnt++;

         rheight = arr[i];

       }

     }

     

     System.out.println(lcnt);

     System.out.println(rcnt);

    }

 }

