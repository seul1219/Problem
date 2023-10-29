import java.io.*;

import java.util.*;

public class Main {

  

   public static List<Integer> maxList = new ArrayList<>();

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int N = Integer.parseInt(br.readLine());

     int[] arr = new int[N];

     boolean[] visited = new boolean[36];

     StringTokenizer st = new StringTokenizer(br.readLine());

     int max = -1;

     int min = 100;

     for(int i=0; i<N; i++) {

       arr[i] = Integer.parseInt(st.nextToken());

       max = Math.max(max, arr[i]);

       min = Math.min(min, arr[i]);

       visited[arr[i]] = true;

     }

     

     boolean flag = false;

     List<Integer> list = new ArrayList<>();

     for(int i=min; i<=max; i++) {

       if(visited[i] && !flag) {

         flag = true;

         list.add(i);

       } else if(!visited[i] && flag){

         flag = false;

       }

     }

     

     int res = 0;

     for(int i=0; i<list.size(); i++) {

       res += list.get(i);

     }

     

     System.out.println(res);

    }

 }

