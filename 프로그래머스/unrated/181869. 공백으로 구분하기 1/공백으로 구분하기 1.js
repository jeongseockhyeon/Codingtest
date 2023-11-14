function solution(my_string) {
    var answer = [];
    let str =""
    const Length = my_string.length
    for ( let i = 0 ; i < Length ; i++ ){
        if(my_string[i] !== " ")
            str += my_string[i]
        if (my_string[i+1] === " " || i === Length-1) {
            answer.push(str)
            str = ""
        }
    }
    return answer;
}