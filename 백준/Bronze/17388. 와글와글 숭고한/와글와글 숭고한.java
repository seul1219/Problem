import java.util.*;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.math.*;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    

     StringTokenizer st = new StringTokenizer(br.readLine());

     

     int min = Integer.MAX_VALUE;

     int idx = -1;

     int sum = 0;

     int[] arr = new int[3];

     for(int i=0; i<3; i++) {

       arr[i] = Integer.parseInt(st.nextToken());

       if(min>arr[i]) {

         min = arr[i];

         idx = i;

       }

       sum += arr[i];

     }

     

     if(sum>=100) {

       System.out.println("OK");

     } else {

       if(idx==0) {

         System.out.println("Soongsil");

       } else if(idx==1) {

         System.out.println("Korea");

       } else {

         System.out.println("Hanyang");

       }

     }

    }

 }

