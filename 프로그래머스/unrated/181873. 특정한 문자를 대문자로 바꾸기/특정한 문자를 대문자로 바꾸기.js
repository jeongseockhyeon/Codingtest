function solution(my_string, alp) {
    var answer = '';
    const strArr = [...my_string]
    const Length = strArr.length
    
    for( let i = 0 ; i < Length ; i++ ){
        if ( strArr[i] === alp ){
            answer += strArr[i].toUpperCase()
        } 
        else answer += strArr[i]
    }
    return answer;
}