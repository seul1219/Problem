import java.io.*;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int N = Integer.parseInt(br.readLine());

     int cnt = 1;

     int time = 0;

     while(N!=0) {

       if(cnt>N) {

         cnt = 1;

         N = N-1;

         cnt++;

       } else {

         N = N-cnt;

         cnt++;

       }

       time++;

     }

     

     System.out.println(time);   

   }

}