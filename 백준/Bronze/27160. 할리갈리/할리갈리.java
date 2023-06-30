import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.HashMap;

import java.util.Map;

import java.util.StringTokenizer;

public interface Main {

   

   public static void main(String[] args) throws NumberFormatException, IOException {

      

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      

      int N = Integer.parseInt(br.readLine());

      Map<String, Integer> map = new HashMap<>();

      boolean flag = false;

      for(int i=0; i<N; i++) {

         StringTokenizer st = new StringTokenizer(br.readLine());

         

         String fruit = st.nextToken();

         int count = Integer.parseInt(st.nextToken());

         

         if(!map.containsKey(fruit)) {

            map.put(fruit, count);

         } else  if(map.containsKey(fruit)) {

            int tmp = map.get(fruit)+count;

            map.put(fruit, tmp);

         } 

      }

      

      for(String f : map.keySet()) {

         int check = map.get(f);

         if(check==5) {

            flag = true;

         }

      }

      

      if(flag) {

         System.out.println("YES");

      } else {

         System.out.println("NO");

      }

   }

}