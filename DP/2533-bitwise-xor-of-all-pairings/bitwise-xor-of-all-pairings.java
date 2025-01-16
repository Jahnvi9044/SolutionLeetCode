class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        
      

      int n1 = nums1.length;
      int n2 = nums2.length;
 
        int ans = 0;
       if(n1%2==1)
       {
        for(int j : nums2)
           ans = ans^j ;      
       }
       if(n2%2==1)
       {
        for(int j :nums1)
        {
            ans = ans^j ; 
        }
       }

       return ans ; 
        
    }
}