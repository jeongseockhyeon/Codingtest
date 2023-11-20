function solution(strArr) {
    let countArr = Array(30).fill(0)
    strArr.map(a => countArr[a.length-1]++)
    
    return Math.max(...countArr);
}