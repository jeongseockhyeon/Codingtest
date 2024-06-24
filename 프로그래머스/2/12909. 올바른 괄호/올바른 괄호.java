class Solution {
    boolean solution(String s) {
        boolean answer = false;
        
        int openCount = 0;
        int closeCount = 0;
        
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '('){
                openCount++;
            } else {
                closeCount++;
            }
            if (openCount < closeCount){
                return false;
            }
        }
        if (openCount == closeCount){
            return true;
        }

        return answer;
    }
}