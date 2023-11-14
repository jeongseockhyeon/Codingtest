function solution(myString, pat) {
    var answer = 0;
    let Length = myString.length
    for ( let i = 0 ; i < Length ; i++ ){
        const match = myString.slice(i,i+pat.length)
        if (match.endsWith(pat)) answer++
    }
    return answer;
}