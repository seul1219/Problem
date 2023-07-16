import java.util.*;

import java.io.*;

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     Map<Integer, Integer> xmap = new HashMap<Integer, Integer>();

     Map<Integer, Integer> ymap = new HashMap<Integer, Integer>();

     

     for(int i=0; i<3; i++) {

       StringTokenizer st = new StringTokenizer(br.readLine());

       

       int x = Integer.parseInt(st.nextToken());

       int y = Integer.parseInt(st.nextToken());

       

       if(!xmap.containsKey(x)) {

         xmap.put(x, 1);

       } else {

         xmap.put(x, 2);

       }

       

       if(!ymap.containsKey(y)) {

         ymap.put(y, 1);

       } else {

         ymap.put(y, 2);

       }

     }

     

     int res1 = 0;

     for(Integer i : xmap.keySet()) {

       if(xmap.get(i)==1) {

         res1 = i;

       }

     }

     

     int res2 = 0;

     for(Integer i : ymap.keySet()) {

       if(ymap.get(i)==1) {

         res2 = i;

       }

     }

     System.out.println(res1 + " " + res2);

   }

 }

