import java.util.*;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     StringBuilder sb = new StringBuilder();

     

     int T = Integer.parseInt(br.readLine());

     for(int i=0; i<T; i++) {

       StringTokenizer st = new StringTokenizer(br.readLine());

       

       int N = Integer.parseInt(st.nextToken());

       int M = Integer.parseInt(st.nextToken());

       

       int cnt1 = 2*M-N;

       int cnt2 = M-cnt1;

       

       sb.append(cnt1).append(" ").append(cnt2).append("\n");

     }

     

     System.out.println(sb.toString());

    }

 }

