function solution(num_list) {
    var answer = [...num_list]
    answer.sort(function(a,b){
                return a-b
                })
    answer.splice(0,5)
    return answer;
}