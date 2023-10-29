import java.io.*;

import java.util.*;

public class Main {

  

   public static List<Integer> maxList = new ArrayList<>();

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     StringTokenizer st = new StringTokenizer(br.readLine());

     

     int N = Integer.parseInt(st.nextToken());

     int X = Integer.parseInt(st.nextToken());

     int K = Integer.parseInt(st.nextToken());

     

     int[] arr = new int[N+1];

     for(int i=0; i<N+1; i++) {

       arr[i] = i;

     }

     

     for(int i=0; i<K; i++) {

       StringTokenizer st2 = new StringTokenizer(br.readLine());

     

       int A = Integer.parseInt(st2.nextToken());

       int B = Integer.parseInt(st2.nextToken());

       

       int tmp = arr[A];

       arr[A] = arr[B];

       arr[B] = tmp; 

     }

     

     int res = 0;

     for(int i=0; i<N+1; i++) {

       if(arr[i]==X) {

         res = i;

       }

     }

     

     System.out.println(res);

    }

 }

