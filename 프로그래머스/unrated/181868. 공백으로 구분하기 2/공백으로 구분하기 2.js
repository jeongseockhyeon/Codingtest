function solution(my_string) {
    var answer = [];
    let str = ""
    let Length = my_string.length
    
    for ( let i = 0 ; i < Length ; i++ ){
        if ( my_string[i] !== " " )
            str += my_string[i]
        if ( my_string[i] === " " || i === Length-1 ) {
            if ( str.length > 0 ) answer.push(str)
             str =""
        }
    } 
    return answer;
}