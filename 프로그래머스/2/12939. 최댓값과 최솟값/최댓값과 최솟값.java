class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        int maxNum = Integer.parseInt(str[0]);
        int minNum = Integer.parseInt(str[0]);
        int num;
        for(int i = 1; i < str.length; i++){
            num = Integer.parseInt(str[i]);
            minNum = Math.min(minNum,num);
            maxNum = Math.max(maxNum,num);
        }
        answer = minNum + " " + maxNum;
        return answer;
    }
}