import java.util.*;

import java.io.*;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     String mbti = br.readLine();

     

     int N = Integer.parseInt(br.readLine());

     

     int cnt = 0;

     for(int i=0; i<N; i++) {

       String str = br.readLine();

       if(str.equals(mbti)) {

         cnt++;

       }

     }

     

     System.out.println(cnt);  

   }

}