import java.util.*;

import java.io.*;

import java.math.*;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     StringTokenizer st = new StringTokenizer(br.readLine());

     BigInteger num = new BigInteger(st.nextToken());

     BigInteger num2 = new BigInteger(st.nextToken());

     

     if(num.compareTo(num2)==0) {

       System.out.println("1");

     } else {

       System.out.println("0");

     }

    }

 }

