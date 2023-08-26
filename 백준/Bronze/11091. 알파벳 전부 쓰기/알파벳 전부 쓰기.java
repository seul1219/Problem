import java.util.*;

import java.io.*;

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int N = Integer.parseInt(br.readLine());

     

     StringBuilder sb = new StringBuilder();

     for(int i=0; i<N; i++) {

       String tmp = br.readLine();

       

       int[] arr = new int[26];

       

       for(int j=0; j<tmp.length(); j++) {

         if(tmp.charAt(j)>='A' && tmp.charAt(j)<='Z') {

           arr[tmp.charAt(j)-'A']++;

         } else if(tmp.charAt(j)>='a' && tmp.charAt(j)<='z') {

           arr[tmp.charAt(j)-'a']++;

         }

       }

       

       boolean flag = false;

       String str = "";

       for(int j=0; j<26; j++) {

         if(arr[j]==0) {

           flag = true;

           char c = (char)(j+'a');

           str += c;

         }

       }

       

       if(flag) {

         sb.append("missing ").append(str).append("\n");

       } else {

         sb.append("pangram").append("\n");

       }

     }

     

     System.out.println(sb.toString());

   }

 }

