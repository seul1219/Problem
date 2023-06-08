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

       

     int N = Integer.parseInt(br.readLine());

     

     Map<String, Integer> map = new HashMap<>();

     PriorityQueue<String> pq = new PriorityQueue<>();

     for(int i=0; i<N; i++) {

       String file = br.readLine();

       int idx = 0;

       for(int j=0; j<file.length(); j++) {

         if(file.charAt(j)=='.') {

           idx = j;

         }

       }

       

       String str = "";

       for(int j=idx+1; j<file.length(); j++) {

         str += file.charAt(j);

       }

     

       if(map.get(str)==null) {

         map.put(str, 1);

         pq.offer(str);

       } else {

         int tmp = map.get(str);

         map.put(str, tmp+1);

       }

     }

     

     StringBuilder sb = new StringBuilder();

     

     while(!pq.isEmpty()) {

       String cur = pq.poll();

       sb.append(cur).append(" ").append(map.get(cur)).append("\n");

     }

     

     System.out.println(sb.toString());

    }

 }

