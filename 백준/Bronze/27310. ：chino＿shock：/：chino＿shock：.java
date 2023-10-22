import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
   public static void main(String args[]) throws IOException { 
     
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String str = br.readLine();
     int cnt = str.length();
     int cnt2 = 0;
     int cnt3 = 0;
     for(int i=0; i<cnt; i++) {
       if(str.charAt(i)==':') {
         cnt2++;
       } else if(str.charAt(i)=='_') {
         cnt3++;
       }
     }
     System.out.println(cnt+cnt2+cnt3*5);
    }
 }