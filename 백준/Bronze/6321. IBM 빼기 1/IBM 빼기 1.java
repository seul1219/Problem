import java.util.*;
import java.io.*;

 class Main
 {
   public static void main(String args[]) throws IOException
   { 
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     StringBuilder sb = new StringBuilder();
     
     int n = Integer.parseInt(br.readLine());
     for(int i=1; i<=n; i++) {
       sb.append("String #").append(i).append("\n");
       String str = br.readLine();
       
       for(int j=0; j<str.length(); j++) {
         char c = str.charAt(j);
         if(c>='A' && c<='Y') {
           char tmp = (char)(c+1);
           sb.append(tmp);
         } else if(c=='Z') {
           char tmp = 'A';
           sb.append(tmp);
         }
       }
       
       sb.append("\n").append("\n");
     }
     
     System.out.println(sb.toString());
   }
 }
