import java.util.*;

import java.io.*;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int[] burger = new int[3];

     for(int i=0; i<3; i++) {

       burger[i] = Integer.parseInt(br.readLine());

     }

     

     int[] drink = new int[2];

     for(int i=0; i<2; i++) {

       drink[i] = Integer.parseInt(br.readLine());

     }

     

     int min = Integer.MAX_VALUE;

     for(int i=0; i<3; i++) {

       for(int j=0; j<2; j++) {

         min = Math.min(burger[i]+drink[j]-50, min);

       }

     }

     

     System.out.println(min);

    }

 }

