/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
let ans = [];
  arr.forEach(( item, ind , arr )=>{
    let a = fn( item, ind , arr) ;
    ans.push(a) ; 

  });

      return ans ;
};