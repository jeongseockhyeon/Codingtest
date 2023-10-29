function solution(arr, queries) {
    for(let i=0;i<queries.length;i++){
        let k = queries[i][2]
        for(let j=queries[i][0];j<queries[i][1]+1;j++){
            if(j%k===0) arr[j]++
        }
    }
    return arr;
}