class Solution {
    public int minDays(int[] bloomDay, int m, int k)
    {    int high=bloomDay[0];
         int low=0;
         int n=bloomDay.length;
        for(int i=1;i<n;i++)
        {    
              if(high<bloomDay[i])
                 high=bloomDay[i];
        }
          if( (long)k*m > n) return -1;
        int mid,ans=0;
        while(low<=high)
        {
           mid=low+(high-low)/2;            
           int z=func(bloomDay,k,m,mid,n) ;
           if(z==1) 
           { ans=mid;
             high=mid-1;
           }
            else  
             low=mid+1;
        } return low;
    }

    public static int func(int[] arr, int k,int m,int mid,int n)
    {   int count=0,c=0,i=0;
        while(i<n)
        {
            if(arr[i]<=mid)
            {
                count++;
                if(count==k)
                 {
                     count=0;
                     c++;
                 }
            }
            else if(arr[i]>mid)
               count=0;
            i++;   
        }
        if(c>=m) return 1;
        return 0;
    }
}