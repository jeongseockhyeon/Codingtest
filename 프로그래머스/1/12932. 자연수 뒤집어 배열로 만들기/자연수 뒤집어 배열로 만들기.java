class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        int length = 0;
        long num = n;
        
        while(num > 0){
            length++;
            num = num/10;
            
        }
        
        answer = new int[length];
        
        for(int i = 0 ; i < length ; i++){
            answer[i] = (int)(n % 10);
            n = n / 10;
        }
        
        return answer;
    }
}