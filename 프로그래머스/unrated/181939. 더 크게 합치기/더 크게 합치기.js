function solution(a, b) {
    if (`${a}${b}` >= `${b}${a}`){
        c = Number(`${a}${b}`)
    } else {
        c = Number(`${b}${a}`)
    }
    var answer = c;
    return answer;
}