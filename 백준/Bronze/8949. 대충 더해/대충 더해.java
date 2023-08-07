import java.util.*;

import java.io.*;

 class Main

 {

   public static void main(String args[]) throws IOException

   { 

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     StringBuilder sb = new StringBuilder();

     StringTokenizer st = new StringTokenizer(br.readLine());

       

     String num1 = st.nextToken();

     String num2 = st.nextToken();

     int len1 = num1.length();

     int len2 = num2.length();

     int[] arr1 = new int[len1];

     for(int i=0; i<len1; i++) {

       arr1[i] = num1.charAt(i)-'0';

     }

     int[] arr2 = new int[len2];

     for(int i=0; i<len2; i++) {

       arr2[i] = num2.charAt(i)-'0';

     }

     

     List<Integer> list = new ArrayList<>();

     int left = len1-1;

     int right = len2-1;

     while(left>-1 && right>-1) {

       list.add(arr1[left]+arr2[right]);

       left--;

       right--;

     }

     

     if(left>=0) {

       while(left>-1) {

         list.add(arr1[left]);

         left--;

       }

     } else if(right>=0) {

       while(right>-1) {

         list.add(arr2[right]);

         right--;

       }

     }

     

     for(int i=list.size()-1; i>=0; i--) {

       sb.append(list.get(i));

     }

     

     System.out.println(sb.toString());

   }

 }

