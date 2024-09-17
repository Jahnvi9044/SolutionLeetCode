class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        ArrayList<Integer> ds = new ArrayList<Integer>();
            
       int n= nums.length ;
       List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        subset( nums , 0 , ds, n , ans   );    
       
       return ans ;
        
    }


   public void  subset(int[] nums,int i ,ArrayList<Integer> ds, int n , List<List<Integer>> ans )
   {
      if( i == n )
      { 
        if(!ans.contains(ds))
        { 
             ans.add(new ArrayList<Integer>(ds));
        }
        return ;
      }
     //pick
     ds.add(nums[i]);
     subset(nums,i+1,ds,n,ans);
     //un-pick 
     ds.remove((Integer)nums[i]);
     subset(nums,i+1,ds,n,ans);
    

   }
    
}