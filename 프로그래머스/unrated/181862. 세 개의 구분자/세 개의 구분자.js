function solution(myStr) {
    var answer = [];
    const Length = myStr.length
    let str = ''
    const strArr = [...myStr]
    for ( let i = 0 ; i < Length ; i++ ){
        if ( strArr[i] !== 'a' && strArr[i] !== 'b' && strArr[i] !== 'c') {
            str += strArr[i]
        }
        if ( strArr[i] === 'a' || strArr[i] === 'b' || strArr[i] === 'c' ){
            if ( str.length > 0) {
                answer.push(str)
            }
            str=''
        }
        if ( i === Length-1 ) answer.push(str)
    }
    if ( str.length === 0 ) answer = ["EMPTY"]
    return answer;
}