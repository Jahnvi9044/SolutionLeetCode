/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {

 let filtered = [] ; 
 
 arr.forEach((item, ind, arr)=>{
    if(fn(item,ind))
    {
      filtered.push(item);
    }
 });

 return filtered ; 


};