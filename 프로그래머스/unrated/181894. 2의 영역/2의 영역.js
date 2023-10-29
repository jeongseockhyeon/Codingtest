function solution(arr) {
    // indexOf() 메서드는 배열에서 주어진 요소를 찾을 수 있는 첫 번째 인덱스를 반환하고, 찾을 수 없는 경우 -1을 반환
    const startIndex = arr.indexOf(2)
    //뒤에서 주어진 요소를 탐색
    const endIndex = arr.lastIndexOf(2)
    return startIndex+endIndex >= 1 ? arr.slice(startIndex,endIndex+1):[-1] ;
}