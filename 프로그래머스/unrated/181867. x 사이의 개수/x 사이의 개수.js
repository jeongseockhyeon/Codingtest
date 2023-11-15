function solution(myString) {
    var answer = [];
    const Length = myString.length
    let j = 0
    for ( let i = 0 ; i < Length ; i++ ){
        if ( myString[i] !== "x"){
            j++
        }
        if ( myString[i] === "x" ){
            answer.push(j)
            j = 0
        }
        if ( i === Length-1) answer.push(j)
    }
    return answer;
}