function solution(binomial) {
    var answer = 0;
    let a =''
    let op =''
    let b =''
    let j = 0
    const Length = binomial.length
    for ( let i = 0 ; i < Length ; i++ ){
        if ( binomial[i] === " " ) j++
        if ( binomial[i] !== " " && j === 0){
            a += binomial[i]
        }
        if ( binomial[i] !== " " && j === 1){
            op += binomial[i]
        }
        if ( binomial[i] !== " " && j === 2){
            b += binomial[i]
        }
    }
    if ( op === '+') answer = Number(a) + Number(b)
    else if ( op === '-') answer = Number(a) - Number(b)
    else if ( op === '*') answer = Number(a) * Number(b)
    return answer;
}