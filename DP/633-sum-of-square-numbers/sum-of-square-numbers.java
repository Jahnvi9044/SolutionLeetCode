class Solution {
    public boolean judgeSquareSum(int c) {
    
        
        if(c==0||c==1||c==2)
        return true;

     for(long i = 2 ; i*i<=c; i++)
     {  
        long d = c-i*i;
        d = (long)Math.sqrt(d);
        if(d*d+i*i==c)
          return true;
     }
        return false; 
    }
}