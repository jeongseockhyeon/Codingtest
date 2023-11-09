function solution(arr) {
    var answer = [];
    const  Length = arr.length
    for ( let i = 0 ; i < Length ; i++){
        if ( arr[i] >= 50 && arr[i] % 2 === 0){
            answer.push(arr[i] / 2)
        }
        else if ( arr[i] < 50 && arr[i] % 2 !== 0 ) {
            answer.push(arr[i] * 2)
        }
        else answer.push(arr[i])
    }
    return answer;
}