import java.io.*;

public class Main {

  

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int N = Integer.parseInt(br.readLine());

     

     int cnt = 0;

     for(int i=1; i<=N-2; i++) {

       for(int j=1; j<=N-1; j++) {

         for(int k=1; k<=N; k++) {

           

           if(j>=i+2 && k%2==0 && i+j+k==N) {

             cnt++;

           }

         }

       }      

     }

     

     System.out.println(cnt);

    }

 }

