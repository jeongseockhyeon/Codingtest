class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String star = phone_number.substring(0,phone_number.length()-4).replaceAll("[0-9]","*");
        String lastNum = phone_number.substring(phone_number.length()-4,phone_number.length());
        
        answer = star + lastNum;
        return answer;
    }
}