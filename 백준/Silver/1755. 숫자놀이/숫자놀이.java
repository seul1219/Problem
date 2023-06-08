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

     

     PriorityQueue<String> pq = new PriorityQueue<>();

     Map<String, Integer> map = new HashMap<>();

     for(int i=N; i<=M; i++) {

       String tmp = Integer.toString(i);

       String str = "";

       

       for(int j=0; j<tmp.length(); j++) {

         char num = tmp.charAt(j);

         

         if(num=='0') {

           str += "zero";

         } else if(num=='1') {

           str += "one";

         } else if(num=='2') {

           str += "two";

         } else if(num=='3') {

           str += "three";

         } else if(num=='4') {

           str += "four";

         } else if(num=='5') {

           str += "five";

         } else if(num=='6') {

           str += "six";

         } else if(num=='7') {

           str += "seven";

         } else if(num=='8') {

           str += "eight";

         } else if(num=='9') {

           str += "nine";

         }

       }

      

      map.put(str, i);

      pq.offer(str);

     }

     

     StringBuilder sb = new StringBuilder();

     

     int cnt=1;

     while(!pq.isEmpty()) {

       String cur = pq.poll();

       if(cnt<10) {

         sb.append(map.get(cur)).append(" ");

         cnt++;

       } else if(cnt==10) {

         sb.append(map.get(cur)).append("\n");

         cnt=1;

       }

     }

     

     System.out.println(sb.toString());

    }

 }

