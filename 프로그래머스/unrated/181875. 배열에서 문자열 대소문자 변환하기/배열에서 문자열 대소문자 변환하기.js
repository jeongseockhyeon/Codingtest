function solution(strArr) {
    var answer = [];
    const Length = strArr.length
    for ( let i = 0; i < Length ; i++ ){
        if ( (i+1) % 2 === 0 ) {
            answer.push(strArr[i].toUpperCase())
        }
        else answer.push(strArr[i].toLowerCase())
    }
    return answer;
}