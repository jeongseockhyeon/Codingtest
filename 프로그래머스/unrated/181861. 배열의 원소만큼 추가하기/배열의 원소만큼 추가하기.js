function solution(arr) {
    var answer = [];
    const Length = arr.length
    for ( let i = 0 ; i < Length ; i++ ){
        for ( let j = 0 ; j < arr[i]; j++){
            answer.push(arr[i])
        }
    }
    return answer;
}