function solution(intStrs, k, s, l) {
    var answer = [];
    for(let i=0;i<intStrs.length;i++){
        n=Number(intStrs[i].slice(s,s+l))
        if(n>k) answer.push(n)
    }
    return answer;
}