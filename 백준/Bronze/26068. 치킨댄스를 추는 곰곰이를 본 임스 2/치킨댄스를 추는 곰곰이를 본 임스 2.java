import java.util.*;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int T = Integer.parseInt(br.readLine());

     String[] arr = new String[T];

     int cnt = 0;

     for(int t=0; t<T; t++) {

       arr[t] = br.readLine();

       

       String str = "";

       for(int i=2; i<arr[t].length(); i++) {

         str += arr[t].charAt(i);

       }

       

       if(Integer.parseInt(str)<=90) {

         cnt++;

       }

     }

  

     System.out.println(cnt);

    }

 }

