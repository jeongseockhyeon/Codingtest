function solution(num_list, n) {
    return  num_list.filter((data,index)=>index%n === 0);
}