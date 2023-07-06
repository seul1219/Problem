import java.util.*;

import java.io.*;

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     StringBuilder sb = new StringBuilder();

     

     while(true) {     

     String str = br.readLine();

     

     if(str.equals("# 0 0")) {

       break;

     } else {

       

     StringTokenizer st = new StringTokenizer(str);

     

     String name = st.nextToken();

     int age = Integer.parseInt(st.nextToken());

     int weight = Integer.parseInt(st.nextToken());

     

     if(age>17 || weight>=80) {

       sb.append(name).append(" Senior").append("\n");

     } else {

       sb.append(name).append(" Junior").append("\n");

     }

     }

     }

     

     System.out.println(sb.toString());

   }

 }

