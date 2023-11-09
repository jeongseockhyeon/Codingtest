function solution(num_list) {
    const Length = num_list.length
    let answer = 0
    if (Length >= 11){
        answer = 0
        for ( let i = 0 ; i < Length ; i++){
            answer += num_list[i]
        }
    }
    else {
        answer = 1
        for ( let i = 0 ; i < Length ; i++) {
            answer = answer * num_list[i]
        }
    }
    return answer;
}