class Solution {
    public int mySqrt(int x) {
    
    int ans = 0;

    int low = 0, high = x,mid=0;
    while(low<=high)
    {   
        mid = low+(high-low)/2;
        
        if( (long)mid*mid<=x )
        { 
            ans = mid;
            low = mid+1; 
        }
        else 
        {
            high = mid-1;
        }

    } 

    return ans ;
       
    
    
    }
}
