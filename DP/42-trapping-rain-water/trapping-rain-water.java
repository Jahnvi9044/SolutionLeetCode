class Solution {
    public int trap(int[] height) {
       int n=height.length;
        int l =0, r=n-1, lmax=0,rmax=0, res=0;
        while(l<=r)
        {
            if(lmax<=rmax)
            {
                if(lmax<=height[l])
                  lmax=height[l];
                else
                   res+=lmax-height[l]; 
                   
                   l++;
            }
            else {
                if(rmax<=height[r])
                    rmax=height[r];
                    
                 else
                    res+=rmax-height[r];
                    r--;
            }
        }

        return res;

    }
}