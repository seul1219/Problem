import java.util.*;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     while(true) {

      int N = Integer.parseInt(br.readLine());

      

      if(N==0) {

        break;

      } else {

      boolean[] arr = new boolean[1001];

      

      StringTokenizer st = new StringTokenizer(br.readLine(), ",");

      int cnt = st.countTokens();

      for(int i=0; i<cnt; i++) {

        String tmp = st.nextToken();

        //System.out.println(tmp);

        

        if(tmp.contains("-")) {

        int idx = 0;

        for(int j=0; j<tmp.length(); j++) {

          if(tmp.charAt(j)=='-') {

            idx = j;

          }

        }

        //System.out.println(idx);

        

        String s1 = "";

        for(int j=0; j<idx; j++) {

          s1 += tmp.charAt(j);

        }

        String s2 = "";

        for(int j=idx+1; j<tmp.length(); j++) {

          s2 += tmp.charAt(j);

        }

        

        //System.out.println(s1);

        //System.out.println(s2);

        int i1 = Integer.parseInt(s1);

        int i2 = Integer.parseInt(s2);

        

        

        if(i1<=i2) {      

         for(int j=i1; j<=i2; j++) {

           if(j<=N) {

            arr[j] = true;

            }

          }

        }

        } else {

          int i3 = Integer.parseInt(tmp);

          if(i3<=N) {

          arr[i3] = true;

          }

        }

      }

      

      int res = 0;

      for(int i=0; i<N+1; i++) {

        if(arr[i]) {

          res++;

        }

      }

      

      System.out.println(res);

      }

     }

    }

 }

