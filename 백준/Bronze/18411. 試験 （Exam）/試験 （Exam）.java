import java.util.*;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Main {
  
   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     StringTokenizer st = new StringTokenizer(br.readLine());

     int[] num = new int[3];

     num[0] = Integer.parseInt(st.nextToken());

     num[1] = Integer.parseInt(st.nextToken());

     num[2] = Integer.parseInt(st.nextToken());

     

     Arrays.sort(num);

     

     System.out.println(num[2]+num[1]);

    }

 }

