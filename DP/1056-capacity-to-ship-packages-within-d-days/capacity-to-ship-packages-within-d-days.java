class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int max = Integer.MIN_VALUE;
       int n = weights.length;
       int sum = 0;
       for(int i :weights)
       {
         sum+=i;
         max = Math.max(max,i);
       }
       int low = max,high = sum,mid ;
    
       while(low<=high)
       { 
        mid = low + (high-low)/2;
          
        if(find_tf(mid,weights,days))
        {
            high = mid-1;
            System.out.println(mid);
        }
        else low = mid+1;
       }
       return low ;

    }

    public boolean find_tf(int mid, int[] weights , int days)
    {    int n =weights.length;
         int sum = 0,count=0;
        for(int i = 0;i<n;i++)
        {
            if(sum<mid)
            {
                sum+=weights[i];
            }
            if(sum>=mid) 
            {  count++;
                if(sum==mid)
                {
                    
                     sum=0;
                }
                else
                {         
                     sum=weights[i];   
                }  
                // sum -=mid;
            }
            
        }
        if(sum!=0)
        {
            count++;
        }
       
        return days>=count;
    }
}