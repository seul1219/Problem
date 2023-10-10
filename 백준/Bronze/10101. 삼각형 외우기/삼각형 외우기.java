import java.io.*;

import java.util.*;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int A = Integer.parseInt(br.readLine());

     int B = Integer.parseInt(br.readLine());

     int C = Integer.parseInt(br.readLine());

     

     int sum = A+B+C;

     

     if(A==60 && B==60 && C==60) {

       System.out.println("Equilateral");

       return;

     } else if(sum==180 && (A==B || B==C || A==C)) {

       System.out.println("Isosceles");

       return;

     } else if(sum==180 && A!=B && B!=C && A!=C) {

       System.out.println("Scalene");

       return;

     } else if(sum!=180) {

       System.out.println("Error");

       return;

     }

   }

}