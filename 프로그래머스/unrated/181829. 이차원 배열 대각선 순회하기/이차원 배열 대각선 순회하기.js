function solution(board, k) {
    var answer = 0;
    const iLength = board.length
    for ( let i = 0 ; i < iLength ; i++ ){
        const jLength = board[i].length
        for( let j = 0 ; j < jLength; j++ ){
            if ( i + j <=k ){
                answer += board[i][j]
            }
        }
    }
    return answer;
}