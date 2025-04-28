class Solution {
    public int mySqrt(int x) {
      int ans = 0;
     
      for(int i=0 ; i<=x ; i++)
        {  

            if((long)i*i <= x )
              ans = i ;
            
            else break;
 
        }

        return ans ;
        
    }
}