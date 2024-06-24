import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int midle = s.length() / 2;
        if(s.length() % 2 == 0){
            for(int i = midle-1; i <= midle; i++){
                answer += s.charAt(i);
            }
        } else {
            answer += s.charAt(midle);
        }
        return answer;
    }
}