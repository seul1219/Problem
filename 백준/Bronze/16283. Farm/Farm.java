import java.io.*;

import java.util.*;

public class Main {

  

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));     

     StringTokenizer st = new StringTokenizer(br.readLine());

     

     int a = Integer.parseInt(st.nextToken());

     int b = Integer.parseInt(st.nextToken());

     int n = Integer.parseInt(st.nextToken());

     int w = Integer.parseInt(st.nextToken());

     

     int cnt = 0;

     int ans1 = 0;

     int ans2 = 0;

     for(int i=1; i<n; i++) {

       if(a*i + b*(n-i) == w) {

         cnt++;

         ans1 = i;

         ans2 = n-i;

       }

     }

     

     if(cnt==0 || cnt>1) {

       System.out.println(-1);

     } else {

       System.out.println(ans1 + " " + ans2);

     }    

    }

 }

