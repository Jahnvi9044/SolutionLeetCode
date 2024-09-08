/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
     
    
    let map = new Map();
    let callCount = 0 ;   


    // Map.set() , Map.get() , Map.delete() , Map.has
   

    return function(...args) 
    { 
    
    let ans = 0;
    let st = JSON.stringify(args);
         if(map.has(st))
         {
              ans = map.get(st)
         }
         else 
         { 
            callCount++ ; 
            ans = fn(...args);
            map.set(st,ans);
                
         }
       
        //  console.log(map);
         return ans ; 

       }
       
         
    
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */