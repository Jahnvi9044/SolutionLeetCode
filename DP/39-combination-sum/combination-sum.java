class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target)
    {

        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
       combinationSum( 0 , candidates, target,0,ans, arr);
    return ans;

    }

    public void combinationSum(int i ,int[] candidates, int target,int sum,List<List<Integer>> ans, ArrayList<Integer> arr)
    {
        
       if(i==candidates.length)
        { 
            if(sum==target)
               ans.add(new ArrayList<Integer>(arr));

          return ;
        }

        if(sum>target)
          return ;

         arr.add(candidates[i]); 
         combinationSum(i,candidates,target,sum+candidates[i],ans,arr);

         arr.remove(arr.size()-1);
         combinationSum(i+1,candidates,target,sum,ans,arr);
         
         return ;
    }

}