class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
           int n = nums1.length; 
           int m = nums2.length;
           int l = (m<n)?m:n; 
         int[] arr = new int[l]; 
         int k =0;
        for( int i = 0 ; i<n ; i++ )
        {
            for( int j = 0 ; j<m ; j++ )
            {
                 
             if(nums1[i]==nums2[j])
              { arr[k]=nums1[i];
                k++;
                nums1[i]= -1;
                nums2[j]= -1;
                break;
              }
            }           
             
        }

        int[] ans = new int[k];
        for(int i = 0 ;i<k;i++)
        {
             ans[i]=arr[i];
        }

        return ans;
    }
}