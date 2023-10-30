import java.io.*;

import java.util.*;

public class Main {

  

   public static List<Integer> maxList = new ArrayList<>();

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int N = Integer.parseInt(br.readLine());

     int[] arr = new int[N];

     StringTokenizer st = new StringTokenizer(br.readLine());

     for(int i=0; i<N; i++) {

       arr[i] = Integer.parseInt(st.nextToken());

     }

     

     int[] res = new int[N];

     boolean flag = false;

     int cnt = 1;

     for(int i=0; i<N; i++) {

       if(!flag && arr[i]==1) {

         flag = true;

         res[i] = cnt;

       } else if(flag && arr[i]==1) {

         cnt++;

         res[i] = cnt;

       } else if(flag && arr[i]==0) {

         flag = false;

         cnt = 1;

       }

     }

     

     int ans = 0;

     for(int i=0; i<N; i++) {

       ans += res[i];

     }

     

     System.out.println(ans);

    }

 }

