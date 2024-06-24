import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }
        
        int minNum = arr[0];
        int[] answer = new int[arr.length - 1];
        int idx = 0;
        
        for(int i = 1; i < arr.length; i++){
           minNum = Math.min(minNum,arr[i]);
        }
        
       for(int i = 0; i < arr.length; i++){
           if(arr[i] == minNum){
               continue;
           } else {
               answer[idx] = arr[i];
               idx++;
           }
       }
        return answer;
    }
}