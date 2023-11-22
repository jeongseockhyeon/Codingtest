function solution(arr, delete_list) {
    var answer = [];
    const Length = arr.length
    for ( let i = 0 ; i < Length ;i++){
        if(!delete_list.includes(arr[i])) answer.push(arr[i])
    }
    return answer;
}