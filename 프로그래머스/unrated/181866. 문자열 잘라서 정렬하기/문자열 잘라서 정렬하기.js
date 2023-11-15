function solution(myString) {
    var answer = [];
    let str = ''
    let Length = myString.length
    for ( let i = 0 ; i < Length ; i++ ){
        if( myString[i] !== 'x'){
            str += myString[i]
        }
        if ( myString[i] === 'x'&& str.length > 0 ){
            answer.push(str)
            str = ''
        }
        if ( i === Length-1 && str.length > 0 ){
            answer.push(str)
        }
    }
    return answer.sort();
}