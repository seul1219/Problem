import java.io.*;

public class Main {

  

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));     

     

     StringBuilder sb = new StringBuilder();

     

     int N = Integer.parseInt(br.readLine());

     

     if(N!=1) {

       int i = 2;

       while(N!=1) {        

         if(N%i==0) {

           sb.append(i).append("\n");

           N = N/i;

         } else {

           i++;

         }

       }

     }

     

     System.out.println(sb.toString());

    }

 }

