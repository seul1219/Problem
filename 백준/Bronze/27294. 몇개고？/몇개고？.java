import java.io.*;

import java.util.*;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     StringTokenizer st = new StringTokenizer(br.readLine());

     int T = Integer.parseInt(st.nextToken());

     int S = Integer.parseInt(st.nextToken());

     

     if(S==1 || T<=11 || T>=17) {

       System.out.println(280);

       return;

     } else if(S==0 && T>=12 && T<=16) {

       System.out.println(320);

       return;

     }

   }

}