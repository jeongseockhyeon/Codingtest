import java.util.*;
class Solution {
    boolean solution(String s) {
        
        
        int[] cnt = new int[2];
        
        
         for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(Character.toLowerCase(ch) == 'p'){
                cnt[0]++;
            } else if (Character.toLowerCase(ch) == 'y'){
                cnt[1]++;
            }
        }
        boolean answer = cnt[0] == cnt[1];
        
        return answer;
    }
}