import java.util.*;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;


public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int sum = 0;

     for(int i=0; i<5; i++) {

       int tmp = Integer.parseInt(br.readLine());

       if(tmp<40) {

         sum += 40;

       } else {

         sum += tmp;

       }

     }

     

     System.out.println(sum/5);

    }

 }

