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
         if(i==n)
         {
            if(!ans.contains(arr))
            {
                ans.addFirst(new ArrayList<Integer>(arr));
            }
            return ;
         }
         
         //take
         arr.add(nums[i]);
         SubsetWithDuplicate(nums,i+1,n,arr,ans);   
 
         //not take
         arr.remove(arr.size()-1);
         SubsetWithDuplicate(nums,i+1,n,arr,ans);
         return ;
    }
}