/**
 * @param {number} millis
 * @return {Promise}
 */
async function sleep(millis) {
     
   const pr = new Promise(function(response, reject){
    setTimeout(()=>{response(millis)},millis);
   })

   return pr ; 

}

/** 
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */