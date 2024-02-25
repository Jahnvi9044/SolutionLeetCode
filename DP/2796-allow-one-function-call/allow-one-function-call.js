/**
 * @param {Function} fn
 * @return {Function}
 */
var once = function(fn) {
    var calls;
    return function(...args){   
      
       if(!calls)
        { var res = fn(...args);
          calls=1;
            return res;
        }
        else return undefined;   
           } 
};

/**
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */
