import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";

        int len = numbers.length;
        String[] str = new String[len];
        for(int i=0; i<len; i++) {
            str[i] = Integer.toString(numbers[i]);
        }
        
        Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));
        
        if(str[0].equals("0")) {
            return "0";
        }
        
        for(int i=0; i<len; i++) {
            answer += str[i];
        }
        
        return answer;
    }
}