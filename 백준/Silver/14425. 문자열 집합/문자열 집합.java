import java.util.*;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

 // Compiler version JDK 11.0.2

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     StringTokenizer st = new StringTokenizer(br.readLine());

     int N = Integer.parseInt(st.nextToken());

     int M = Integer.parseInt(st.nextToken());

     PriorityQueue<String> que = new PriorityQueue<>();

     for(int i=0; i<N; i++) {

       String tmp = br.readLine();

       que.offer(tmp);

     }

     

     String[] sArr = new String[M];

     for(int i=0; i<M; i++) {

       String str = br.readLine();

       sArr[i] = str;

     }

     

     int cnt = 0;

     while(!que.isEmpty()) {

       String cur = que.poll();

       

       for(int i=0; i<M; i++) {

         if(sArr[i].equals(cur)) {

           cnt++;

         }

       }

     } 

     

     System.out.println(cnt);

    }

 }

