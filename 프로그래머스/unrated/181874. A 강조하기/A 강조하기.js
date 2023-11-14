function solution(myString) {
    var answer = '';
    let strArr = [...myString]
    const Length = strArr.length
    
    for ( let i = 0 ; i < Length ; i++ ){
        if ( strArr[i] === "a" || strArr[i] === "A") {
            answer += strArr[i].toUpperCase()
        }
        else answer += strArr[i].toLowerCase()
    }
    return answer;
}