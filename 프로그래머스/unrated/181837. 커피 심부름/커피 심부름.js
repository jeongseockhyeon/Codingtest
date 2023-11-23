function solution(order) {
    var answer = 0;
    order.map (data => {
        if (data.includes("americano")) answer += 4500
        else if (data.includes("cafelatte")) answer += 5000
        else answer += 4500
    })
    return answer;
}