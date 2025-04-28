class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        

        for(int i=0;i<piles.length;i++)
        {
            max=Math.max(max,piles[i]);
        }
        


        int low = 1, high = max,mid=0;
        while(low<=high)
        {  
           mid= low+(high-low)/2;
          long bananas = total_hrs(mid, piles);

            if(bananas<=h)
            {
                high= mid-1;
            }
            else low = mid+1;
        }
        return low;
    }

    public long total_hrs(int bananas , int[] piles )
    {  long total = 0;
        for(int i = 0 ; i<piles.length;i++)
        {
             int d = piles[i]/bananas;
            if(d*bananas!=piles[i])
              d++;
            total+=d;  
        }

        return total;
    }
}