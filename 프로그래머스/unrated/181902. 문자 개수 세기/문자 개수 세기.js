function solution(my_string) {
    const answer = new Array(52).fill(0);
    
    //charCodeAt index에 해당하는 문자의 아스키코드 값을 리턴
    for(let i=0; i<my_string.length; i++){
        // A의 아스키값 65 부터 Z의 아스키값 90
        if(my_string.charCodeAt(i)>=65 &&my_string.charCodeAt(i)<=90){
            answer[my_string.charCodeAt(i)-65]++;
        }else{
            answer[my_string.charCodeAt(i)-71]++;
        }
    }
    return answer;
}