function solution(arr, n) {
    var answer = [];
    const Length = arr.length
    if ( Length % 2 !== 0 ){
            arr.map((d,i)=>{
                if ( i % 2 === 0) answer.push(d+n)
                else answer.push(d)
            })
    }
    else {
           arr.map((d,i)=>{
                if ( i % 2 !== 0) answer.push(d+n)
                else answer.push(d)
            })
    }
    return answer;
}