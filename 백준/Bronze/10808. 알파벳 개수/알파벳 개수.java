import java.util.*;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     String str = br.readLine();

     int[] arr = new int[26];

     for(int i=0; i<str.length(); i++) {

       arr[str.charAt(i)-'a']++;

     }

     

     StringBuilder sb = new StringBuilder();

     for(int i=0; i<26; i++) {

       sb.append(arr[i]).append(" ");

     }

     

     System.out.println(sb.toString());

    }

 }

