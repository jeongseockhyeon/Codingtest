function solution(rank, attendance) {
    var answer = 0;
    let trueRank = []
    rank.map((data,i) =>{
        if(attendance[i]) trueRank.push(data)
    })
    trueRank.sort((a,b) => a-b)
    function Prt(i){
        return rank.indexOf(trueRank[i])
    }
    const a = Prt(0)
    const b = Prt(1)
    const c = Prt(2)
    
    answer=10000*a+100*b+c
    

    return answer;
}