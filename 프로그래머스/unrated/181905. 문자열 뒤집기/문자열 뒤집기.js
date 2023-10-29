function solution(my_string, s, e) {
    var answer = '';
    let arr = [...my_string]
    let slice = arr.slice(s,e+1)
    let r = slice.reverse().join('')
    arr.splice(s,e-s+1,r)
    return arr.join('');
}