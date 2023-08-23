import java.util.*;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.math.*;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    

     String str = br.readLine();

     int res = 0;

     for(int i=0; i<str.length(); i++) {

       int tmp = (int)str.charAt(i)-'0';

       res += Math.pow(tmp, 5);

     }

     

     System.out.println(res);

    }

 }

