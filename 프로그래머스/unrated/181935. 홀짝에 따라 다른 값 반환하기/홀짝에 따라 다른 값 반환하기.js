function solution(n) {
      let t = 0
    if (n % 2 !== 0){
        for (i=1;i<(n+1);i++){
            if (i%2 !== 0){
                t += i
            }
        }
        return t
    } else {
        for (i=1;i<(n+1);i++){
            if (i%2 === 0){
                t += i*i
            }
        }
        return t
    }
}