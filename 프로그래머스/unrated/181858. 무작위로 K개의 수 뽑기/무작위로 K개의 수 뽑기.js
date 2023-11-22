function solution(arr, k) {
    var answer = []
    for ( let i = 0 ; i < arr.length ; i++){
        if (answer.length === k ) break
        if (!answer.includes(arr[i])) answer.push(arr[i])
    }
    while (true){
        if (answer.length === k) break
        answer.push(-1)
    }
    return answer
}