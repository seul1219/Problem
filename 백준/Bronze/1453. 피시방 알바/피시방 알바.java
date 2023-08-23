import java.util.*;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int N = Integer.parseInt(br.readLine());

     boolean[] visited = new boolean[101];

     StringTokenizer st = new StringTokenizer(br.readLine());

     int cnt = 0;

     for(int i=0; i<N; i++) {

       int tmp = Integer.parseInt(st.nextToken());

       if(!visited[tmp]) {

         visited[tmp] = true;

       } else {

         cnt++;

       }

     }

     

     System.out.println(cnt);

    }

 }

