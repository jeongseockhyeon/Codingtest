function solution(arr) {
    let n = arr.length
    let m = arr[0].length
    if ( n > m ){
        for ( let i = 0 ; i < n; i++ ) {
            for ( let j = m ; j < n ; j++) arr[i].push(0)
        }
    }
   if ( n < m ){
       while ( n !== m ) {
           arr.push(Array(m).fill(0))
           n++
       }
   }
    
    return arr;
}