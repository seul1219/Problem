import java.util.*;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;


public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     String str = br.readLine();

     int A = 0;

     int B = 0;

     if(str.length()==2) {

       A = (int) str.charAt(0)-'0';

       B = (int) str.charAt(1)-'0';    

     } else if(str.length()==3 && str.charAt(1)=='0') {

       String tmp = "";

       for(int i=0; i<2; i++) {

         tmp += str.charAt(i);

       }

       

       A = Integer.parseInt(tmp);

       B = (int) str.charAt(2)-'0';

     } else if(str.length()==3 && str.charAt(1)!='0') {

       A = (int) str.charAt(0)-'0';

       String tmp = "";

       for(int i=1; i<3; i++) {

         tmp += str.charAt(i);

       }

       

       B = Integer.parseInt(tmp);

     } else if(str.length()==4) {

       A = 10;

       B = 10;

     }

  

     System.out.println(A+B);

    }

 }

