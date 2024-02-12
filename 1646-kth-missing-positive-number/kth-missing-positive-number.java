class Solution {
    public int findKthPositive(int[] arr, int k) {

         if(arr[0]>k) return k;
         
        int low=0,high=arr.length-1;
        int mid,ans=0;

       
        while(low<=high)
        {
            mid=(low+high)/2;
            
           //missing =arr[mid]-(mid+1);
            if(arr[mid]-(mid+1) <k)
            {
                ans=mid+1;
                low=mid+1;
            }
            else high=mid-1;
    
        }
       
        return ans+k ;
    }
}