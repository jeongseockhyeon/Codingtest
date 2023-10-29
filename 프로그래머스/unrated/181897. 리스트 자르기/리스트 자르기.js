function solution(n, slicer, num_list) {
    var answer = [];
    let a = slicer[0]
    let b = slicer[1]
    let c = slicer[2]
    switch (n){
        case 1: 
            return num_list.slice(0,b+1)
            break
        case 2: 
            return num_list.slice(a,)
            break
        case 3: 
            return num_list.slice(a,b+1)
            break
        case 4:
            answer = num_list.slice(a,b+1)
            return answer.filter((data,index)=>index%2 === 0)
            break
    }
}