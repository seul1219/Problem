import java.util.*;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     int N = Integer.parseInt(br.readLine());

     

     StringBuilder sb = new StringBuilder();

     int cnt = 1;

     for(int i=1; i<=N; i++) {

       sb.append(i).append(" ");

      

       if(i==N) {

         break;

       }

       

       if(cnt%6==0) {

         sb.append("Go!").append(" ");

       }

       

       cnt++;

     }

     sb.append("Go!").append(" ");

     

     System.out.println(sb.toString());

     

    }

 }

