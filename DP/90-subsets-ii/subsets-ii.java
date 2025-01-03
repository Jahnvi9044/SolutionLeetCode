class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

      ArrayList<Integer> arr = new ArrayList<Integer>();

      List<List<Integer>> ans = new ArrayList<>();
      Arrays.sort(nums);
      SubsetWithDuplicate(nums,0,nums.length,arr,ans);
      
      return ans ;

    }


    public void SubsetWithDuplicate(int [] nums , int i , int n, ArrayList<Integer> arr ,List<List<Integer>> ans )
    {
        ans.addFirst(new ArrayList<Integer>(arr)); 
         for(int j = i ;j<n ;j++)
         {
            if(i!=j && nums[j]==nums[j-1])
              continue ; 
            arr.add(nums[j]);
            SubsetWithDuplicate(nums,j+1,n,arr,ans);   
            arr.remove(arr.size()-1);
          
         }

        
         return ;
    }
}