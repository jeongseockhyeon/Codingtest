function solution(myString, pat) {
    var answer = 0;
    let Length =myString.length
    const strArr = [...myString]
    let changeArr = []
    for ( let i = 0 ; i < Length ; i++){
        if( strArr[i] === 'A') changeArr[i] = 'B'
        else changeArr[i] = 'A'
    }
    const changeString = changeArr.join('')
    changeString.includes(pat) ? answer = 1 : answer = 0
    return answer;
}