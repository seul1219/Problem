import java.util.*;

import java.io.*;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     StringTokenizer st = new StringTokenizer(br.readLine());

     int N = Integer.parseInt(st.nextToken());

     int M = Integer.parseInt(st.nextToken());

     

     if(100*N>=M) {

       System.out.println("Yes");

     } else {

       System.out.println("No");

     }

   }

}