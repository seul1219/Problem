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

     

     //등차인지 검증

     boolean flag1 = false;

     int res1 = 0;

     for(int i=2; i<N; i++) {

       if((arr[i]-arr[i-1])==(arr[i-1]-arr[i-2])) {

         flag1 = true;

         res1 = arr[i]-arr[i-1];

       } else {

         flag1 = false;

       }

     }

     

     //등비인지 검증   

     boolean flag2 = false;

     int res2 = 0;

     for(int i=2; i<N; i++) {

       if((arr[i]/arr[i-1])==(arr[i-1]/arr[i-2])) {

         flag2 = true;

         res2 = arr[i]/arr[i-1];

       } else {

         flag2 = false;

       }

     }

     

     int ans = 0;   

     if(flag1) {

       ans = arr[N-1] + res1;

     } else if(flag2) {

       ans = arr[N-1]*res2;

     }

     

     System.out.println(ans);

    }

 }

