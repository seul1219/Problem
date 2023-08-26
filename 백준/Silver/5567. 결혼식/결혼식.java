import java.util.*;

import java.io.*;

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int n = Integer.parseInt(br.readLine());

     List<Integer>[] adjList = new ArrayList[n+1];

     for(int i=0; i<=n; i++) {

       adjList[i] = new ArrayList<>();

     }

     

     int m = Integer.parseInt(br.readLine());

     for(int i=0; i<m; i++) {

       StringTokenizer st = new StringTokenizer(br.readLine());

       

       int a = Integer.parseInt(st.nextToken());

       int b = Integer.parseInt(st.nextToken());

       

       adjList[a].add(b);

       adjList[b].add(a);

     }

     

     if(adjList[1].size()==0) {

       System.out.println(0);

       

     } else {      

     Queue<int[]> que = new LinkedList<>();

     boolean[] visited = new boolean[n+1];

     que.offer(new int[] {1, 0});

     

     int cnt = 0;

     while(!que.isEmpty()) {

       int[] cur = que.poll();

       visited[cur[0]] = true;

       

       if(cur[1]==2) {

         break;

       }

       

       for(int val: adjList[cur[0]]) {

         if(!visited[val]) {

           visited[val] = true;

           //System.out.println(val);

           que.offer(new int[] {val, cur[1]+1});

           cnt++;

         }

       }     

     }

     

     System.out.println(cnt);

     }

   }

 }

