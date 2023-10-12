function solution(num_list) {
    let x = ''
    let y = ''
    for(let i=0;i<num_list.length;i++){
        if(num_list[i]%2 === 1) x += num_list[i]
        else y += num_list[i]
    }
    sum = Number(x)+Number(y)
    return sum
}