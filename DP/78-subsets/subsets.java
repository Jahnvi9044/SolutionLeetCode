class Solution {

    public List<List<Integer>> subsets(int[] nums) {
           List<List<Integer>>  list = new ArrayList();
            subset(0,nums,new ArrayList<Integer>(),list);

            return list;

    }

    private  void  subset( int i ,int[] nums,List<Integer> arr,List<List<Integer>> list)
    {  
        if(i==nums.length)
        {    list.add(new ArrayList<Integer>(arr));
              return ;
        }
         
         //take
         arr.add(nums[i]);
         subset(i+1,nums,arr,list);
         arr.remove(arr.size()-1);

         //not take
         subset(i+1,nums,arr,list);
    }
}