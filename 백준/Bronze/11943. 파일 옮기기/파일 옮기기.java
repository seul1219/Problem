import java.util.*;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     StringTokenizer st = new StringTokenizer(br.readLine());

     int A = Integer.parseInt(st.nextToken());

     int B = Integer.parseInt(st.nextToken());

     StringTokenizer st2 = new StringTokenizer(br.readLine());

     int C = Integer.parseInt(st2.nextToken());

     int D = Integer.parseInt(st2.nextToken());

     

     int res = A+D<=B+C ? A+D : B+C;

     System.out.println(res);

    }

 }

