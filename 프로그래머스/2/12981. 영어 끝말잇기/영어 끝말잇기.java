import java.util.*;
class Solution {
    public int num = 0;
    public int cnt = 0;
    public int[] solution(int n, String[] words) {
        Set<String> set = new HashSet<>();
        char last = ' ';
        char first = ' ';
        
        for(int i=1; i<=words.length; i++) {
            //끝말잇기 유효성 검사
            String str = words[i-1];
            first = str.charAt(0);
            if(i!=1) {
                if(last!=first) {
                    test(i, n);
                    break;
                }
            }
            
            //중복 검사
            int cur = set.size();
            set.add(str);
            last = str.charAt(str.length()-1);
            int next = set.size();
            if(cur==next) {
                test(i, n);
                break;
            }
        }
        
        int[] answer = {num, cnt};
        return answer;
    }
    
    public void test(int i, int n) {
        num = i%n;
        if(num!=0) {
            cnt = i/n + 1;
        } else if(num==0) {
            num = n;
            cnt = i/n;
        }
    }
}