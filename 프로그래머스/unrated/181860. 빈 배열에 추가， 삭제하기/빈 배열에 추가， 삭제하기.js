function solution(arr, flag) {
    var answer = [];
    const Length = arr.length
    const aL =answer.length
    for( let i = 0 ; i < Length ; i++){
        if(flag[i]===true) answer = answer.concat(new Array(arr[i]*2).fill(arr[i]))
        else answer.splice(aL-arr[i],arr[i])
    }
    return answer;
}