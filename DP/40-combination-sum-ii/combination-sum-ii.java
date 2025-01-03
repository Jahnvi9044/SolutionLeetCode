class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {


        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum2( 0 , candidates, target,0,ans, arr);
        return ans;

    }

    public void combinationSum2(int i ,int[] candidates, int target,int sum,List<List<Integer>> ans, ArrayList<Integer> arr)
    {
        
      
            if(sum==target)
            {
                ans.add(new ArrayList<Integer>(arr));
                return ;
            }

        if(sum>target)
          return ;
        
        for(int j = i; j<candidates.length ; j++)
        {

         if(i!=j && candidates[j]==candidates[j-1])
           continue;  
         if(candidates[j]>target)
          continue ;    
         arr.add(candidates[j]); 
         combinationSum2(j+1,candidates,target,sum+candidates[j],ans,arr);
         arr.remove(arr.size()-1); 
        }
        return ;
    }

}