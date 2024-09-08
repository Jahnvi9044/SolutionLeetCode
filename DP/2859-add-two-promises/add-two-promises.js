/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */

var addTwoPromises = async function(promise1, promise2) {

   let ans = 0 ;
   ans += await promise1;
   ans += await promise2;
   console.log(ans );
   
   const pr = new Promise((response, reject)=>{
  
    response(ans ) 

  }); 

   return pr ;   
};



/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */


