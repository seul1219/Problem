import java.util.*;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

 // Compiler version JDK 11.0.2

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       

     int num = Integer.parseInt(br.readLine());

     

     int cnt = Integer.parseInt(br.readLine());

    

     int res = 0;

     

     for(int a=0; a<cnt; a++){ 

       StringTokenizer st = new StringTokenizer(br.readLine());

       

       int n = Integer.parseInt(st.nextToken());

       int c = Integer.parseInt(st.nextToken());

       res += (n*c);

     }

     

     if(res==num){

       System.out.println("Yes");

     } else {

       System.out.println("No");

     }

    

   }

 }

