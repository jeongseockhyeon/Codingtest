function solution(l, r) {
    var answer = [];
    
    for(let i=l;i<=r;i++){
        let n = String(i)
        if([...n].every(x => x==='5'||x==='0')) answer.push(i)
    }
    if (answer.length === 0) answer.push(-1)
    return answer;
}