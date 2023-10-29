function solution(num_list) {
    let answer = [];
    const Length = num_list.length
    for (let i = 0 ; i < Length; i++ ){
        if (num_list[i] < 0 ){
            answer.push(i)
        }
    }
    if (answer.length === 0) return -1
    else return answer[0];
}