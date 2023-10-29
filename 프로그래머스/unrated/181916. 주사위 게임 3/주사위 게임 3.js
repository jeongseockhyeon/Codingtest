function solution(a, b, c, d) {
    var answer = 0;
    // 다 같음
    if (a===b&&b===c&&c===d) answer = 1111*a
    // 3개만 같음
    else if (a===b&&b===c) answer=(10*a+d)**2
    else if (a===c&&c===d) answer=(10*a+b)**2
    else if (a===b&&b===d) answer=(10*a+c)**2
    else if (b===c&&c===d) answer=(10*b+a)**2
    //2개씩 같음
    else if (a===b&&c===d) answer=(a+c)*Math.abs(a-c)
    else if (a===c&&b===d) answer=(a+b)*Math.abs(a-b)
    else if (a===d&&b===c) answer=(a+b)*Math.abs(a-b)
    //2개만 같음
    else if(a===b) answer=c*d
    else if(a===c) answer=b*d
    else if(a===d) answer=c*b
    else if(b===c) answer=a*d
    else if(b===d) answer=a*c
    else if(c===d) answer=a*b
    //다 다름
    else answer = Math.min(a,b,c,d)
    
    return answer;
}