function solution(arr) {
    var answer = [...arr]
    let i = 0
    while(true){
        let Length = answer.length
        if(Length === 2**i) break
        else if (Length > 2**i) i++
        else {
            const dif = (2**i) - Length
            for (let j = 0 ; j < dif ; j++){
                answer.push(0)
            }
        }
    }
    return answer;
}