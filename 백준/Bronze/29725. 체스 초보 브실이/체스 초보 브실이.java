import java.io.*;

public class Main {

   public static void main(String args[]) throws IOException { 

     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

     int cnt1 = 0;

     int cnt2 = 0;

     for(int r=0; r<8; r++) {

       String str = br.readLine();

       for(int c=0; c<8; c++) {

         char ch = str.charAt(c);

         if(ch=='p') {

           cnt1 += 1;

         } else if(ch=='n') {

           cnt1 += 3;

         } else if(ch=='b') {

           cnt1 += 3;

         } else if(ch=='r') {

           cnt1 += 5;

         } else if(ch=='q') {

           cnt1 += 9;

         } else if(ch=='P') {

           cnt2 += 1;

         } else if(ch=='N') {

           cnt2 += 3;

         } else if(ch=='B') {

           cnt2 += 3;

         } else if(ch=='R') {

           cnt2 += 5;

         } else if(ch=='Q') {

           cnt2 += 9;

         }

       }

     }

     

     System.out.println(cnt2 - cnt1);

    }

 }

