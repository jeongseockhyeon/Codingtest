function solution(arr) {
    let preArray = arr
    let x = 0
    const  Length = arr.length
    while (true){
        const changeArray = preArray.map( data => {
            if(data >= 50 && data % 2 === 0) return data/2
            if(data < 50 && data % 2 === 1) return data*2+1
            return data
        })
        const equal = preArray.every((data,i) => data === changeArray[i] )
        if (equal) break
        x++
        preArray = changeArray
    }
    return x;
}