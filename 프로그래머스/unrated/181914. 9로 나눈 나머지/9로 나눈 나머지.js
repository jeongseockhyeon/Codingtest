function solution(number) {
    var answer = 0;
    let x = 0
    for(let i = 0;i<number.length;i++){
        x += Number(number[i])
    }
    answer = x % 9
    return answer;
}