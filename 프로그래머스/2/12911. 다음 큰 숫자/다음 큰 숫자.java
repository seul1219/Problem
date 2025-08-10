class Solution {
    public int solution(int n) {
        int con2 = oneCnt(n);
        
        int answer = 0;
        for(int i=n+1; i<=1000000; i++) {
            if(con2 == oneCnt(i)) {
                answer = i;
                break;
            }
        }

        return answer;
    }
    
    public int oneCnt(int num) {
        int one = 1;

        while(num>1) {
            if(num%2==1) {
                one++;
            }
            num/=2;
        }
        return one;
    }
}