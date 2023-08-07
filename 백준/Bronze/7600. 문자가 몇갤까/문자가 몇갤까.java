import java.util.*;

import java.io.*;

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    

     while(true) {

       String str = br.readLine();

       

       boolean[] arr = new boolean[26];

       int cnt = 0;

       if(str.equals("#")) {

         break;

       }

         for(int i=0; i<str.length(); i++) {

           char c = str.charAt(i);

           if(c>='A' && c<='Z') {

             int tmp = (int)(c-'A');

             arr[tmp] = true;

           } else if(c>='a' && c<='z') {

             int tmp = (int)(c-'a');

             arr[tmp] = true;

           }

         }

         

         for(int i=0; i<26; i++) {

           if(arr[i]==true) {

             cnt++;

           }

         }

         

         System.out.println(cnt);

     }//while

   }

 }

