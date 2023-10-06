import java.io.*;

import java.util.*;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     StringBuilder sb = new StringBuilder();

     while(true) {

       StringTokenizer st

        = new StringTokenizer(br.readLine());

        

       String str = st.nextToken();

       if(str.equals("#")) {

         break;

       }

       

       int y = Integer.parseInt(st.nextToken());

       int m = Integer.parseInt(st.nextToken());

       int d = Integer.parseInt(st.nextToken());

       

       if(y>31) {

         sb.append("? ").append(y-30).append(" ")

           .append(m).append(" ").append(d).append("\n");

           

       } else if(y==31 && m>=5) {

         sb.append("? ").append(y-30).append(" ")

           .append(m).append(" ").append(d).append("\n");

           

       } else {

         sb.append(str).append(" ").append(y).append(" ")

           .append(m).append(" ").append(d).append("\n");     

       }

     }

     

     System.out.println(sb.toString());

   }

}