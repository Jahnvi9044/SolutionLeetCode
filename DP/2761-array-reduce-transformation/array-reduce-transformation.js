/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
  

    nums.forEach((item)=>{
        let val  = fn(init,item);
        init = val ;

    });  
    return init ; 
};




/*
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 
var reduce = function(nums, fn, init) {
   var  a=init;
    for(let i=0;i<nums.length;i++)
    {
        a=fn(a, nums[i]);
        
    }
    return a;
};
*/