function solution(myString, pat) {
    const x = myString.lastIndexOf(pat)
    return myString.slice(0,x+pat.length);
}