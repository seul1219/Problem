import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

 // Compiler version JDK 11.0.2

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       

     String str = br.readLine();

     

     boolean[] arr = new boolean[4];

     int cnt=0;

     for(int i=0; i<str.length(); i++) {

       if(cnt==0 && arr[cnt]==false && str.charAt(i)=='U') {

         arr[cnt]=true;

         cnt++;

       } else if(cnt==1 && arr[cnt]==false && str.charAt(i)=='C') {

         arr[cnt]=true;

         cnt++;

       } else if(cnt==2 && arr[cnt]==false && str.charAt(i)=='P') {

         arr[cnt]=true;

         cnt++;

       } else if(cnt==3 && arr[cnt]==false && str.charAt(i)=='C') {

         arr[cnt]=true;

         cnt++;

       }

     }

     

     boolean flag = false;

     for(int i=0; i<4; i++) {

       if(arr[i]==false) {

         flag = true;

       }

     }

     

     if(flag) {

       System.out.println("I hate UCPC");

     } else {

       System.out.println("I love UCPC");

     }

   }

 }

