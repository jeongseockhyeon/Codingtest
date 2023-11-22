function solution(n_str) {
    var answer = '';
    while(true){
        if(!n_str.startsWith('0')) break
        if(n_str.startsWith('0')) {
            const strArr = [...n_str]
            strArr.splice(0,1,)
            n_str = strArr.join('')
        }
    }
    return n_str;
}