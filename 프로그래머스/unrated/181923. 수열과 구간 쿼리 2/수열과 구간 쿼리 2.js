function solution(arr, queries) {
    var answer = [];
    for (let i = 0;i<queries.length;i++){
        let k = queries[i][2]
        let f = []
        for(let j=queries[i][0];j<queries[i][1]+1;j++){
            if(arr[j]>k){
                f.push(arr[j])
            }
        }
        if(f.length>0) answer.push(Math.min(...f))
        else answer.push(-1)
    }
    return answer;
}