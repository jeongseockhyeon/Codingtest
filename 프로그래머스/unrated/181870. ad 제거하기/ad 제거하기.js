function solution(strArr) {
    var answer = [];
    const Length = strArr.length
    for ( let i = 0 ; i < Length ; i++ ){
        if (!strArr[i].includes("ad")) answer.push(strArr[i])
    }
    return answer;
}