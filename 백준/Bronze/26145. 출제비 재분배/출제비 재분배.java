import java.io.*;

import java.util.*;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     StringTokenizer st = new StringTokenizer(br.readLine());

     

     int N = Integer.parseInt(st.nextToken());

     int M = Integer.parseInt(st.nextToken());

     

     StringTokenizer st2 = new StringTokenizer(br.readLine());

     

     int[] people = new int[N+M+1];

     for(int i=1; i<N+1; i++) {

       people[i] = Integer.parseInt(st2.nextToken());

     }

     

     for(int i=1; i<N+1; i++) {

       StringTokenizer st3 = new StringTokenizer(br.readLine());

     

       for(int j=1; j<N+M+1; j++) {

         int cur = Integer.parseInt(st3.nextToken());

         people[i] -= cur;

         people[j] += cur;

       }

     }

     

     StringBuilder sb = new StringBuilder();

     for(int i=1; i<N+M+1; i++) {

       sb.append(people[i]).append(" ");

     }

     

     System.out.println(sb.toString());

    }

 }

