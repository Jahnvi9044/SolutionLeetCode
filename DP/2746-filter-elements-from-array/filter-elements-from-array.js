/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {


            var filtered=[];
              var k=0;
            for(let i = 0;i<arr.length ; i++)
            {     
                if(fn(arr[i],i))
                  filtered[k++]=arr[i];
            }
                 
                 return filtered;
    
};