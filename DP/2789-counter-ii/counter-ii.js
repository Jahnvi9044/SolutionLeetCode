/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    
     i = init ;
    return {
      
        increment:()=> ++i,
        decrement:()=> --i,
        reset:()=>{ 
            i=init
            return i;
        }

    }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */