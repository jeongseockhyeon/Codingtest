function solution(myString, pat) {
    var answer = 0;
    let Length =myString.length
    const strArr = [...myString]
    for ( let i = 0 ; i < Length ; i++){
        if( strArr[i] === 'A') strArr[i] = 'B'
        else strArr[i] = 'A'
    }
    const changeString = strArr.join('')
    changeString.includes(pat) ? answer = 1 : answer = 0
    return answer;
}