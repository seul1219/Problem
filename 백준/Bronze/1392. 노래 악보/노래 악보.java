import java.util.*;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     StringTokenizer st = new StringTokenizer(br.readLine());

     

     int N = Integer.parseInt(st.nextToken());

     int Q = Integer.parseInt(st.nextToken());

     int[] time = new int[N];

     int[] sumTime = new int[N+1];

     int sum = 0;

     for(int i=0; i<N; i++) {

       time[i] = Integer.parseInt(br.readLine());

       sum += time[i];

       sumTime[i] = sum-1;

     }

     

     int[] arr = new int[Q];

     for(int i=0; i<Q; i++) {

       arr[i] = Integer.parseInt(br.readLine());

     }

     

     StringBuilder sb = new StringBuilder();

     for(int i=0; i<Q; i++) {

       for(int j=1; j<N; j++) {

         if(arr[i]<=sumTime[j-1]) {

           sb.append(j).append("\n");

           break;

         } else if(arr[i]>sumTime[j-1]

           && arr[i]<=sumTime[j]) {

             sb.append(j+1).append("\n");

             break;

           }

       }

     }

     

     System.out.println(sb.toString());

    }

 }

