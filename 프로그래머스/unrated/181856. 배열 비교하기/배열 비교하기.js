function solution(arr1, arr2) {
    const arr1Length = arr1.length
    const arr2Length = arr2.length
    if (arr1Length > arr2Length) return 1
    else if (arr1Length < arr2Length) return -1
    else {
        let arr1sum = arr1.reduce((acc,cur) => {
            acc += cur
            return acc
        },0)
        let arr2sum = arr2.reduce((acc,cur)=>{
            acc += cur
            return acc
        },0)
        if ( arr1sum > arr2sum ) return 1
        else if (arr1sum < arr2sum ) return -1
        else return 0
    }
}