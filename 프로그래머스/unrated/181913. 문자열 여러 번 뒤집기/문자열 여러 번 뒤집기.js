function solution(my_string, queries) {
    for(let i=0;i<queries.length;i++){
        let x = [...my_string]
        let s = x.slice(queries[i][0],queries[i][1]+1)
        let r = s.reverse().join('')
        x.splice(queries[i][0],queries[i][1]-queries[i][0]+1,r)
        my_string=x.join('')
        
    }
    return my_string;
}