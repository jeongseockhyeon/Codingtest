function solution(my_string, indices) {
    let arr = [...my_string]
      for ( let i = 0 ; i < indices.length ; i++ ){
        arr.splice(indices[i],1,0)
    }
    let farr = arr.filter(i => i !== 0)
    return farr.join('');
}