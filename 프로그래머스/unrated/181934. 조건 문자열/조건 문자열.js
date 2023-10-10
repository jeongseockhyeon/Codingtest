function solution(ineq, eq, n, m) {
    const eqOption = ineq+eq
   if (eqOption === ">="){
       return n>=m ? 1 : 0
   }
    if (eqOption === "<="){
        return n<=m ? 1 : 0
    }
    if (eqOption === ">!"){
        return n>m ? 1 : 0
    }
    if (eqOption === "<!"){
        return n<m ? 1: 0
    }
       
}