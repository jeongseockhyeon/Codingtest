function solution(arr) {
    var answer = 0;
    const n = arr.length
    for ( let i = 0 ; i < n ; i++){
        for ( let j = 0 ; j < n ; j++ ){
            if( arr[i][j] ===arr[j][i] ){
                answer++
            }
        }
    }
    return answer === n**2 ? 1 : 0;
}