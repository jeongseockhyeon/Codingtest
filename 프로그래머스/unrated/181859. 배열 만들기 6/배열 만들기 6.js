function solution(arr) {
    let stk = [];
    const Length = arr.length
    for ( let i = 0 ; i < Length ; i++){
        let stkLength = stk.length
        if ( stkLength === 0 ) stk.push(arr[i])
        else {
            if (stk[stkLength - 1] === arr[i]) stk.pop()
            else stk.push(arr[i])
        }
    }
    return stk.length === 0 ? [-1]:stk;
}