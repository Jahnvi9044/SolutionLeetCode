class Solution {
    public boolean isPowerOfTwo(int n) {
       
        if(n<=(-2^31))
          return false;
        if(n==0)
         return false;
        if((n&(n-1))==0)
         return true;
        else 
         return false;  

      
    }
}