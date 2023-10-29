function solution(n) {
    var answer = [];
    while (n !== 1){
        if(n%2===0){
            answer.push(n)
            n=n/2
        }
        else {
            answer.push(n)
             n = 3*n+1
        }
    }
    answer.push(n)
    return answer;
}