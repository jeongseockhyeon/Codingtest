function solution(str_list, ex) {
    var answer = '';
    str_list.map(data => {
        if(!data.includes(ex)) answer += data
    })
    return answer;
}